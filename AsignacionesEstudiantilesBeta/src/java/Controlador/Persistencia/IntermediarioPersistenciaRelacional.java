/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franco
 */
public abstract class IntermediarioPersistenciaRelacional extends IntermediarioPersistencia {

    @Override
    public List<Object> materializar(Expresion expresion) {
        List<Object> objetosList = new ArrayList<>();
        try {
            Connection conexion = FachadaPersistenciaInterna.getInstancia().getConexion();
            Statement st = conexion.createStatement();
            String consulta = armarConsultaSeleccion(expresion);
            System.out.println("Consulta="+consulta);
            ResultSet rs = st.executeQuery(consulta);
            objetosList = convertirRegistroAObjeto(rs);
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaRelacional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objetosList;
    }

    @Override
    public Object materializar(String oid) {
        Object objeto = null;
        try {
            Connection conexion = FachadaPersistenciaInterna.getInstancia().getConexion();
            Statement st = conexion.createStatement();
            String consulta = armarConsultaSeleccion(oid);
            System.out.println("Consulta="+consulta);
            ResultSet rs = st.executeQuery(consulta);
            List<Object> objectList = convertirRegistroAObjeto(rs);
            objeto = objectList.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaRelacional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objeto;
    }

    @Override
    public boolean desmaterializar(Object objeto){
        return false;
    }

    public abstract List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException;

    public abstract String convertirObjetoRegistro(Object objeto);

    public abstract String armarConsultaSeleccion(Expresion expresion);

    public abstract String armarConsultaSeleccion(String oid);

    public abstract String armarConsultaInsercion(Object objeto);

    public abstract String armarConsultaActualizacion(Object objeto);
    
    public String desarmarExpresion(Expresion expresion) {
        if (expresion.getClass() == CriterioCompuesto.class) {
            CriterioCompuesto criterioCompuesto = (CriterioCompuesto) expresion;
            Expresion expresionIzq = criterioCompuesto.getExpresionIzq();
            Expresion expresionDer = criterioCompuesto.getExpresionDer();
            String criterioIzqString = desarmarExpresion(expresionIzq);
            String criterioDerString = desarmarExpresion(expresionDer);
            return "(" + criterioIzqString + criterioCompuesto.getOperadorLogico() + " " + criterioDerString + ")";
        } else {
            Criterio criterio = (Criterio) expresion;
            String criterioString = "";
            if (criterio.getValor().getClass() == String.class) {
                criterioString = criterio.getAtributo() + " ";
                criterioString += criterio.getOperador() + " '";
                criterioString += criterio.getValor() + "' ";
            } else {
                criterioString = desarmarCriterioPorObjeto(criterio);
            }
            return criterioString;
        }

    }
    
    public abstract String desarmarCriterioPorObjeto(Criterio criterio);
}

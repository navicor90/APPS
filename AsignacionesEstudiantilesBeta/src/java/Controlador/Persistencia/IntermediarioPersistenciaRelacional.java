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
            ResultSet rs = st.executeQuery(consulta);
            objetosList = convertirRegistroAObjeto(rs);
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaRelacional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objetosList;
    }

    @Override
    public Object materializar(String oid) {
        return null;
    }

    @Override
    public boolean desmaterializar(Object objeto){
        return false;
    }

    public abstract List<Object> convertirRegistroAObjeto(ResultSet a) throws SQLException;

    public abstract String convertirObjetoRegistro(Object obj);

    public abstract String armarConsultaSeleccion(Expresion cri);

    public abstract String armarConsultaSeleccion(String oid);

    public abstract String armarConsultaInsercion(Object objInsert);

    public abstract String armarConsultaActualizacion(Object objUpdate);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteContrato;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionContrato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franco
 */
public class IntermediarioPersistenciaContrato extends IntermediarioPersistenciaRelacional{
     @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> contratoList = new ArrayList<>();
        while (rs.next()) {
            AgenteContrato contratoAgente = new AgenteContrato();
            ImplementacionContrato contratoImplementacion = new ImplementacionContrato();
            contratoAgente.setImplementacionContrato(contratoImplementacion);
            contratoAgente.setOid(rs.getString("OIDContrato"));
            contratoAgente.setCodigoContrato(rs.getInt("codigoContrato"));
            contratoAgente.setFechaEmisionContrato(rs.getDate("fechaEmisionContrato"));
            contratoList.add(contratoAgente);
        }
        return contratoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.contratos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        throw new UnsupportedOperationException("No implementado"); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.contratos WHERE OIDContrato='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objeto) {
        throw new UnsupportedOperationException("No implementado"); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        return null;
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        String criterioString="";
        switch(criterio.getAtributo()){
            case "postulacion":
                criterioString = "OIDPostulacion";
                break;
            default:
                return "";
        }
        criterioString += criterio.getOperador();
        Agente agente = (Agente) criterio.getValor();
        criterioString += "'"+agente.getOid()+"'";
        
        return criterioString;
    }
}

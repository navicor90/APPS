/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteContratoEstado;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionContratoEstado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaContratoEstado extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> contratoEstadosList = new ArrayList<>();
        while (rs.next()) {
            AgenteContratoEstado contratoEstadosAgente = new AgenteContratoEstado();
            ImplementacionContratoEstado contratoEstadosImplementacion = new ImplementacionContratoEstado();
            contratoEstadosAgente.setImplementacionContratoEstado(contratoEstadosImplementacion);
            contratoEstadosAgente.setOid(rs.getString("OIDContratoEstado"));
            contratoEstadosAgente.setFechaHoraCambioEstado(rs.getDate("fechaHoraCambioEstado"));
            contratoEstadosAgente.setOidContrato(rs.getString("OIDContrato"));
            contratoEstadosAgente.setOidTipoEstadoContrato(rs.getString("OIDTipoEstadoContrato"));
            contratoEstadosList.add(contratoEstadosAgente);
        }
        return contratoEstadosList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.contratoEstados WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        //sin implementar persistirObjetosInternos IntermediarioPersistenciaContratoEstados
        System.out.println("        sin implementar persistirObjetosInternos IntermediarioPersistenciaContratoEstados");
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.contratoEstados WHERE OIDContratoEstado='" + oid + "'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaActualizacion(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        String criterioString = "";
        switch (criterio.getAtributo()) {
            case "contrato":
                criterioString = "OIDContrato";
                break;
            case "tipoEstadoContrato":
                criterioString = "OIDTipoEstadoContrato";
                break;
            default:
                return "";
        }
        criterioString += criterio.getOperador();
        Agente agente = (Agente) criterio.getValor();
        criterioString += "'" + agente.getOid() + "'";

        return criterioString;
    }
}

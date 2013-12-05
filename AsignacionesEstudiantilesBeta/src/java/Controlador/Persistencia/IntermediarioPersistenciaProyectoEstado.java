/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteProyectoEstado;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionProyectoEstado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaProyectoEstado extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> proyectoEstadoList = new ArrayList<>();
        while (rs.next()) {
            AgenteProyectoEstado proyectoEstadoAgente = new AgenteProyectoEstado();
            ImplementacionProyectoEstado proyectoEstadoImplementacion = new ImplementacionProyectoEstado();
            proyectoEstadoAgente.setImplementacionProyectoEstado(proyectoEstadoImplementacion);
            proyectoEstadoAgente.setOid(rs.getString("OIDProyectoEstado"));
            proyectoEstadoAgente.setFechaHoraCambio(rs.getDate("fechaHoraCambio"));
            proyectoEstadoAgente.setOidProyecto(rs.getString("OIDProyecto"));
            proyectoEstadoAgente.setOidTipoEstadoProyecto(rs.getString("OIDTipoEstadoProyecto"));
            proyectoEstadoList.add(proyectoEstadoAgente);
        }
        return proyectoEstadoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.proyectoEstados WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {

    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.proyectoEstados WHERE OIDProyectoEstados='" + oid + "'";
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
            case "tipoEstadoAcademico":
                criterioString = "OIDTipoEstadoAcademico";
                break;
            case "proyecto":
                criterioString = "OIDProyecto";
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

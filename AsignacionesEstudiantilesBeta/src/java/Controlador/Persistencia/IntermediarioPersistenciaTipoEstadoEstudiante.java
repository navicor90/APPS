/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.AgenteTipoEstadoEstudiante;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionTipoEstadoEstudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoEstadoEstudiante extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoEstadoList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoEstadoEstudiante tipoEstadoEstudianteAgente = new AgenteTipoEstadoEstudiante();
            ImplementacionTipoEstadoEstudiante tipoEstadoEstudianteImplementacion = new ImplementacionTipoEstadoEstudiante();
            tipoEstadoEstudianteAgente.setImplementacionTipoEstadoEstudiante(tipoEstadoEstudianteImplementacion);
            tipoEstadoEstudianteAgente.setOid(rs.getString("OIDTipoEstadoEstudiante"));
            tipoEstadoEstudianteAgente.setNombreTipoEstadoEstudiante(rs.getString("nombreTipoEstadoEstudiante"));
            tipoEstadoList.add(tipoEstadoEstudianteAgente);
        }
        return tipoEstadoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoEstadoEstudiantes WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.tipoEstadoEstudiantes WHERE OIDTipoEstadoEstudiante='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteTipoEstadoEstudiante agente = (AgenteTipoEstadoEstudiante) objInsert;
        String sql = "INSERT INTO  AE.tipoEstadoEstudiantes (OIDTipoEstadoEstudiante ,nombreTipoEstadoEstudiante)VALUES ('"
                +agente.getOid()+"',  '"+agente.getNombreTipoEstadoEstudiante()+"')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
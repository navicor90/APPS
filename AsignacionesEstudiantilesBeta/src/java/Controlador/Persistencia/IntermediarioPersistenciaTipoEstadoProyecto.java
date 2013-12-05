/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteTipoEstadoProyecto;

import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionTipoEstadoProyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoEstadoProyecto extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> proyectoEstadoList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoEstadoProyecto tipoEstadoProyectoAgente = new AgenteTipoEstadoProyecto();
            ImplementacionTipoEstadoProyecto tipoEstadoProyectoImplementacion = new ImplementacionTipoEstadoProyecto();
            tipoEstadoProyectoAgente.setImplementacionTipoEstadoProyecto(tipoEstadoProyectoImplementacion);
            tipoEstadoProyectoAgente.setOid(rs.getString("OIDtipoEstadoProyecto"));
            tipoEstadoProyectoAgente.setNombreTipoEstadoProyecto(rs.getString("nombre"));
            tipoEstadoProyectoAgente.setDescripcion(rs.getString("descripcion"));
            proyectoEstadoList.add(tipoEstadoProyectoAgente);
        }
        return proyectoEstadoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoEstadoProyectos WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {

    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.tipoEstadoProyectos WHERE OIDtipoEstadoProyecto='" + oid + "'";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

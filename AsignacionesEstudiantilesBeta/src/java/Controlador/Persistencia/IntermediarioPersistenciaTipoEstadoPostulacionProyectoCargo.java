/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgentePostulacion;
import Modelo.Agente.AgenteTipoEstadoPostulacionProyectoCargo;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionPostulacion;
import Modelo.implementacion.ImplementacionTipoEstadoPostulacionProyectoCargo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoEstadoPostulacionProyectoCargo extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoEstadoPostulacionProyectoCargoList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargoAgente = new AgenteTipoEstadoPostulacionProyectoCargo();
            ImplementacionTipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargoImplementacion = new ImplementacionTipoEstadoPostulacionProyectoCargo();
            tipoEstadoPostulacionProyectoCargoAgente.setImplementacionTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargoImplementacion);
            tipoEstadoPostulacionProyectoCargoAgente.setOid(rs.getString("OIDTipoEstadoPostulacionProyectoCargo"));
            tipoEstadoPostulacionProyectoCargoAgente.setDescripcion(rs.getString("descripcionTipoEstadoPostulacionProyectoCargo"));
            tipoEstadoPostulacionProyectoCargoAgente.setNombreEstado(rs.getString("nombreTipoEstadoPostulacionProyectoCargo"));
            tipoEstadoPostulacionProyectoCargoList.add(tipoEstadoPostulacionProyectoCargoAgente);
        }
        return tipoEstadoPostulacionProyectoCargoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoEstadoPostulacionProyectoCargos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.tipoEstadoPostulacionProyectoCargos WHERE OIDPostulacion='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        return null;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        return null;
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        return "";
    }
}
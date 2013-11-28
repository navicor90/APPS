/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;


import Modelo.Agente.AgenteProyectoCargo;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionProyectoCargo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaProyectoCargo extends IntermediarioPersistenciaRelacional{

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> proyectoCargosList = new ArrayList<>();
        while (rs.next()) {
            AgenteProyectoCargo proyectoCargoAgente = new AgenteProyectoCargo();
            ImplementacionProyectoCargo proyectoCargoImplementacion = new ImplementacionProyectoCargo();
            proyectoCargoAgente.setImplementacionProyectoCargo(proyectoCargoImplementacion);
            proyectoCargoAgente.setOid(rs.getString("OIDProyectoCargo"));
            proyectoCargoAgente.setNroProyectoCargo(rs.getInt("numeroProyectoCargo"));
            proyectoCargoAgente.setCantidadMinimaPostulacion(rs.getInt("cantidadMinimaPostulacionProyectoCargo"));
            proyectoCargoAgente.setDescripcion(rs.getString("descripcionProyectoCargo"));
            proyectoCargoAgente.setHabilitado(rs.getBoolean("estaHabilitadoProyectoCargo"));
            proyectoCargoAgente.setOidProyecto(rs.getString("OIDProyecto"));
            proyectoCargoAgente.setOidProyectoCargoCarrera(rs.getString("OIDProyectoCargoCarrera"));
            proyectoCargoAgente.setHorasDedicadas(rs.getDouble("horasDedicadasProyectoCargo"));
            proyectoCargoAgente.setOidTipoCargo(rs.getString("OIDTipoCargo"));
            proyectoCargosList.add(proyectoCargoAgente);
        }
        return proyectoCargosList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.proyectoCargos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        return null;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
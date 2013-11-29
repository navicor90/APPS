/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;


import Modelo.Agente.Agente;
import Modelo.Agente.AgenteProyecto;
import Modelo.Agente.AgenteProyectoCargo;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionProyectoCargo;
import Modelo.interfaces.PostulacionProyectoCargo;
import Modelo.interfaces.ProyectoCargo;
import Modelo.interfaces.ProyectoCargoEstado;

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
    public void persistirObjetosInternos(Object obj) {
        FachadaPersistenciaInterna fachadaPI = FachadaPersistenciaInterna.getInstancia();
        ProyectoCargo proyectoCargo = (ProyectoCargo) obj;
        fachadaPI.guardar("ProyectoCargoCarrera", proyectoCargo.getProyectoCargoCarrera());
        fachadaPI.guardar("TipoCargo", proyectoCargo.getTipoCargo());
        for (ProyectoCargoEstado proyectoCargoEstado : proyectoCargo.getProyectoCargoEstadoList()) {
            fachadaPI.guardar("ProyectoCargoEstado", proyectoCargoEstado);
        }
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        return null;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteProyectoCargo agente = (AgenteProyectoCargo) objInsert;
        String sql = "INSERT INTO  AE.proyectos "
                + "(OIDProyectoCargo ,numeroProyectoCargo ,descripcionProyectoCargo,cantidadMinimaPostulacionProyectoCargo,"
                + "estaHabilitadoProyectoCargo,horasDedicadasProyectoCargo,OIDProyecto,OIDTipoCargo)"
                + "VALUES ('"+agente.getOid()+"',  '"+agente.getNroProyectoCargo()+"',  '"+agente.getDescripcion()
                +"',  '"+agente.getCantidadMinimaPostulacion()+"',  '"+agente.isHabilitado()
                +"',  '"+agente.getHorasDedicadas() +"',  '"+agente.getOidProyecto()+"',  '"+agente.getTipoCargo()+"')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        return null;
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        String criterioString="";
        switch(criterio.getAtributo()){
            case "proyecto":
                criterioString = "OIDProyecto";
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
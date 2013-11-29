/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgentePostulacionProyectoCargoEstado;

import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargoEstado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaPostulacionProyectoCargoEstado extends IntermediarioPersistenciaRelacional{

@Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> postulacionProyectoCargoEstadoList = new ArrayList<>();
        while (rs.next()) {
            AgentePostulacionProyectoCargoEstado postulacionProyectoCargoEstadoAgente = new AgentePostulacionProyectoCargoEstado();
            ImplementacionPostulacionProyectoCargoEstado postulacionProyectoCargoEstadoImplementacion = new ImplementacionPostulacionProyectoCargoEstado();
            postulacionProyectoCargoEstadoAgente.setImplementacionPostulacionProyectoCargoEstado(postulacionProyectoCargoEstadoImplementacion);
            postulacionProyectoCargoEstadoAgente.setOid(rs.getString("OIDPostulacionProyectoCargoEstado"));
            postulacionProyectoCargoEstadoAgente.setFechaHoraCambio(rs.getDate("fechaHoraCambioPostulacionProyectoCargoEstado"));
            postulacionProyectoCargoEstadoAgente.setOidTipoEstadoPostulacionProyectoCargo(rs.getString("OIDTipoEstadoPostulacionProyectoCargo"));
            postulacionProyectoCargoEstadoAgente.setOidPostulacionProyectoCargo(rs.getString("OIDPostulacionProyectoCargo"));
            postulacionProyectoCargoEstadoList.add(postulacionProyectoCargoEstadoAgente);
        }
        return postulacionProyectoCargoEstadoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.postulacionProyectoCargoEstados WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String persistirObjetosInternos(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.postulacionProyectoCargoEstados WHERE OIDPostulacion='"+oid+"'";
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
        String criterioString="";
        switch(criterio.getAtributo()){
            case "TipoEstadoPostulacionProyectoCargo":
                criterioString = "OIDTipoEstadoPostulacionProyectoCargo";
                break;
            case "PostulacionProyectoCargo":
                criterioString = "OIDPostulacionProyectoCargo";
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
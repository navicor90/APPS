/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.AgenteCarrera;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionCarrera;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaCarrera extends IntermediarioPersistenciaRelacional{
    
    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> carreraList = new ArrayList<>();
        while (rs.next()) {
            AgenteCarrera carreraAgente = new AgenteCarrera();
            ImplementacionCarrera carreraImplementacion = new ImplementacionCarrera();
            carreraAgente.setImplementacionCarrera(carreraImplementacion);
            carreraAgente.setOid(rs.getString("OIDCarrera"));
            carreraAgente.setFechaFinVigencia(rs.getDate("fechaFinVigencia"));
            carreraAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            carreraAgente.set
            
        }
        return postulacionList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.postulacionProyectoCargos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        FachadaPersistenciaInterna instanciaFPI =FachadaPersistenciaInterna.getInstancia();
        PostulacionProyectoCargo postulacionProyectoCargo = (PostulacionProyectoCargo) obj;
        //instanciaFPI.guardar("Proyecto", postulacionProyectoCargo.getProyecto());
        //instanciaFPI.guardar("ProyectoCargo", postulacionProyectoCargo.getProyectoCargo());
        //instanciaFPI.guardar("Universidad", postulacionProyectoCargo.getUniversidad());
        for (PostulacionProyectoCargoEstado postulacionProyectoCargoEstado : postulacionProyectoCargo.getPostulacionProyectoCargoEstadoList()) {
            FachadaPersistenciaInterna.getInstancia().guardar("PostulacionProyectoCargoEstado", postulacionProyectoCargoEstado);
        }
        
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.postulacionProyectoCargos WHERE OIDPostulacionProyectoCargo='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgentePostulacionProyectoCargo agente = (AgentePostulacionProyectoCargo) objInsert;
        String sql = "INSERT INTO  AE.postulacionProyectoCargos "
                + "(OIDPostulacionProyectoCargo ,prioridadPostulacionProyectoCargo ,cantidadMateriasAprobadasEstudiantePostulacionProyectoCargo,"
                + "cantidadMateriasRegularesPostulacionProyectoCargo,OIDPostulacion,OIDProyecto,OIDProyectoCargo,OIDUniversidad)"
                + "VALUES ('"+agente.getOid()+"',  '"+agente.getPrioridad()+"',  '"+agente.getCantidadMateriasAprobadasEstudiante()
                +"',  '"+agente.getCantidadMateriasRegulares()+"',  '"+agente.getOidPostulacion()+"',  '"+agente.getOidProyecto()
                +"',  '"+agente.getOidProyectoCargo()+"',  '0123u1')";
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
            case "postulacion":
                criterioString = "OIDPostulacion";
                break;
            case "proyecto":
                criterioString = "OIDProyecto";
                break;
            case "proyectoCargo":
                criterioString = "OIDProyectoCargo";
                break;
            case "universidad":
                criterioString = "OIDUniversidad";
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
}

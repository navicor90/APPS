/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgentePostulacionProyectoCargo;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaPostulacionProyectoCargo extends IntermediarioPersistenciaRelacional {

@Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> postulacionList = new ArrayList<>();
        while (rs.next()) {
            AgentePostulacionProyectoCargo postulacionProyectoCargoAgente = new AgentePostulacionProyectoCargo();
            ImplementacionPostulacionProyectoCargo postulacionProyectoCargoImplementacion = new ImplementacionPostulacionProyectoCargo();
            postulacionProyectoCargoAgente.setImplementacionPostulacionProyectoCargo(postulacionProyectoCargoImplementacion);
            postulacionProyectoCargoAgente.setOid(rs.getString("OIDPostulacionProyectoCargo"));
            postulacionProyectoCargoAgente.setPrioridad(rs.getInt("prioridadPostulacionProyectoCargo"));
            postulacionProyectoCargoAgente.setCantidadMateriasAprobadasEstudiante(rs.getInt("cantidadMateriasAprobadasEstudiantePostulacionProyectoCargo"));
            postulacionProyectoCargoAgente.setCantidadMateriasRegulares(rs.getInt("cantidadMateriasRegularesPostulacionProyectoCargo"));
            postulacionProyectoCargoAgente.setOidPostulacion(rs.getString("OIDPostulacion"));
            postulacionProyectoCargoAgente.setOidProyecto(rs.getString("OIDProyecto"));
            postulacionProyectoCargoAgente.setOidProyectoCargo(rs.getString("OIDProyectoCargo"));
            postulacionProyectoCargoAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            postulacionList.add(postulacionProyectoCargoAgente);
        }
        return postulacionList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.postulacionProyectoCargos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.postulacionProyectoCargos WHERE OIDPostulacionProyectoCargo='"+oid+"'";
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
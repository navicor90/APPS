/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteProyectoCargoCarrera;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionProyectoCargoCarrera;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaProyectoCargoCarrera extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoEstadoPostulacionProyectoCargoList = new ArrayList<>();
        while (rs.next()) {
            AgenteProyectoCargoCarrera proyectoCargoCarreraAgente = new AgenteProyectoCargoCarrera();
            ImplementacionProyectoCargoCarrera proyectoCargoCarreraImplementacion = new ImplementacionProyectoCargoCarrera();
            proyectoCargoCarreraAgente.setImplementacionProyectoCargoCarrera(proyectoCargoCarreraImplementacion);
            proyectoCargoCarreraAgente.setOid(rs.getString("OIDProyectoCargoCarrera"));
            proyectoCargoCarreraAgente.setCantidadMateriasRegulares(rs.getInt("cantidadMateriasRegularesProyectoCargoCarrera"));
            proyectoCargoCarreraAgente.setCantidadMateriasRendidas(rs.getInt("cantidadMateriasAprobadasProyectoCargoCarrera"));
            proyectoCargoCarreraAgente.setOidCarrera(rs.getString("OIDCarrera"));
            proyectoCargoCarreraAgente.setOidProyectoCargo(rs.getString("OIDProyectoCargo"));
            tipoEstadoPostulacionProyectoCargoList.add(proyectoCargoCarreraAgente);
        }
        return tipoEstadoPostulacionProyectoCargoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.proyectoCargoCarreras WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
   
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.proyectoCargoCarreras WHERE OIDPostulacionProyectoCargoCarrera='" + oid + "'";
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
        String criterioString = "";
        switch (criterio.getAtributo()) {
            case "proyectoCargo":
                criterioString = "OIDProyectoCargo";
                break;
            case "carrera":
                criterioString = "OIDCarrera";
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

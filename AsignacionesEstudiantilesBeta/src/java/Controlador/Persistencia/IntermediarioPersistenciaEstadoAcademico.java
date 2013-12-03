/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteEstadoAcademico;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionEstadoAcademico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaEstadoAcademico extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> estadoAcademicoList = new ArrayList<>();
        while (rs.next()) {
            AgenteEstadoAcademico estadoAcademicoAgente = new AgenteEstadoAcademico();
            ImplementacionEstadoAcademico postulacionProyectoCargoImplementacion = new ImplementacionEstadoAcademico();
            estadoAcademicoAgente.setImplementacionEstadoAcademico(postulacionProyectoCargoImplementacion);
            estadoAcademicoAgente.setOid(rs.getString("OIDEstadoAcademico"));
            estadoAcademicoAgente.setFechaFinHabilitacion(rs.getDate("fechaFinHabilitacion"));
            estadoAcademicoAgente.setFechaIngreso(rs.getDate("fechaIngreso"));
            estadoAcademicoAgente.setLegajo(rs.getString("legajo"));
            estadoAcademicoAgente.setOIDCarrera(rs.getString("OIDCarrera"));
            estadoAcademicoAgente.setOIDEstudiante(rs.getString("OIDEstudiante"));
            estadoAcademicoAgente.setOIDTipoEstadoAcademico(rs.getString("OIDTipoEstadoAcademico"));
            estadoAcademicoList.add(estadoAcademicoAgente);
        }
        return estadoAcademicoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.estadoAcademicos WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        //metodo sin implementario PersistirObjetosInterno, de intermediarioPerisistenciaEstadoAcademico
        System.out.println("       metodo sin implementario PersistirObjetosInterno, de intermediarioPerisistenciaEstadoAcademico  ");

    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.estadoAcademicos WHERE OIDEstadoAcademico='" + oid + "'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteEstadoAcademico agente =  (AgenteEstadoAcademico) objInsert;
        String sql = "INSERT INTO  AE.estadoAcademicos (OIDEstadoAcademico ,legajo ,fechaIngreso ,fechaFinHabilitacion ,OIDCarrera ,OIDEstudiante,"
                + "OIDTipoEstadoAcademico) VALUES ('" + agente.getOid() + "',  '" + agente.getLegajo() + "',  '" + agente.getFechaIngreso()
                + "',  '" + agente.getFechaFinHabilitacion() + "',  '" + agente.getOIDCarrera() + "',  '" + agente.getOIDEstudiante()
                + "',  '" + agente.getOIDTipoEstadoAcademico() + "')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        String criterioString = "";
        switch (criterio.getAtributo()) {
            case "carrera":
                criterioString = "OIDCarrera";
                break;
            case "estudiante":
                criterioString = "OIDEstudiante";
                break;
            case "tipoEstadoAcademico":
                criterioString = "OIDProyectoCargo";
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

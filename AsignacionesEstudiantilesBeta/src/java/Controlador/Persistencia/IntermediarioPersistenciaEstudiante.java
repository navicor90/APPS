/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import Modelo.Agente.*;
import Modelo.Criterio;
import Modelo.implementacion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaEstudiante extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> estudiantesList = new ArrayList<>();
        while (rs.next()) {
            AgenteEstudiante estudianteAgente = new AgenteEstudiante();
            ImplementacionEstudiante estudianteImplementacion = new ImplementacionEstudiante();
            estudianteAgente.setImplementacionEstudiante(estudianteImplementacion);
            estudianteAgente.setOid(rs.getString("OIDEstudiante"));
            estudianteAgente.setCodigo(rs.getInt("codigoEstudiante"));
            estudianteAgente.setApellido(rs.getString("apellidoEstudiante"));
            estudianteAgente.setNombre(rs.getString("nombreEstudiante"));
            estudianteAgente.setDni(rs.getLong("dniEstudiante"));
            estudianteAgente.setTipoDni(rs.getString("tipoDNIEstudiante"));
            estudianteAgente.setEmail(rs.getString("emailEstudiante"));
            estudianteAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            estudianteAgente.setOIDTIpoEstadoEstudiante(rs.getString("OIDTipoEstadoEstudiante"));
            estudiantesList.add(estudianteAgente);
        }
        return estudiantesList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.estudiantes WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {

    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        String criterioString = "";
        switch (criterio.getAtributo()) {
            case "estadoAcademico":
                criterioString = "OIDEstudiante";
                criterioString += criterio.getOperador();
                AgenteEstadoAcademico agente = (AgenteEstadoAcademico)criterio.getValor();
                criterioString += "'" + agente.getOIDEstudiante() + "'";
                break;
            default:
                return "";
        }
        return criterioString;
    }
}

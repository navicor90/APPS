/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;
import Modelo.Agente.Agente;
import Modelo.Agente.AgenteTipoEstadoAcademico;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionTipoEstadoAcademico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoEstadoAcademico extends IntermediarioPersistenciaRelacional{

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoEstadoAcademicoList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoEstadoAcademico tipoEstadoAcademicoAgente = new AgenteTipoEstadoAcademico();
            ImplementacionTipoEstadoAcademico postulacionProyectoCargoImplementacion = new ImplementacionTipoEstadoAcademico();
            tipoEstadoAcademicoAgente.setImplementacionTipoEstadoAcademico(postulacionProyectoCargoImplementacion);
            tipoEstadoAcademicoAgente.setOid(rs.getString("OIDPostulacionProyectoCargo"));
            tipoEstadoAcademicoAgente.setCodigo(rs.getInt("codigo"));
            tipoEstadoAcademicoAgente.setNombre(rs.getString("nombre"));
            tipoEstadoAcademicoList.add(tipoEstadoAcademicoAgente);
        }
        return tipoEstadoAcademicoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoEstadoAcademicos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.tipoEstadoAcademicos WHERE OIDTipoEstadoAcademico='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteTipoEstadoAcademico agente = (AgenteTipoEstadoAcademico) objInsert;
        String sql = "INSERT INTO  AE.tipoEstadoAcademicos (OIDTipoEstadoAcademico ,codigo ,nombre)"
                + "VALUES ('"+agente.getOid()+"',  '"+agente.getCodigo()+"',  '"+agente.getNombre()+"')";
        return sql;
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
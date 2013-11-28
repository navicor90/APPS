/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.AgentePostulacion;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionPostulacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaPostulacion extends IntermediarioPersistenciaRelacional{

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> postulacionList = new ArrayList<>();
        while (rs.next()) {
            AgentePostulacion postulacionAgente = new AgentePostulacion();
            ImplementacionPostulacion postulacionImplementacion = new ImplementacionPostulacion();
            postulacionAgente.setImplementacionPostulacion(postulacionImplementacion);
            postulacionAgente.setOid(rs.getString("OIDPostulacion"));
            postulacionAgente.setEstadoPostulacion(rs.getString("estadoPostulacion"));
            postulacionAgente.setFechaHoraPostulacion(rs.getDate("fechaHoraPostulacion"));
            postulacionAgente.setNroPostulacion(rs.getInt("nroPostulacion"));
            postulacionList.add(postulacionAgente);
        }
        return postulacionList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.postulaciones WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.postulaciones WHERE OIDPostulacion='"+oid+"'";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
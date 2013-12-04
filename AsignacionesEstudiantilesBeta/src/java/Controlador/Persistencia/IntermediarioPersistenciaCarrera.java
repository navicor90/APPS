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
public class IntermediarioPersistenciaCarrera extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> carreraList = new ArrayList<>();
        while (rs.next()) {
            AgenteCarrera carreraAgente = new AgenteCarrera();
            ImplementacionCarrera carreraImplementacion = new ImplementacionCarrera();
            carreraAgente.setImplementacionCarrera(carreraImplementacion);
            carreraAgente.setOid(rs.getString("OIDCarrera"));
            carreraAgente.setNombreCarrera(rs.getString("nombreCarrera"));
            carreraAgente.setFechaFinVigencia(rs.getDate("fechaFinVigencia"));
            carreraAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            carreraAgente.setOidTipoEstadoCarrera(rs.getString("OIDTipoEstadoCarrera"));
            carreraList.add(carreraAgente);
        }
        return carreraList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.carreras WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        //SIN IMPLEMENTAR PERSISTIR OBJETOS INTERNOS, EN INTERMEDIARIOPERSISTENCIACARRERA
        System.out.println("        SIN IMPLEMENTAR PERSISTIR OBJETOS INTERNOS, EN INTERMEDIARIOPERSISTENCIACARRERA");
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.carreras WHERE OIDCarrera='" + oid + "'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteCarrera agente = (AgenteCarrera) objInsert;
        String sql = "INSERT INTO  AE.carreras "
                + "(OIDCarrera ,nombreCarrera , fechaFinVigencia , OIDUniversidad,OIDTipoEstadoCarrera)"
                + "VALUES ('" + agente.getOid() + "',  '" + agente.getNombreCarrera() + "',  '" + agente.getFechaFinVigencia()
                + "',  '" + agente.getOidUniversidad() + "',  '" + agente.getOidTipoEstadoCarrera() + "')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

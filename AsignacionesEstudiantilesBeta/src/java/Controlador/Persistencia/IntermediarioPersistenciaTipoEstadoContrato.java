/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgenteTipoEstadoContrato;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionTipoEstadoContrato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoEstadoContrato  extends IntermediarioPersistenciaRelacional{
        @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoEstadosList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoEstadoContrato tipoEstadoContratoAgente = new AgenteTipoEstadoContrato();
            ImplementacionTipoEstadoContrato contratoEstadosImplementacion = new ImplementacionTipoEstadoContrato();
            tipoEstadoContratoAgente.setImplementacionTipoEstadoContrato(contratoEstadosImplementacion);
            tipoEstadoContratoAgente.setOid(rs.getString("OIDTipoEstadoContrato"));
            tipoEstadoContratoAgente.setCodigoEstadoContrato(rs.getInt("codigo"));
            tipoEstadoContratoAgente.setNombreEstadoContrato(rs.getString("nombre"));
            tipoEstadosList.add(tipoEstadoContratoAgente);
        }
        return tipoEstadosList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoEstadoContratos WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        //sin implementar persistirObjetosInternos IntermediarioPersistenciaTipoEstadoContratos
        System.out.println("        sin implementar persistirObjetosInternos IntermediarioPersistenciaTipoEstadoContratos");
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.tipoEstadoContratos WHERE OIDTipoEstadoContrato='" + oid + "'";
        return sql;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
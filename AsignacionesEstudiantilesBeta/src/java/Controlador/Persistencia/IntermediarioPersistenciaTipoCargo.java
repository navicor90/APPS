/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;


import Modelo.Agente.AgenteTipoCargo;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionTipoCargo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaTipoCargo extends IntermediarioPersistenciaRelacional{

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> tipoCargoList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoCargo tipoCargoAgente = new AgenteTipoCargo();
            ImplementacionTipoCargo tipoCargoImplementacion = new ImplementacionTipoCargo();
            tipoCargoAgente.setImplementacionTipoCargo(tipoCargoImplementacion);
            tipoCargoAgente.setOid(rs.getString("OIDTipoCargo"));
            tipoCargoAgente.setCodigo(rs.getInt("codigoTipoCargo"));
            tipoCargoAgente.setNomTipoCargo(rs.getString("nombreTipoCargo"));
            tipoCargoList.add(tipoCargoAgente);
        }
        return tipoCargoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoCargos WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.tipoCargos WHERE OIDTipoCargo='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteTipoCargo agente = (AgenteTipoCargo) objInsert;
        String sql = "INSERT INTO  AE.tipoCargos (OIDTipoCargo ,codigoTipoCargo ,nombreTipoCargo)VALUES ('"+agente.getOid()+"',  '"+agente.getCodigo()+"',  '"+agente.getNomTipoCargo()+"')";
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
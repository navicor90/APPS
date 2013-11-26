/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;


import Modelo.Agente.AgenteTipoCargo;
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
        List<Object> estudiantesList = new ArrayList<>();
        while (rs.next()) {
            AgenteTipoCargo tipoCargoAgente = new AgenteTipoCargo();
            ImplementacionTipoCargo tipoCargoImplementacion = new ImplementacionTipoCargo();
            tipoCargoAgente.setImplementacionTipoCargo(tipoCargoImplementacion);
            tipoCargoAgente.setOid(rs.getString("OIDTipoCargo"));
            tipoCargoAgente.setCodigo(rs.getInt("codigoTipoCargo"));
            tipoCargoAgente.setNomTipoCargo(rs.getString("nombreTipoCargo"));
            estudiantesList.add(tipoCargoAgente);
        }
        return estudiantesList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.tipoCargos WHERE "+Expresion.desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.tipoCargos WHERE OIDTipoCargo='"+oid+"'";
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
}
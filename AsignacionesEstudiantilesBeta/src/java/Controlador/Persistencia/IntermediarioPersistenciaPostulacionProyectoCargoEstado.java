/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
import Modelo.Agente.AgentePostulacionProyectoCargoEstado;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargoEstado;
import Modelo.interfaces.PostulacionProyectoCargoEstado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaPostulacionProyectoCargoEstado extends IntermediarioPersistenciaRelacional{

@Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> postulacionProyectoCargoEstadoList = new ArrayList<>();
        while (rs.next()) {
            AgentePostulacionProyectoCargoEstado postulacionProyectoCargoEstadoAgente = new AgentePostulacionProyectoCargoEstado();
            ImplementacionPostulacionProyectoCargoEstado postulacionProyectoCargoEstadoImplementacion = new ImplementacionPostulacionProyectoCargoEstado();
            postulacionProyectoCargoEstadoAgente.setImplementacionPostulacionProyectoCargoEstado(postulacionProyectoCargoEstadoImplementacion);
            postulacionProyectoCargoEstadoAgente.setOid(rs.getString("OIDPostulacionProyectoCargoEstado"));
            postulacionProyectoCargoEstadoAgente.setFechaHoraCambio(rs.getDate("fechaHoraCambioPostulacionProyectoCargoEstado"));
            postulacionProyectoCargoEstadoAgente.setOidTipoEstadoPostulacionProyectoCargo(rs.getString("OIDTipoEstadoPostulacionProyectoCargo"));
            postulacionProyectoCargoEstadoAgente.setOidPostulacionProyectoCargo(rs.getString("OIDPostulacionProyectoCargo"));
            postulacionProyectoCargoEstadoList.add(postulacionProyectoCargoEstadoAgente);
        }
        return postulacionProyectoCargoEstadoList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.postulacionProyectoCargoEstados WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        FachadaPersistenciaInterna fachadaPI = FachadaPersistenciaInterna.getInstancia();
        PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = (PostulacionProyectoCargoEstado) obj;
        //fachadaPI.guardar("TipoEstadoPostulacionProyectoCargo", postulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo());
        
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
         String sql = "SELECT * FROM AE.postulacionProyectoCargoEstados WHERE OIDPostulacion='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgentePostulacionProyectoCargoEstado agente = (AgentePostulacionProyectoCargoEstado) objInsert;
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaCambioConvertida = fechaHora.format(agente.getFechaHoraCambio());
        String sql = "INSERT INTO  AE.postulacionProyectoCargoEstados "
                + "(OIDPostulacionProyectoCargoEstado ,fechaHoraCambioPostulacionProyectoCargoEstado ,OIDTipoEstadoPostulacionProyectoCargo,"
                + "OIDPostulacionProyectoCargo)"
                + "VALUES ('"+agente.getOid()+"',  '"+fechaCambioConvertida+"',  '"+agente.getOidTipoEstadoPostulacionProyectoCargo()
                +"',  '"+agente.getOidPostulacionProyectoCargo()+"')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        return null;
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        String criterioString="";
        switch(criterio.getAtributo()){
            case "TipoEstadoPostulacionProyectoCargo":
                criterioString = "OIDTipoEstadoPostulacionProyectoCargo";
                break;
            case "PostulacionProyectoCargo":
                criterioString = "OIDPostulacionProyectoCargo";
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
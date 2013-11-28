/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.Agente;
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
            try{
                postulacionAgente.setFechaHoraAnulacionPostulacion(rs.getDate("fechaAnulacionPostulacion"));
            }catch(SQLException e){
                
            }
            postulacionAgente.setFechaHoraPostulacion(rs.getDate("fechaPostulacion"));
            postulacionAgente.setNroPostulacion(rs.getInt("codigoPostulacion"));
            postulacionAgente.setOIDEstudiante(rs.getString("OIDEstudiante"));
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
        String criterioString="";
        switch(criterio.getAtributo()){
            case "estudiante":
                criterioString = "OIDEstudiante";
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.AgenteUniversidad;
import Modelo.Criterio;
import Modelo.Expresion;
import Modelo.implementacion.ImplementacionUniversidad;
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
public class IntermediarioPersistenciaUniversidad extends IntermediarioPersistenciaRelacional{

@Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> universidadList = new ArrayList<>();
        while (rs.next()) {
            AgenteUniversidad universidadAgente = new AgenteUniversidad();
            ImplementacionUniversidad universidadImplementacion = new ImplementacionUniversidad();
            universidadAgente.setImplementacionUniversidad(universidadImplementacion);
            universidadAgente.setOid(rs.getString("OIDUniversidad"));
            universidadAgente.setCodigo(rs.getLong("codigoUniversidad"));
            universidadAgente.setNombreUniversidad(rs.getString("nombreUniversidad"));
            universidadAgente.setDireccionServidorWebUniversidad(rs.getString("direccionServidorWebUniversidad"));
            universidadAgente.setFechaInicioVigenciaUniversidad(rs.getDate("fechaInicioVigenciaUniversidad"));
            universidadAgente.setFechaFinVigenciaUniversidad(rs.getDate("fechaFinVigenciaUniversidad"));
            universidadList.add(universidadAgente);
        }
        return universidadList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.universidades WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        String sql = "SELECT * FROM AE.universidades WHERE OIDUniversidad ='"+oid+"'";
        return sql;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteUniversidad agente = (AgenteUniversidad) objInsert;
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaInicioVigenciaConvertida = fechaHora.format(agente.getFechaInicioVigenciaUniversidad());
        String fechaFinVigenciaConvertida = fechaHora.format(agente.getFechaFinVigenciaUniversidad());
        String sql = "INSERT INTO  AE.postulaciones "
                + "(OIDUniversidad ,codigoUniversidad ,nombreUniversidad , direccionServidorWebUniversidad,"
                + "fechaInicioVigenciaUniversidad, fechaFinVigenciaUniversidad)"
                + "VALUES ('"+agente.getOid()+"',  '"+agente.getCodigo()+"',  '"+agente.getNombreUniversidad()
                +"',  '"+agente.getDireccionServidorWebUniversidad()+"',  '"+fechaInicioVigenciaConvertida
                +"',  '"+fechaFinVigenciaConvertida+"')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        throw new UnsupportedOperationException("No implementado ------------."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        throw new UnsupportedOperationException("No implementado ------------."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.Agente.AgenteProyecto;
import Modelo.implementacion.ImplementacionProyecto;
import Modelo.Expresion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaProyecto extends IntermediarioPersistenciaRelacional{

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> proyectosList = new ArrayList<>();
        while (rs.next()) {
            AgenteProyecto proyectoAgente = new AgenteProyecto();
            ImplementacionProyecto proyectoImplementacion = new ImplementacionProyecto();
            proyectoImplementacion.setDescripcion(rs.getString("descripcion"));
            proyectoImplementacion.setDuracion(rs.getInt("duracion"));
            proyectoImplementacion.setNombreProyecto(rs.getString("nombreProyecto"));
            proyectoImplementacion.setFechaInicio(rs.getDate("fechaInicio"));
            proyectoImplementacion.setFechaFinPostulacion(rs.getDate("fechaFinPostulacion"));
            proyectoAgente.setImplementacionProyecto(proyectoImplementacion);
            proyectosList.add(proyectoAgente);
            
        }
        return proyectosList;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaSeleccion(Expresion cri) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

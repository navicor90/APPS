/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.AgenteProyecto;
import Modelo.Criterio;
import Modelo.implementacion.ImplementacionProyecto;
import Modelo.Expresion;
import Modelo.interfaces.Proyecto;
import Modelo.interfaces.ProyectoCargo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaProyecto extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> proyectosList = new ArrayList<>();
        while (rs.next()) {
            AgenteProyecto proyectoAgente = new AgenteProyecto();
            ImplementacionProyecto proyectoImplementacion = new ImplementacionProyecto();
            proyectoAgente.setImplementacionProyecto(proyectoImplementacion);
            proyectoAgente.setOid(rs.getString("OIDProyecto"));
            proyectoAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            proyectoAgente.setOidEmpresa(rs.getString("OIDEmpresa"));
            proyectoAgente.setCodigo(rs.getInt("codigoProyecto"));
            proyectoAgente.setDescripcion(rs.getString("descripcionProyecto"));
            proyectoAgente.setDuracion(rs.getInt("duracionProyecto"));
            proyectoAgente.setNombreProyecto(rs.getString("nombreProyecto"));
            proyectoAgente.setFechaInicio(rs.getDate("fechaInicioProyecto"));
            proyectoAgente.setFechaFinPostulacion(rs.getDate("fechaLimitePostulacion"));
            proyectosList.add(proyectoAgente);

        }
        return proyectosList;
    }

    @Override
    public void persistirObjetosInternos(Object obj) {
        FachadaPersistenciaInterna fachadaPI = FachadaPersistenciaInterna.getInstancia();
        Proyecto proyecto = (Proyecto) obj;
        fachadaPI.guardar("Empresa", proyecto.getEmpresa());
        for (ProyectoCargo proyectoCargo : proyecto.getProyectoCargoList()) {
            fachadaPI.guardar("ProyectoCargo", proyectoCargo);
        }
        
        
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.proyectos WHERE " + desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        AgenteProyecto agente = (AgenteProyecto) objInsert;
        String sql = "INSERT INTO  AE.proyectos "
                + "(OIDProyecto ,codigoProyecto ,nombreProyecto,descripcionProyecto,duracionProyecto,fechaInicioProyecto,fechaLimitePostulacion)"
                + "VALUES ('"+agente.getOid()+"',  '"+agente.getCodigo()+"',  '"+agente.getNombreProyecto()+"',  '"+agente.getDescripcion()+"',  '"+agente.getFechaInicio()
                +"',  '"+agente.getFechaFinPostulacion()
                +"',  '"+agente.getOidEmpresa()+"',  '"+agente.getOidUniversidad()+"')";
        return sql;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

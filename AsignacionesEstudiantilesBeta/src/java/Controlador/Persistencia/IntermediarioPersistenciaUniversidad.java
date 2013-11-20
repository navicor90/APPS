/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Criterio;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author milton
 */
public abstract class IntermediarioPersistenciaUniversidad extends IntermediarioPersistenciaRelacional{
   @Override
    public abstract List<Object> convertirRegistroAObjeto(ResultSet a);
    @Override
    public abstract String convertirObjectoRegistro(Object obj);
    @Override
    public abstract String armarConsultaSeleccion(Criterio cri);
    @Override
    public abstract String armarConsultaSeleccion(String oid);
    @Override
    public abstract String armarConsultaInsercion(Object objInsert);
    @Override
    public abstract String armarConsultaActualizacion(Object objUpdate);
    
    /* Lo que estaba hecho antes
    @Override
    public List<Object> Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}

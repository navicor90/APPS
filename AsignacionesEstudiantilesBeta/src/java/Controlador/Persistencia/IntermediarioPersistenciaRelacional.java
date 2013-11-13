/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author franco
 */
public abstract class IntermediarioPersistenciaRelacional extends IntermediarioPersistencia{
    @Override
    public abstract List<Object> materializar(Criterio c);
    @Override
    public abstract Object materializar(String oid);
    @Override
    public abstract boolean desmaterializar(Object o);
    public abstract Object convertirRegistroAObjeto(ResultSet a);
    public abstract String convertirObjectoRegistro(Object obj);
    public abstract String armarConsultaSeleccion(Criterio cri);
    public abstract String armarConsultaSeleccion(String oid);
    public abstract String armarConsultaInsercion(Object objInsert);
    public abstract String armarConsultaActualizacion(Object objUpdate);
}

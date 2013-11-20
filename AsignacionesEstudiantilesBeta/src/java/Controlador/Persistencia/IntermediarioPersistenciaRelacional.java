/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author franco
 */
public abstract class IntermediarioPersistenciaRelacional extends IntermediarioPersistencia{
    @Override
    public List<Object> materializar(Expresion c){
        ResultSet rs;
        try{
        rs = FachadaPersistenciaInterna.getInstancia().st.executeQuery(armarConsultaSeleccion(c));
        }catch(SQLException exception){
            
        }
        List<Object> agente = convertirRegistroAObjeto(rs);
        return agente;
    }
    @Override
    public abstract Object materializar(String oid);
    @Override
    public abstract boolean desmaterializar(Object o);
    public abstract List<Object> convertirRegistroAObjeto(ResultSet a);
    public abstract String convertirObjectoRegistro(Object obj);
    public abstract String armarConsultaSeleccion(Expresion cri);
    public abstract String armarConsultaSeleccion(String oid);
    public abstract String armarConsultaInsercion(Object objInsert);
    public abstract String armarConsultaActualizacion(Object objUpdate);
}

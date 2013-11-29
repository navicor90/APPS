/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import java.util.List;
import Modelo.Expresion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milton
 */
public abstract class IntermediarioPersistencia {

    public List<Object> buscar(Expresion criterio) {
        Cache cache = Cache.obtenerInstancia();
        List<Object> objetosObtenidos=null;
        try {
            objetosObtenidos = materializar(criterio);
            for (Object objetoObtenido : objetosObtenidos) {
            cache.depositar((Agente) objetoObtenido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objetosObtenidos;
    }

    public Object buscar(String oid) {
        Cache cache = Cache.obtenerInstancia();
        Object agente = cache.buscar(oid);
        if (agente == null) {
            try {
                agente = materializar(oid);
                cache.depositar((Agente) agente);
            } catch (SQLException ex) {
                Logger.getLogger(IntermediarioPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return agente;
    }

    public boolean guardar(Object objeto){
        boolean result = false;
        try {
            result= desmaterializar(objeto);
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public abstract List<Object> materializar(Expresion criterio) throws SQLException;

    public abstract Object materializar(String oid) throws SQLException;

    public abstract boolean desmaterializar(Object objeto) throws SQLException ;
}

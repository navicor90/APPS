/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import java.util.List;
import Modelo.Criterio; 

/**
 *
 * @author milton
 */
public abstract class IntermediarioPersistencia {
    public List<Object> buscar(Criterio criterio){
        Cache ca = Cache.obtenerInstancia();
        List<Object> ob = materializar(criterio);
        ca.depositar(ob);
        return ob;
    }
    public Object buscar(String oid){
        return materializar(oid);
    }
    public boolean guardar(Object object){
        return desmaterializar (object);
    }
    public abstract List<Object> materializar(Criterio criterio);
    public abstract Object materializar(String oid);
    public abstract boolean desmaterializar(Object o);
}

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
    public abstract List<Object> buscar(Criterio criterio){
        
    }
    public abstract List<Object> buscar(String oid);
    public abstract boolean guardar(Object object);
    public abstract List<Object> materializar(Criterio criterio);
    public abstract List<Object> materializar(String oid);
    public abstract boolean desmaterializar(Object o);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import java.util.List;
import Modelo.Expresion;

/**
 *
 * @author milton
 */
public abstract class IntermediarioPersistencia {

    public List<Object> buscar(Expresion criterio) {
        Cache cache = Cache.obtenerInstancia();
        List<Object> objetosObtenidos = materializar(criterio);
        for (Object objetoObtenido : objetosObtenidos) {
            cache.depositar((Agente) objetoObtenido);
        }
        return objetosObtenidos;
    }

    public Object buscar(String oid) {
        Object agente = Cache.obtenerInstancia().buscar(oid);
        if (agente == null) {
            agente = materializar(oid);
        }
        return agente;
    }

    public boolean guardar(Object objeto) {
        return desmaterializar(objeto);
    }

    public abstract List<Object> materializar(Expresion criterio);

    public abstract Object materializar(String oid);

    public abstract boolean desmaterializar(Object objeto);
}

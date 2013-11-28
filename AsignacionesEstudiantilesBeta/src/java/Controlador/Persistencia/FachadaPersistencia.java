/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import java.util.List;

/**
 *
 * @author milton
 */
public class FachadaPersistencia {

    static FachadaPersistencia instancia;

    public static FachadaPersistencia obtenerInstancia() {
        if (instancia == null) {
            instancia = new FachadaPersistencia();
        }
        return instancia;
    }


    public List<Object> buscar(String nombreEntidad, Expresion criterio) {
        return FachadaPersistenciaInterna.getInstancia().buscar(nombreEntidad, criterio);
    }

    public void guardar(Object obj) {
        FachadaPersistenciaInterna.getInstancia().guardar(obj);
    }

}

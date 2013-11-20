/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author milton
 */
public class FachadaPersistencia {
    static FachadaPersistencia instancia;
    public static FachadaPersistencia obtenerInstancia(){
        if(instancia == null)instancia = new FachadaPersistencia();
        return instancia;
    }

    public FachadaPersistencia() {
    }
    
    public List<Object> buscar(String tipoEntidad,Expresion criterio){
        return FachadaPersistenciaInterna.getInstancia().buscar(criterio, tipoEntidad);
    }
    
    public void guardar(Object obj, String nomEnt){
        FachadaPersistenciaInterna.getInstancia().guardar(obj, nomEnt);
    }
    
}

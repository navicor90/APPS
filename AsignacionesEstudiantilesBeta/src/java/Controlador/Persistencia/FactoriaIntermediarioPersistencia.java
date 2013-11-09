/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;
import Modelo.*;
/**
 *
 * @author milton
 */
public class FactoriaIntermediarioPersistencia {
    static FactoriaIntermediarioPersistencia instancia;
    
    public static FactoriaIntermediarioPersistencia obtenerInstancia(){
     if(instancia == null) instancia = new FactoriaIntermediarioPersistencia();
     return instancia;
    }
    
    public IntermediarioPersistencia obtenerIntermediarioPersistencia(String tipo){
        IntermediarioPersistencia intermediario;
        intermediario = (tipo.contentEquals(Estudiante.class.getName()))?
                new IntermediarioPersistenciaEstudiante(): null;
        intermediario = (tipo.contentEquals(Universidad.class.getName()))?
                new IntermediarioPersistenciaUniversidad(): null;
        return intermediario;
    }
}

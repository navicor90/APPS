/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import java.util.List;

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
    
    public List<Object> Buscar(String tipo,String codigo){
        FactoriaIntermediarioPersistencia fip = FactoriaIntermediarioPersistencia.obtenerInstancia();
        IntermediarioPersistencia ip = fip.obtenerIntermediarioPersistencia(tipo);
        List<Object> resultado = ip.Buscar(codigo);
        return resultado;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Controlador.ExpertoRegistrarPostulacion;
/**
 *
 * @author franco
 */
public class FabricaExperto {
    public static FabricaExperto instancia;
    public static FabricaExperto getInstancia(){
        if(instancia == null) instancia = new FabricaExperto();
        return instancia;
    }

    public FabricaExperto() {
    }
    public Object obtenerExperto(String experto){
        switch(experto){
         case("ExpertoRegistrarPostulacion"):   
            return new ExpertoRegistrarPostulacion();
         default:
             return null;
        }    
    }
    
}

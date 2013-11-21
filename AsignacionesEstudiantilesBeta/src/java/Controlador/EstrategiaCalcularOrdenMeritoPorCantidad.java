/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.interfaces.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanina
 */
public class EstrategiaCalcularOrdenMeritoPorCantidad implements EstrategiaCalcularOrdenMerito {

    
    public List<SeleccionPostulacionProyectoCargo> asignarOrdenMerito(List<Seleccion> ListaSeleccion) {
        
        List <SeleccionPostulacionProyectoCargo> selec= new ArrayList<>();
        for(Seleccion s: ListaSeleccion){
            //int codPPC = s.getSeleccionPostulacionProyectoCargo().getPostulacionProyectoCargo().
            
        //selec.add(s.getSeleccionPostulacionProyectoCargo());
            
        }
        
        return selec;
     }

   

    
    
}

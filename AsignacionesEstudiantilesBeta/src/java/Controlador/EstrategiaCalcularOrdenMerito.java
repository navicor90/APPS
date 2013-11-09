/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Seleccion;
import Modelo.SeleccionPostulacionProyectoCargo;
import java.util.List;

/**
 *
 * @author yanina
 */
public interface EstrategiaCalcularOrdenMerito {
    public List<SeleccionPostulacionProyectoCargo> asignarOrdenMerito(Seleccion seleccion);
    
}

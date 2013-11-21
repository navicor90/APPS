/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.Carrera;
import Modelo.interfaces.ProyectoCargoCarrera;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoCargoCarrera implements ProyectoCargoCarrera{
    private int cantidadMateriasRegulares;
    private int cantidadMateriasRendidas;
    private Carrera carrera;

    public int getCantidadMateriasRegulares() {
        return cantidadMateriasRegulares;
    }

    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares) {
        this.cantidadMateriasRegulares = cantidadMateriasRegulares;
    }

    public int getCantidadMateriasRendidas() {
        return cantidadMateriasRendidas;
    }

    public void setCantidadMateriasRendidas(int cantidadMateriasRendidas) {
        this.cantidadMateriasRendidas = cantidadMateriasRendidas;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoCargoCarrera implements ProyectoCargoCarrera{
    private int cantidadMateriasRegulares;
    private int cantidadMateriasRendidas;
    private Carrera carrera;

    @Override
    public int getCantidadMateriasRegulares() {
        return cantidadMateriasRegulares;
    }

    @Override
    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares) {
        this.cantidadMateriasRegulares = cantidadMateriasRegulares;
    }

    @Override
    public int getCantidadMateriasRendidas() {
        return cantidadMateriasRendidas;
    }

    @Override
    public void setCantidadMateriasRendidas(int cantidadMateriasRendidas) {
        this.cantidadMateriasRendidas = cantidadMateriasRendidas;
    }

    @Override
    public Carrera getCarrera() {
        return carrera;
    }

    @Override
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
}

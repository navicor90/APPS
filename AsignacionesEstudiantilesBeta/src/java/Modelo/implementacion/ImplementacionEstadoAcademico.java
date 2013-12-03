/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.Carrera;
import Modelo.interfaces.EstadoAcademico;
import Modelo.interfaces.TipoEstadoAcademico;

/**
 *
 * @author milton
 */
public class ImplementacionEstadoAcademico implements EstadoAcademico {
    String legajo;
    Carrera carrera;
    TipoEstadoAcademico tipoEstadoAcademico;

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    @Override
    public String getLegajo() {
        return legajo;
    }

    @Override
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public TipoEstadoAcademico getTipoEstadoAcademico() {
        return tipoEstadoAcademico;
    }

    @Override
    public void setTipoEstadoAcademico(TipoEstadoAcademico tipoEstadoAcademico) {
        this.tipoEstadoAcademico = tipoEstadoAcademico;
    }
    
}

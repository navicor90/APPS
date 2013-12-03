/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.Carrera;
import Modelo.interfaces.EstadoAcademico;
import Modelo.interfaces.EstudianteMateria;
import Modelo.interfaces.TipoEstadoAcademico;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public class ImplementacionEstadoAcademico implements EstadoAcademico {
    String legajo;
    Carrera carrera;
    TipoEstadoAcademico tipoEstadoAcademico;
    List<EstudianteMateria> estudianteMateriaList;
    Date fechaIngreso;
    Date fechaFinHabilitacion;

    @Override
    public List<EstudianteMateria> getEstudianteMateriaList() {
        return estudianteMateriaList;
    }

    @Override
    public void setEstudianteMateriaList(List<EstudianteMateria> estudianteMateriaList) {
        this.estudianteMateriaList = estudianteMateriaList;
    }
    
    
    @Override
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public Date getFechaFinHabilitacion() {
        return fechaFinHabilitacion;
    }

    @Override
    public void setFechaFinHabilitacion(Date fechaFinHabilitacion) {
        this.fechaFinHabilitacion = fechaFinHabilitacion;
    }

    @Override
    public Carrera getCarrera() {
        return carrera;
    }

    @Override
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

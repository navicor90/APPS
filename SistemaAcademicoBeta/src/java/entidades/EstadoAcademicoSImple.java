/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class EstadoAcademicoSImple {
    private String legajo;
    private String  estadoAcademico;
    private Carrera carrera;
    private List<EstudianteMateria> estudianteMateria;
    private Date fechaIngreso;
    private Date fechaBaja;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<EstudianteMateria> getEstudianteMateria() {
        return estudianteMateria;
    }

    public void setEstudianteMateria(List<EstudianteMateria> estudianteMateria) {
        this.estudianteMateria = estudianteMateria;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
}

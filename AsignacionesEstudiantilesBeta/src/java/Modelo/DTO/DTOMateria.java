/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class DTOMateria {

    private String estadoMateria;
    private Date fechaEstadoMateria;
    private Date fechaIngreso;
    private String legajo;
    private String nombreCarrera;
    private String nombreMateria;
    private Float notaMateria;
    private String planDeEstudio;

    public String getEstadoMateria() {
        return estadoMateria;
    }

    public void setEstadoMateria(String estadoMateria) {
        this.estadoMateria = estadoMateria;
    }

    public Date getFechaEstadoMateria() {
        return fechaEstadoMateria;
    }

    public void setFechaEstadoMateria(Date fechaEstadoMateria) {
        this.fechaEstadoMateria = fechaEstadoMateria;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Float getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(Float notaMateria) {
        this.notaMateria = notaMateria;
    }

    public String getPlanDeEstudio() {
        return planDeEstudio;
    }

    public void setPlanDeEstudio(String planDeEstudio) {
        this.planDeEstudio = planDeEstudio;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class Carrera {
    private Date fechaFinVigencia;
    private String nomCarrera;
    private Universidad univer;
    private EstadoCarrera estadoCarr;
    private PlanDeEstudio planEstudio;

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public Universidad getUniver() {
        return univer;
    }

    public void setUniver(Universidad univer) {
        this.univer = univer;
    }

    public EstadoCarrera getEstadoCarr() {
        return estadoCarr;
    }

    public void setEstadoCarr(EstadoCarrera estadoCarr) {
        this.estadoCarr = estadoCarr;
    }

    public PlanDeEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanDeEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }
    
    
}

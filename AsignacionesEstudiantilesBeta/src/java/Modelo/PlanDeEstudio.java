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
public class PlanDeEstudio {
    private int codPlanDeEstudion;
    private Date fechaFinVigencia;
    private String nombrePlanDeEstudio;
    private Materia materia;

    public int getCodPlanDeEstudion() {
        return codPlanDeEstudion;
    }

    public void setCodPlanDeEstudion(int codPlanDeEstudion) {
        this.codPlanDeEstudion = codPlanDeEstudion;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public String getNombrePlanDeEstudio() {
        return nombrePlanDeEstudio;
    }

    public void setNombrePlanDeEstudio(String nombrePlanDeEstudio) {
        this.nombrePlanDeEstudio = nombrePlanDeEstudio;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionPlanDeEstudio implements PlanDeEstudio{
    private int codigoPlanDeEstudion;
    private Date fechaFinVigencia;
    private String nombrePlanDeEstudio;
    private Materia materia;

    @Override
    public int getCodigoPlanDeEstudion() {
        return codigoPlanDeEstudion;
    }

    @Override
    public void setCodigoPlanDeEstudion(int codigoPlanDeEstudion) {
        this.codigoPlanDeEstudion = codigoPlanDeEstudion;
    }

    @Override
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public String getNombrePlanDeEstudio() {
        return nombrePlanDeEstudio;
    }

    @Override
    public void setNombrePlanDeEstudio(String nombrePlanDeEstudio) {
        this.nombrePlanDeEstudio = nombrePlanDeEstudio;
    }

    @Override
    public Materia getMateria() {
        return materia;
    }

    @Override
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}

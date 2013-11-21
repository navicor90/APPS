/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionEstadoCarrera;
import Modelo.implementacion.ImplementacionPlanDeEstudio;
import Modelo.implementacion.ImplementacionUniversidad;
import Modelo.interfaces.Carrera;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionCarrera implements Carrera{
    private Date fechaFinVigencia;
    private String nomCarrera;
    private Universidad universdad;
    private EstadoCarrera estadoCarrerra;
    private PlanDeEstudio planDeEstudio;

    @Override
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public String getNomCarrera() {
        return nomCarrera;
    }

    @Override
    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public Universidad getUniversdad() {
        return universdad;
    }

    public void setUniversdad(Universidad universdad) {
        this.universdad = universdad;
    }

    public EstadoCarrera getEstadoCarrerra() {
        return estadoCarrerra;
    }

    public void setEstadoCarrerra(EstadoCarrera estadoCarrerra) {
        this.estadoCarrerra = estadoCarrerra;
    }

    public PlanDeEstudio getPlanDeEstudio() {
        return planDeEstudio;
    }

    public void setPlanDeEstudio(PlanDeEstudio planDeEstudio) {
        this.planDeEstudio = planDeEstudio;
    }
    
    
    
}

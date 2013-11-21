/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.Carrera;
import Modelo.implementacion.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteCarrera implements Carrera {
    String oidUniversidad;
    boolean heBuscadoUniversdad;
    ImplementacionCarrera implementacionCarrera;

    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public boolean isHeBuscadoUniversdad() {
        return heBuscadoUniversdad;
    }

    public void setHeBuscadoUniversdad(boolean heBuscadoUniversdad) {
        this.heBuscadoUniversdad = heBuscadoUniversdad;
    }

    public ImplementacionCarrera getImplementacionCarrera() {
        return implementacionCarrera;
    }

    public void setImplementacionCarrera(ImplementacionCarrera implementacionCarrera) {
        this.implementacionCarrera = implementacionCarrera;
    }
    
    @Override
    public Date getFechaFinVigencia() {
        return implementacionCarrera.getFechaFinVigencia();
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        implementacionCarrera.setFechaFinVigencia(fechaFinVigencia);
    }

    @Override
    public String getNomCarrera() {
        return implementacionCarrera.getNomCarrera();
    }

    @Override
    public void setNomCarrera(String nomCarrera) {
        implementacionCarrera.setNomCarrera(nomCarrera);
    }

    @Override
    public Universidad getUniver() {
        return implementacionCarrera.getUniver();
    }

    @Override
    public void setUniver(ImplementacionUniversidad univer) {
        implementacionCarrera.setUniver(univer);
    }

    @Override
    public ImplementacionEstadoCarrera getEstadoCarr() {
        return implementacionCarrera.getEstadoCarr();
    }

    @Override
    public void setEstadoCarr(ImplementacionEstadoCarrera estadoCarr) {
        implementacionCarrera.setEstadoCarr(estadoCarr);
    }

    @Override
    public ImplementacionPlanDeEstudio getPlanEstudio() {
        return implementacionCarrera.getPlanEstudio();
    }

    @Override
    public void setPlanEstudio(ImplementacionPlanDeEstudio planEstudio) {
        implementacionCarrera.setPlanEstudio(planEstudio);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Modelo.implementacion.*;
import Controlador.Persistencia.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteCarrera extends Agente implements Carrera  {
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
    public String getNombreCarrera() {
        return implementacionCarrera.getNombreCarrera();
    }

    @Override
    public void setNombreCarrera(String nombreCarrera) {
        implementacionCarrera.setNombreCarrera(nombreCarrera);
    }

    @Override
    public Universidad getUniversdad() {
        return implementacionCarrera.getUniversdad();
    }

    @Override
    public void setUniversdad(Universidad universdad) {
        implementacionCarrera.setUniversdad(universdad);
    }

    @Override
    public TipoEstadoCarrera getEstadoCarrerra() {
        return implementacionCarrera.getEstadoCarrerra();
    }

    @Override
    public void setEstadoCarrerra(TipoEstadoCarrera estadoCarrerra) {
        implementacionCarrera.setEstadoCarrerra(estadoCarrerra);
    }

    @Override
    public PlanDeEstudio getPlanDeEstudio() {
        return implementacionCarrera.getPlanDeEstudio();
    }

    @Override
    public void setPlanDeEstudio(PlanDeEstudio planDeEstudio) {
        implementacionCarrera.setPlanDeEstudio(planDeEstudio);
    }
    
}

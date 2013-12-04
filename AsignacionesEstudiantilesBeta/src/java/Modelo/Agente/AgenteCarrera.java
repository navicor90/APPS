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
    private String oidUniversidad;
    private boolean heBuscadoUniversdad;
    private boolean heBuscadoTipoEstadoCarrera;
    private String oidTipoEstadoCarrera;
    private ImplementacionCarrera implementacionCarrera;

    public boolean isHeBuscadoTipoEstadoCarrera() {
        return heBuscadoTipoEstadoCarrera;
    }

    public void setHeBuscadoTipoEstadoCarrera(boolean heBuscadoTipoEstadoCarrera) {
        this.heBuscadoTipoEstadoCarrera = heBuscadoTipoEstadoCarrera;
    }

    public String getOidTipoEstadoCarrera() {
        return oidTipoEstadoCarrera;
    }

    public void setOidTipoEstadoCarrera(String oidTipoEstadoCarrera) {
        this.oidTipoEstadoCarrera = oidTipoEstadoCarrera;
    }
    
    
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
        Universidad universidad;
        if(this.isHeBuscadoUniversdad() || this.esNuevo()){
            universidad = implementacionCarrera.getUniversdad();
        }else{
            universidad = (Universidad) FachadaPersistenciaInterna.getInstancia().buscar("Universidad", this.getOidUniversidad());
            this.setHeBuscadoUniversdad(true);
            this.getImplementacionCarrera().setUniversdad(universidad);
        }
        return universidad;
    }

    @Override
    public void setUniversdad(Universidad universdad) {
        Agente agente = (Agente) universdad;
        this.setOidUniversidad(agente.getOid());
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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Agente;

import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author yanina
 */
public class AgenteProyectoCargo extends Agente implements ProyectoCargo {

    private String oidProyecto;
    private String oidTipoCargo;
    private boolean heBuscadoProyectoCargoCarrrera;
    private boolean heBuscadoProyecto;
    private boolean heBuscadoTipoCargo;
    private boolean heBuscadoProyectoCargoEstado;
    private ImplementacionProyectoCargo implementacionProyectoCargo;

    public AgenteProyectoCargo() {
        heBuscadoProyecto=false;
        heBuscadoProyectoCargoCarrrera=false;
        heBuscadoTipoCargo=false;
    }

    public boolean isHeBuscadoProyectoCargoEstado() {
        return heBuscadoProyectoCargoEstado;
    }

    public void setHeBuscadoProyectoCargoEstado(boolean heBuscadoProyectoCargoEstado) {
        this.heBuscadoProyectoCargoEstado = heBuscadoProyectoCargoEstado;
    }
    
    public boolean isHeBuscadoProyectoCargoCarrrera() {
        return heBuscadoProyectoCargoCarrrera;
    }

    public void setHeBuscadoProyectoCargoCarrrera(boolean heBuscadoProyectoCargoCarrrera) {
        this.heBuscadoProyectoCargoCarrrera = heBuscadoProyectoCargoCarrrera;
    }

    public boolean isHeBuscadoProyecto() {
        return heBuscadoProyecto;
    }

    public void setHeBuscadoProyecto(boolean heBuscadoProyecto) {
        this.heBuscadoProyecto = heBuscadoProyecto;
    }

    public boolean isHeBuscadoTipoCargo() {
        return heBuscadoTipoCargo;
    }

    public void setHeBuscadoTipoCargo(boolean heBuscadoTipoCargo) {
        this.heBuscadoTipoCargo = heBuscadoTipoCargo;
    }
    
    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }


    public String getOidTipoCargo() {
        return oidTipoCargo;
    }

    public void setOidTipoCargo(String oidTipoCargo) {
        this.oidTipoCargo = oidTipoCargo;
    }

    public ImplementacionProyectoCargo getImplementacionProyectoCargo() {
        return implementacionProyectoCargo;
    }

    public void setImplementacionProyectoCargo(ImplementacionProyectoCargo implementacionProyectoCargo) {
        this.implementacionProyectoCargo = implementacionProyectoCargo;
    }

    @Override
    public int getCantidadMinimaPostulacion() {
        return implementacionProyectoCargo.getCantidadMinimaPostulacion();
    }

    @Override
    public void setCantidadMinimaPostulacion(int cantidadMinimaPostulacion) {
        implementacionProyectoCargo.setCantidadMinimaPostulacion(cantidadMinimaPostulacion);
    }

    @Override
    public String getDescripcion() {
        return implementacionProyectoCargo.getDescripcion();
    }

    @Override
    public void setDescripcion(String descripcion) {
        implementacionProyectoCargo.setDescripcion(descripcion);
    }

    @Override
    public Boolean isHabilitado() {
        return implementacionProyectoCargo.isHabilitado();
    }

    @Override
    public void setHabilitado(Boolean habilitado) {
        implementacionProyectoCargo.setHabilitado(habilitado);
    }

    @Override
    public int getNroProyectoCargo() {
        return implementacionProyectoCargo.getNroProyectoCargo();
    }

    @Override
    public void setNroProyectoCargo(int nroProyectoCargo) {
        implementacionProyectoCargo.setNroProyectoCargo(nroProyectoCargo);
    }

    @Override
    public List<ProyectoCargoEstado> getProyectoCargoEstadoList() {
        return implementacionProyectoCargo.getProyectoCargoEstadoList();
    }

    @Override
    public void setProyectoCargoEstadoList(List<ProyectoCargoEstado> proyectoCargoEstado) {
        implementacionProyectoCargo.setProyectoCargoEstadoList(proyectoCargoEstado);
        this.setHeBuscadoProyectoCargoEstado(true);
    }

    @Override
    public void addProyectoCargoEstado(ProyectoCargoEstado proyectoCargoEstado) {
        implementacionProyectoCargo.addProyectoCargoEstado(proyectoCargoEstado);
    }
    

    @Override
    public TipoCargo getTipoCargo()  {
        TipoCargo tipoCargo = null;
        if (heBuscadoTipoCargo) {
            tipoCargo = implementacionProyectoCargo.getTipoCargo();
        } else {
            tipoCargo = (TipoCargo) FachadaPersistenciaInterna.getInstancia().buscar("TipoCargo", oidTipoCargo);
            this.setTipoCargo(tipoCargo);
        }
        return tipoCargo;
    }

    @Override
    public void setTipoCargo(TipoCargo tipoCargo) {
        implementacionProyectoCargo.setTipoCargo(tipoCargo);
        this.setHeBuscadoTipoCargo(true);
    }

    @Override
    public Proyecto getProyecto() {
        Proyecto proyecto = null;
        if (heBuscadoProyecto) {
            proyecto = implementacionProyectoCargo.getProyecto();
        } else {
            proyecto = (Proyecto) FachadaPersistenciaInterna.getInstancia().buscar("Proyecto", oidProyecto);
            this.setProyecto(proyecto);
        }
        return proyecto;
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        implementacionProyectoCargo.setProyecto(proyecto);
        heBuscadoProyecto=true;
    }

    @Override
    public ProyectoCargoCarrera getProyectoCargoCarrera() {
        ProyectoCargoCarrera proyectoCargoCarrera ;
        if(heBuscadoProyectoCargoCarrrera){
            proyectoCargoCarrera = implementacionProyectoCargo.getProyectoCargoCarrera();
        }else{
            Criterio criterioBusquedaProyectoCargoCarrera = (Criterio) FabricaCriterio.getInstancia().crear("proyectoCargo", "=", this);
            List<Object> proyectoCargoCarrerasList = FachadaPersistenciaInterna.getInstancia().buscar("ProyectoCargoCarrera", criterioBusquedaProyectoCargoCarrera);
            proyectoCargoCarrera = (ProyectoCargoCarrera) proyectoCargoCarrerasList.get(0);
            this.setProyectoCargoCarrera(proyectoCargoCarrera);
        }
        return proyectoCargoCarrera;
    }

    @Override
    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera) {
        implementacionProyectoCargo.setProyectoCargoCarrera(proyectoCargoCarrera);
        this.setHeBuscadoProyectoCargoCarrrera(true);
    }

    @Override
    public double getHorasDedicadas() {
        return implementacionProyectoCargo.getHorasDedicadas();
    }

    @Override
    public void setHorasDedicadas(double horasDedicadas) {
        implementacionProyectoCargo.setHorasDedicadas(horasDedicadas);
    }

}

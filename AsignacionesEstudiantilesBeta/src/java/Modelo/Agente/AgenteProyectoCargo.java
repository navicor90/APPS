/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Agente;

import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.implementacion.*;
import Modelo.interfaces.*;

import java.util.List;

/**
 *
 * @author yanina
 */
public class AgenteProyectoCargo extends Agente implements ProyectoCargo {

    String oidProyecto;
    String oidTipoCargo;
    String oidProyectoCargoCarrera;
    boolean heBuscadoProyectoCargoCarrrera;
    boolean heBuscadoProyecto;
    boolean heBuscadoTipoCargo;
    ImplementacionProyectoCargo implementacionProyectoCargo;

    public AgenteProyectoCargo() {
        heBuscadoProyecto=false;
        heBuscadoProyectoCargoCarrrera=false;
        heBuscadoTipoCargo=false;
    }
    
    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }

    public String getOidProyectoCargoCarrera() {
        return oidProyectoCargoCarrera;
    }

    public void setOidProyectoCargoCarrera(String oidProyectoCargoCarrera) {
        this.oidProyectoCargoCarrera = oidProyectoCargoCarrera;
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
    public List<ImplementacionProyectoCargoEstado> getProyectoCargoEstado() {
        return implementacionProyectoCargo.getProyectoCargoEstado();
    }

    @Override
    public void setProyectoCargoEstado(List<ImplementacionProyectoCargoEstado> proyectoCargoEstado) {
        implementacionProyectoCargo.setProyectoCargoEstado(proyectoCargoEstado);
    }

    @Override
    public TipoCargo getTipoCargo() {
        TipoCargo tipoCargo = null;
        if (heBuscadoTipoCargo) {
            tipoCargo = implementacionProyectoCargo.getTipoCargo();
        } else {
            tipoCargo = (TipoCargo) FachadaPersistenciaInterna.getInstancia().buscar("TipoCargo", oidTipoCargo);
            System.out.println(tipoCargo.getNomTipoCargo()+"---------------");
            implementacionProyectoCargo.setTipoCargo(tipoCargo);
        }
        return tipoCargo;
    }

    @Override
    public void setTipoCargo(TipoCargo tipoCargo) {
        implementacionProyectoCargo.setTipoCargo(tipoCargo);
        heBuscadoTipoCargo=true;
    }

    @Override
    public Proyecto getProyecto() {
        Proyecto proyecto = null;
        if (heBuscadoProyecto) {
            proyecto = implementacionProyectoCargo.getProyecto();
        } else {
            proyecto = (Proyecto) FachadaPersistenciaInterna.getInstancia().buscar(oidProyecto, "Proyecto");
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
        return implementacionProyectoCargo.getProyectoCargoCarrera();
    }

    @Override
    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera) {
        implementacionProyectoCargo.setProyectoCargoCarrera(proyectoCargoCarrera);
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

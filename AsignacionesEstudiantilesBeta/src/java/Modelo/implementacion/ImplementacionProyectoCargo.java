/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoCargo implements ProyectoCargo{
    private int cantidadMinimaPostulacion;
    private String descripcion;
    private Boolean habilitado;
    private double horasDedicadas;
    private int nroProyectoCargo;
    private List <ProyectoCargoEstado> proyectoCargoEstadoList;
    private TipoCargo tipoCargo;
    private ProyectoCargoCarrera proyectoCargoCarrera;

    @Override
    public int getCantidadMinimaPostulacion() {
        return cantidadMinimaPostulacion;
    }

    @Override
    public void setCantidadMinimaPostulacion(int cantidadMinimaPostulacion) {
        this.cantidadMinimaPostulacion = cantidadMinimaPostulacion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Boolean isHabilitado() {
        return habilitado;
    }

    @Override
    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double getHorasDedicadas() {
        return horasDedicadas;
    }

    @Override
    public void setHorasDedicadas(double horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    

    @Override
    public int getNroProyectoCargo() {
        return nroProyectoCargo;
    }

    @Override
    public void setNroProyectoCargo(int nroProyectoCargo) {
        this.nroProyectoCargo = nroProyectoCargo;
    }

    @Override
    public List<ProyectoCargoEstado> getProyectoCargoEstadoList() {
        return proyectoCargoEstadoList;
    }

    @Override
    public void setProyectoCargoEstadoList(List<ProyectoCargoEstado> proyectoCargoEstadoList) {
        this.proyectoCargoEstadoList = proyectoCargoEstadoList;
    }
    
    
    @Override
    public void addProyectoCargoEstado(ProyectoCargoEstado proyectoCargoEstado){
        proyectoCargoEstadoList.add(proyectoCargoEstado);
    }
    
    @Override
    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    @Override
    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    @Override
    public ProyectoCargoCarrera getProyectoCargoCarrera() {
        return proyectoCargoCarrera;
    }

    @Override
    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera) {
        this.proyectoCargoCarrera = proyectoCargoCarrera;
    }
}

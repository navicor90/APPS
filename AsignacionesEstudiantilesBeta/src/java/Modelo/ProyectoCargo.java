/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ProyectoCargo {
    private int cantMinPostulacion;
    private String descripcion;
    private Boolean habilitado;
    private double horasDedicadas;
    private int nroProyectoCargo;
    private List <ProyectoCargoEstado> proyCarEstado;
    private TipoCargo tipoCargo;
    private Proyecto proy;
    private ProyectoCargoCarrera proyCargCarrera;
    
    public ProyectoCargo(List<ProyectoCargoEstado> proyCarEstado) {
        this.proyCarEstado = proyCarEstado;
    }

    public int getCantMinPostulacion() {
        return cantMinPostulacion;
    }

    public void setCantMinPostulacion(int cantMinPostulacion) {
        this.cantMinPostulacion = cantMinPostulacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public double getHorasDedicadas() {
        return horasDedicadas;
    }

    public void setHorasDedicadas(double horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    public int getNroProyectoCargo() {
        return nroProyectoCargo;
    }

    public void setNroProyectoCargo(int nroProyectoCargo) {
        this.nroProyectoCargo = nroProyectoCargo;
    }

    public List<ProyectoCargoEstado> getProyCarEstado() {
        return proyCarEstado;
    }

    public void setProyCarEstado(List<ProyectoCargoEstado> proyCarEstado) {
        this.proyCarEstado = proyCarEstado;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public Proyecto getProy() {
        return proy;
    }

    public void setProy(Proyecto proy) {
        this.proy = proy;
    }

    public ProyectoCargoCarrera getProyCargCarrera() {
        return proyCargCarrera;
    }

    public void setProyCargCarrera(ProyectoCargoCarrera proyCargCarrera) {
        this.proyCargCarrera = proyCargCarrera;
    }
    
    
            
            
    
}

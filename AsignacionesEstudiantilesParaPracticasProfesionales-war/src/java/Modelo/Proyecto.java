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
public class Proyecto {
    private String descripcion;
    private int duracion;
    private Date fechaInicio;
    private Date fechaFinPostulacion;
    private String nomProyecto;
    private Empresa empresa;
    private ProyectoCargo proyectoCargo;
    private Universidad universidad;
    private List<ProyectoEstado> proyEstado;
    private TipoSeleccion tipoSeleccion;

    public Proyecto(List<ProyectoEstado> proyEstado) {
        this.proyEstado = proyEstado;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinPostulacion() {
        return fechaFinPostulacion;
    }

    public void setFechaFinPostulacion(Date fechaFinPostulacion) {
        this.fechaFinPostulacion = fechaFinPostulacion;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public List<ProyectoEstado> getProyEstado() {
        return proyEstado;
    }

    public void setProyEstado(List<ProyectoEstado> proyEstado) {
        this.proyEstado = proyEstado;
    }

    public TipoSeleccion getTipoSeleccion() {
        return tipoSeleccion;
    }

    public void setTipoSeleccion(TipoSeleccion tipoSeleccion) {
        this.tipoSeleccion = tipoSeleccion;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionTipoSeleccion;
import Modelo.implementacion.ImplementacionUniversidad;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionImplementacionProyecto {
    private String descripcion;
    private int duracion;
    private Date fechaInicio;
    private Date fechaFinPostulacion;
    private String nomProyecto;
    private ImplementacionEmpresa empresa;
    private ImplementacionProyectoCargo proyectoCargo;
    private ImplementacionUniversidad universidad;
    private List<ImplementacionProyectoEstado> proyEstado;
    private ImplementacionTipoSeleccion tipoSeleccion;

    public ImplementacionImplementacionProyecto(List<ImplementacionProyectoEstado> proyEstado) {
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

    public ImplementacionEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ImplementacionEmpresa empresa) {
        this.empresa = empresa;
    }

    public ImplementacionProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(ImplementacionProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    public ImplementacionUniversidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ImplementacionUniversidad universidad) {
        this.universidad = universidad;
    }

    public List<ImplementacionProyectoEstado> getProyEstado() {
        return proyEstado;
    }

    public void setProyEstado(List<ImplementacionProyectoEstado> proyEstado) {
        this.proyEstado = proyEstado;
    }

    public ImplementacionTipoSeleccion getTipoSeleccion() {
        return tipoSeleccion;
    }

    public void setTipoSeleccion(ImplementacionTipoSeleccion tipoSeleccion) {
        this.tipoSeleccion = tipoSeleccion;
    }
    
    
    
}

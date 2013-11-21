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
public class ImplementacionProyecto implements Proyecto{
    private String descripcion;
    private int duracion;
    private Date fechaInicio;
    private Date fechaFinPostulacion;
    private String nombreProyecto;
    private Empresa empresa;
    private ProyectoCargo proyectoCargo;
    private Universidad universidad;
    private List<ProyectoEstado> proyectoEstado;
    private TipoSeleccion tipoSeleccion;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public Date getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public Date getFechaFinPostulacion() {
        return fechaFinPostulacion;
    }

    @Override
    public void setFechaFinPostulacion(Date fechaFinPostulacion) {
        this.fechaFinPostulacion = fechaFinPostulacion;
    }

    @Override
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    @Override
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    @Override
    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public ProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    @Override
    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    @Override
    public Universidad getUniversidad() {
        return universidad;
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public List<ProyectoEstado> getProyectoEstado() {
        return proyectoEstado;
    }

    @Override
    public void setProyectoEstado(List<ProyectoEstado> proyectoEstado) {
        this.proyectoEstado = proyectoEstado;
    }

    @Override
    public TipoSeleccion getTipoSeleccion() {
        return tipoSeleccion;
    }

    @Override
    public void setTipoSeleccion(TipoSeleccion tipoSeleccion) {
        this.tipoSeleccion = tipoSeleccion;
    }
    
}

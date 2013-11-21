/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionSeleccion implements Seleccion{
    private Date fechaHoraSeleccion;
    private int nroSeleccion;
    private Proyecto proyecto;
    private TipoEstadoSeleccion estadoSeleccion;
    private SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo;

    @Override
    public Date getFechaHoraSeleccion() {
        return fechaHoraSeleccion;
    }

    @Override
    public void setFechaHoraSeleccion(Date fechaHoraSeleccion) {
        this.fechaHoraSeleccion = fechaHoraSeleccion;
    }

    @Override
    public int getNroSeleccion() {
        return nroSeleccion;
    }

    @Override
    public void setNroSeleccion(int nroSeleccion) {
        this.nroSeleccion = nroSeleccion;
    }

    @Override
    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public TipoEstadoSeleccion getEstadoSeleccion() {
        return estadoSeleccion;
    }

    @Override
    public void setEstadoSeleccion(TipoEstadoSeleccion estadoSeleccion) {
        this.estadoSeleccion = estadoSeleccion;
    }

    @Override
    public SeleccionPostulacionProyectoCargo getSeleccionPostulacionProyectoCargo() {
        return seleccionPostulacionProyectoCargo;
    }

    @Override
    public void setSeleccionPostulacionProyectoCargo(SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo) {
        this.seleccionPostulacionProyectoCargo = seleccionPostulacionProyectoCargo;
    }

}

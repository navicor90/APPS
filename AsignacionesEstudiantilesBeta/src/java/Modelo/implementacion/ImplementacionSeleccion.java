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
public class ImplementacionSeleccion {
    private Date fechaHoraSeleccion;
    private int nroSeleccion;
    private Proyecto proyecto;
    private EstadoSeleccion estadoSeleccion;
    private SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo;

    public Date getFechaHoraSeleccion() {
        return fechaHoraSeleccion;
    }

    public void setFechaHoraSeleccion(Date fechaHoraSeleccion) {
        this.fechaHoraSeleccion = fechaHoraSeleccion;
    }

    public int getNroSeleccion() {
        return nroSeleccion;
    }

    public void setNroSeleccion(int nroSeleccion) {
        this.nroSeleccion = nroSeleccion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public EstadoSeleccion getEstadoSeleccion() {
        return estadoSeleccion;
    }

    public void setEstadoSeleccion(EstadoSeleccion estadoSeleccion) {
        this.estadoSeleccion = estadoSeleccion;
    }

    public SeleccionPostulacionProyectoCargo getSeleccionPostulacionProyectoCargo() {
        return seleccionPostulacionProyectoCargo;
    }

    public void setSeleccionPostulacionProyectoCargo(SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo) {
        this.seleccionPostulacionProyectoCargo = seleccionPostulacionProyectoCargo;
    }

}

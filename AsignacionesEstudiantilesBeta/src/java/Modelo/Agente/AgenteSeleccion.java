/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Controlador.Persistencia.*;
import Modelo.implementacion.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteSeleccion extends Agente implements Seleccion{
    String oidProyecto;
    boolean heBuscadoProyecto;
    ImplementacionSeleccion implementacionSeleccion;

    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }

    public boolean isHeBuscadoProyecto() {
        return heBuscadoProyecto;
    }

    public void setHeBuscadoProyecto(boolean heBuscadoProyecto) {
        this.heBuscadoProyecto = heBuscadoProyecto;
    }

    public ImplementacionSeleccion getImplementacionSeleccion() {
        return implementacionSeleccion;
    }

    public void setImplementacionSeleccion(ImplementacionSeleccion implementacionSeleccion) {
        this.implementacionSeleccion = implementacionSeleccion;
    }
    
    
    @Override
    public Date getFechaHoraSeleccion() {
        return implementacionSeleccion.getFechaHoraSeleccion();
    }

    @Override
    public void setFechaHoraSeleccion(Date fechaHoraSeleccion) {
        implementacionSeleccion.setFechaHoraSeleccion(fechaHoraSeleccion);
    }

    @Override
    public int getNroSeleccion() {
        return implementacionSeleccion.getNroSeleccion();
    }

    @Override
    public void setNroSeleccion(int nroSeleccion) {
        implementacionSeleccion.setNroSeleccion(nroSeleccion);
    }

    @Override
    public Proyecto getProyecto() {
        return implementacionSeleccion.getProyecto();
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        implementacionSeleccion.setProyecto(proyecto);
    }

    @Override
    public TipoEstadoSeleccion getEstadoSeleccion() {
        return implementacionSeleccion.getEstadoSeleccion();
    }

    @Override
    public void setEstadoSeleccion(TipoEstadoSeleccion estadoSeleccion) {
        implementacionSeleccion.setEstadoSeleccion(estadoSeleccion);
    }

    @Override
    public SeleccionPostulacionProyectoCargo getSeleccionPostulacionProyectoCargo() {
        return implementacionSeleccion.getSeleccionPostulacionProyectoCargo();
    }

    @Override
    public void setSeleccionPostulacionProyectoCargo(SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo) {
        implementacionSeleccion.setSeleccionPostulacionProyectoCargo(seleccionPostulacionProyectoCargo);
    }
    
}

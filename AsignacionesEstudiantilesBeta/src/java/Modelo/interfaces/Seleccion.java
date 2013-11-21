/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import java.util.Date;

/**
 *
 * @author yanina
 */
public interface Seleccion {
    public Date getFechaHoraSeleccion();

    public void setFechaHoraSeleccion(Date fechaHoraSeleccion);

    public int getNroSeleccion();

    public void setNroSeleccion(int nroSeleccion);

    public Proyecto getProyecto();

    public void setProyecto(Proyecto proyecto);

    public EstadoSeleccion getEstadoSeleccion();

    public void setEstadoSeleccion(EstadoSeleccion estadoSeleccion);

    public SeleccionPostulacionProyectoCargo getSeleccionPostulacionProyectoCargo();

    public void setSeleccionPostulacionProyectoCargo(SeleccionPostulacionProyectoCargo seleccionPostulacionProyectoCargo);
    
}

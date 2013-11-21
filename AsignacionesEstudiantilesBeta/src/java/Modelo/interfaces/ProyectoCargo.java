/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import Modelo.implementacion.ImplementacionProyectoCargoEstado;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public interface ProyectoCargo {
    
    public int getCantidadMinimaPostulacion();

    public void setCantidadMinimaPostulacion(int cantidadMinimaPostulacion);

    public String getDescripcion();

    public void setDescripcion(String descripcion);

    public Boolean isHabilitado();

    public void setHabilitado(Boolean habilitado);

    public Date getHorasDedicadas();

    public void setHorasDedicadas(Date horasDedicadas);

    public int getNroProyectoCargo();

    public void setNroProyectoCargo(int nroProyectoCargo);

    public List<ImplementacionProyectoCargoEstado> getProyectoCargoEstado();

    public void setProyectoCargoEstado(List<ImplementacionProyectoCargoEstado> proyectoCargoEstado);

    public TipoCargo getTipoCargo();

    public void setTipoCargo(TipoCargo tipoCargo);

    public Proyecto getProyecto();

    public void setProyecto(Proyecto proyecto);

    public ProyectoCargoCarrera getProyectoCargoCarrera();

    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera);

}

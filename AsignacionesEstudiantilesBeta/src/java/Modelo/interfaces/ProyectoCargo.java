/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

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

    public double getHorasDedicadas();

    public void setHorasDedicadas(double horasDedicadas);

    public int getNroProyectoCargo();

    public void setNroProyectoCargo(int nroProyectoCargo);

    public List<ProyectoCargoEstado> getProyectoCargoEstadoList();

    public void setProyectoCargoEstadoList(List<ProyectoCargoEstado> proyectoCargoEstado);
    
    public void addProyectoCargoEstado(ProyectoCargoEstado proyectoCargoEstado);

    public TipoCargo getTipoCargo() ;

    public void setTipoCargo(TipoCargo tipoCargo);

    public ProyectoCargoCarrera getProyectoCargoCarrera();

    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera);

}

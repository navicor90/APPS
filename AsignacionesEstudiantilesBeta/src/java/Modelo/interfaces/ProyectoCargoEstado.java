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
public interface ProyectoCargoEstado {
    
    public Date getFechahoraCambioEstado();

    public void setFechahoraCambioEstado(Date fechahoraCambioEstado);

    public TipoEstadoProyectoCargo getTipoEstadoProyectoCargo();

    public void setTipoEstadoProyectoCargo(TipoEstadoProyectoCargo tipoEstadoProyectoCargo);

    
}

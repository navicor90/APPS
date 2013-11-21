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
public class ImplementacionProyectoCargoEstado implements ProyectoCargoEstado{
    private Date fechahoraCambioEstado;
    private TipoEstadoProyectoCargo tipoEstadoProyectoCargo;

    @Override
    public Date getFechahoraCambioEstado() {
        return fechahoraCambioEstado;
    }

    @Override
    public void setFechahoraCambioEstado(Date fechahoraCambioEstado) {
        this.fechahoraCambioEstado = fechahoraCambioEstado;
    }

    @Override
    public TipoEstadoProyectoCargo getTipoEstadoProyectoCargo() {
        return tipoEstadoProyectoCargo;
    }

    @Override
    public void setTipoEstadoProyectoCargo(TipoEstadoProyectoCargo tipoEstadoProyectoCargo) {
        this.tipoEstadoProyectoCargo = tipoEstadoProyectoCargo;
    }

    
}

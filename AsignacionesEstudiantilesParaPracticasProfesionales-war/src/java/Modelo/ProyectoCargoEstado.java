/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class ProyectoCargoEstado {
    private Date fechahoraCambioEstado;
    private TipoEstadoProyectoCargo estadoProycarg;

    public Date getFechahoraCambioEstado() {
        return fechahoraCambioEstado;
    }

    public void setFechahoraCambioEstado(Date fechahoraCambioEstado) {
        this.fechahoraCambioEstado = fechahoraCambioEstado;
    }

    public TipoEstadoProyectoCargo getEstadoProycarg() {
        return estadoProycarg;
    }

    public void setEstadoProycarg(TipoEstadoProyectoCargo estadoProycarg) {
        this.estadoProycarg = estadoProycarg;
    }
    
    
}

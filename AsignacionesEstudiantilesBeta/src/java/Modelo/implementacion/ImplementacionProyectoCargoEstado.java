/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoCargoEstado {
    private Date fechahoraCambioEstado;
    private ImplementacionTipoEstadoProyectoCargo estadoProycarg;

    public Date getFechahoraCambioEstado() {
        return fechahoraCambioEstado;
    }

    public void setFechahoraCambioEstado(Date fechahoraCambioEstado) {
        this.fechahoraCambioEstado = fechahoraCambioEstado;
    }

    public ImplementacionTipoEstadoProyectoCargo getEstadoProycarg() {
        return estadoProycarg;
    }

    public void setEstadoProycarg(ImplementacionTipoEstadoProyectoCargo estadoProycarg) {
        this.estadoProycarg = estadoProycarg;
    }
    
    
}

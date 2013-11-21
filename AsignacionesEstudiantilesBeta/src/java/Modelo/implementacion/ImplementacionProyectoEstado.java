/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionTipoEstadoProyecto;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoEstado {
    private Date fechaHoraCambio;
    private ImplementacionTipoEstadoProyecto tipoEstProy;

    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    public ImplementacionTipoEstadoProyecto getTipoEstProy() {
        return tipoEstProy;
    }

    public void setTipoEstProy(ImplementacionTipoEstadoProyecto tipoEstProy) {
        this.tipoEstProy = tipoEstProy;
    }
    
    
    
}

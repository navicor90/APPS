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
public class ImplementacionPostulacionProyectoCargoEstado implements PostulacionProyectoCargoEstado{
    private Date fechaHoraCambio;
    private TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo;

    @Override
    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    @Override
    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    @Override
    public TipoEstadoPostulacionProyectoCargo getTipoEstadoPostulacionProyectoCargo() {
        return tipoEstadoPostulacionProyectoCargo;
    }

    @Override
    public void setTipoEstadoPostulacionProyectoCargo(TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo) {
        this.tipoEstadoPostulacionProyectoCargo = tipoEstadoPostulacionProyectoCargo;
    }
    
        
}

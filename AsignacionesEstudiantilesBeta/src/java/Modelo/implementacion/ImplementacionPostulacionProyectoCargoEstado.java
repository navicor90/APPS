/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionTipoEstadoPostulacionProyectoCargo;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionPostulacionProyectoCargoEstado {
    private Date fechaHoraCambio;
    private ImplementacionTipoEstadoPostulacionProyectoCargo estPotulacion;

    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    public ImplementacionTipoEstadoPostulacionProyectoCargo getEstPotulacion() {
        return estPotulacion;
    }

    public void setEstPotulacion(ImplementacionTipoEstadoPostulacionProyectoCargo estPotulacion) {
        this.estPotulacion = estPotulacion;
    }
    
    
}

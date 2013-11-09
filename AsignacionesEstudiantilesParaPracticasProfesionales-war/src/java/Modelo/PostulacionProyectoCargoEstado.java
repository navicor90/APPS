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
public class PostulacionProyectoCargoEstado {
    private Date fechaHoraCambio;
    private TipoEstadoPostulacionProyectoCargo estPotulacion;

    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    public TipoEstadoPostulacionProyectoCargo getEstPotulacion() {
        return estPotulacion;
    }

    public void setEstPotulacion(TipoEstadoPostulacionProyectoCargo estPotulacion) {
        this.estPotulacion = estPotulacion;
    }
    
    
}

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
public interface PostulacionProyectoCargoEstado {
    public Date getFechaHoraCambio();

    public void setFechaHoraCambio(Date fechaHoraCambio);

    public TipoEstadoPostulacionProyectoCargo getTipoEstadoPostulacionProyectoCargo();

    public void setTipoEstadoPostulacionProyectoCargo(TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo);
}

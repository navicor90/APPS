/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class ImplementacionTipoEstadoSeleccionPostulacionProyectoCargo implements TipoEstadoSeleccionPostulacionProyectoCargo {

    private int codigoSeleccionProyectoCargo;
    private String nombreSeleccionProyectoCargo;

    @Override
    public int getCodigoSeleccionProyectoCargo() {
        return codigoSeleccionProyectoCargo;
    }

    @Override
    public void setCodigoSeleccionProyectoCargo(int codigoSeleccionProyectoCargo) {
        this.codigoSeleccionProyectoCargo = codigoSeleccionProyectoCargo;
    }

    @Override
    public String getNombreSeleccionProyectoCargo() {
        return nombreSeleccionProyectoCargo;
    }

    @Override
    public void setNombreSeleccionProyectoCargo(String nombreSeleccionProyectoCargo) {
        this.nombreSeleccionProyectoCargo = nombreSeleccionProyectoCargo;
    }

}

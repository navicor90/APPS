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
public class ImplementacionTipoEstadoSeleccion implements TipoEstadoSeleccion{

    private String tipoNombreEstadoSeleccion;

    @Override
    public String getTipoNombreEstadoSeleccion() {
        return tipoNombreEstadoSeleccion;
    }

    @Override
    public void setTipoNombreEstadoSeleccion(String tipoNombreEstadoSeleccion) {
        this.tipoNombreEstadoSeleccion = tipoNombreEstadoSeleccion;
    }

}

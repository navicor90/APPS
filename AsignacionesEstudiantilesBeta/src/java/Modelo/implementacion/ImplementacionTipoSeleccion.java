/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.TipoSeleccion;

/**
 *
 * @author yanina
 */
public class ImplementacionTipoSeleccion implements TipoSeleccion{
    private String nomTipoSeleccion;

    @Override
    public String getNomTipoSeleccion() {
        return nomTipoSeleccion;
    }

    @Override
    public void setNomTipoSeleccion(String nomTipoSeleccion) {
        this.nomTipoSeleccion = nomTipoSeleccion;
    }
    
}

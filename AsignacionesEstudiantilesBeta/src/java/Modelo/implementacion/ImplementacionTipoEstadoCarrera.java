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
public class ImplementacionTipoEstadoCarrera  implements TipoEstadoCarrera{
    private String nombreTipoEstadoCarrera;

    @Override
    public String getNombreTipoEstadoCarrera() {
        return nombreTipoEstadoCarrera;
    }

    @Override
    public void setNombreTipoEstadoCarrera(String nombreTipoEstadoCarrera) {
        this.nombreTipoEstadoCarrera = nombreTipoEstadoCarrera;
    }

    
    
}

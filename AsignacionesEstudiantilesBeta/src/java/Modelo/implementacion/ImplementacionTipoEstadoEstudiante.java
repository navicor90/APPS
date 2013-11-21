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
public class ImplementacionTipoEstadoEstudiante implements TipoEstadoEstudiante {

    private String nombreTipoEstadoEstudiante;

    @Override
    public String getNombreTipoEstadoEstudiante() {
        return nombreTipoEstadoEstudiante;
    }

    @Override
    public void setNombreTipoEstadoEstudiante(String nombreTipoEstadoEstudiante) {
        this.nombreTipoEstadoEstudiante = nombreTipoEstadoEstudiante;
    }

}

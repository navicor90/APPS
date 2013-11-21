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
public class ImplementacionTipoIdentificacionFiscal implements TipoIdentificacionFiscal{

    private String nombreTipoIdentificacionFiscal;

    @Override
    public String getNombreTipoIdentificacionFiscal() {
        return nombreTipoIdentificacionFiscal;
    }

    @Override
    public void setNombreTipoIdentificacionFiscal(String nombreTipoIdentificacionFiscal) {
        this.nombreTipoIdentificacionFiscal = nombreTipoIdentificacionFiscal;
    }

}

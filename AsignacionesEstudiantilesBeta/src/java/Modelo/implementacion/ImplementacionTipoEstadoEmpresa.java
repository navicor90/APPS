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
public class ImplementacionTipoEstadoEmpresa implements TipoEstadoEmpresa{

    private String nombreTipoEstadoEmpresa;

    @Override
    public String getNombreTipoEstadoEmpresa() {
        return nombreTipoEstadoEmpresa;
    }

    @Override
    public void setNombreTipoEstadoEmpresa(String nombreTipoEstadoEmpresa) {
        this.nombreTipoEstadoEmpresa = nombreTipoEstadoEmpresa;
    }

}

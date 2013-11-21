/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionEmpresaEstado implements EmpresaEstado{

    private Date fechaCambioEstadoEmpresa;
    private TipoEstadoEmpresa tipoEstadoEmpresa;

    @Override
    public Date getFechaCambioEstadoEmpresa() {
        return fechaCambioEstadoEmpresa;
    }

    @Override
    public void setFechaCambioEstadoEmpresa(Date fechaCambioEstadoEmpresa) {
        this.fechaCambioEstadoEmpresa = fechaCambioEstadoEmpresa;
    }

    @Override
    public TipoEstadoEmpresa getTipoEstadoEmpresa() {
        return tipoEstadoEmpresa;
    }

    @Override
    public void setTipoEstadoEmpresa(TipoEstadoEmpresa tipoEstadoEmpresa) {
        this.tipoEstadoEmpresa = tipoEstadoEmpresa;
    }

}

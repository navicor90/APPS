/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import java.util.Date;

/**
 *
 * @author milton
 */
public interface EmpresaEstado {
    public Date getFechaCambioEstadoEmpresa() ;

    public void setFechaCambioEstadoEmpresa(Date fechaCambioEstadoEmpresa) ;

    public TipoEstadoEmpresa getTipoEstadoEmpresa() ;

    public void setTipoEstadoEmpresa(TipoEstadoEmpresa tipoEstadoEmpresa) ;
}

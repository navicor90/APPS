/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionEstadoEmpresa;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionEmpresaEstado {
    private Date fechaEmpresaEstado;
    private ImplementacionEstadoEmpresa estEmp;

    public Date getFechaEmpresaEstado() {
        return fechaEmpresaEstado;
    }

    public void setFechaEmpresaEstado(Date fechaEmpresaEstado) {
        this.fechaEmpresaEstado = fechaEmpresaEstado;
    }

    public ImplementacionEstadoEmpresa getEstEmp() {
        return estEmp;
    }

    public void setEstEmp(ImplementacionEstadoEmpresa estEmp) {
        this.estEmp = estEmp;
    }
    
    
    
    
}

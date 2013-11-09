/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class EmpresaEstado {
    private Date fechaEmpresaEstado;
    private EstadoEmpresa estEmp;

    public Date getFechaEmpresaEstado() {
        return fechaEmpresaEstado;
    }

    public void setFechaEmpresaEstado(Date fechaEmpresaEstado) {
        this.fechaEmpresaEstado = fechaEmpresaEstado;
    }

    public EstadoEmpresa getEstEmp() {
        return estEmp;
    }

    public void setEstEmp(EstadoEmpresa estEmp) {
        this.estEmp = estEmp;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionContrato implements Contrato {
    private int codigoContrato;
    private Date fechaEmisionContrato;
    private ImplementacionEmpresa empresa;
    private List<ImplementacionPostulacionProyectoCargo> postulacionProyecCargo;
    private ImplementacionPostulacion postulacion;
    private ImplementacionContrato contrato;

    @Override
    public int getCodigoContrato() {
        return codigoContrato;
    }

    @Override
    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    @Override
    public Date getFechaEmisionContrato() {
        return fechaEmisionContrato;
    }

    @Override
    public void setFechaEmisionContrato(Date fechaEmisionContrato) {
        this.fechaEmisionContrato = fechaEmisionContrato;
    }

    @Override
    public ImplementacionEmpresa getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(ImplementacionEmpresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public List<ImplementacionPostulacionProyectoCargo> getPostulacionProyecCargo() {
        return postulacionProyecCargo;
    }

    @Override
    public void setPostulacionProyecCargo(List<ImplementacionPostulacionProyectoCargo> postulacionProyecCargo) {
        this.postulacionProyecCargo = postulacionProyecCargo;
    }

    @Override
    public ImplementacionPostulacion getPostulacion() {
        return postulacion;
    }

    @Override
    public void setPostulacion(ImplementacionPostulacion postulacion) {
        this.postulacion = postulacion;
    }

    @Override
    public ImplementacionContrato getContrato() {
        return contrato;
    }

    @Override
    public void setContrato(ImplementacionContrato contrato) {
        this.contrato = contrato;
    }

            
            
}

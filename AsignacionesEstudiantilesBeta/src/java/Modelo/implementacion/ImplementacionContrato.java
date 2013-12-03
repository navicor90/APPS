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
    private Empresa empresa;
    private List<PostulacionProyectoCargo> postulacionProyecCargo;
    private Postulacion postulacion;
    private List<ContratoEstado> contratoEstadoList;

 

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
    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public List<PostulacionProyectoCargo> getPostulacionProyecCargo() {
        return postulacionProyecCargo;
    }

    @Override
    public void setPostulacionProyecCargo(List<PostulacionProyectoCargo> postulacionProyecCargo) {
        this.postulacionProyecCargo = postulacionProyecCargo;
    }

    @Override
    public Postulacion getPostulacion() {
        return postulacion;
    }

    @Override
    public void setPostulacion(Postulacion postulacion) {
        this.postulacion = postulacion;
    }            

    @Override
    public List<ContratoEstado> getContratoEstadoList() {
        return contratoEstadoList;
    }

    @Override
    public void setContratoEstadoList(List<ContratoEstado> contratoEstadoList) {
        this.contratoEstadoList = contratoEstadoList;
    }

    @Override
    public void addContratoEstado(ContratoEstado contratoEstado) {
        this.contratoEstadoList.add(contratoEstado);
    }
    
}

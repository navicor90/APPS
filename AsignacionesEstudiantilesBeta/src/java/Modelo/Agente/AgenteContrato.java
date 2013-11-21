/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Controlador.Persistencia.*;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class AgenteContrato extends Agente implements Contrato{
    ImplementacionContrato implementacionContrato;

    public ImplementacionContrato getImplementacionContrato() {
        return implementacionContrato;
    }

    public void setImplementacionContrato(ImplementacionContrato implementacionContrato) {
        this.implementacionContrato = implementacionContrato;
    }
    
    
    @Override
    public int getCodigoContrato() {
        return implementacionContrato.getCodigoContrato();
    }

    @Override
    public void setCodigoContrato(int codigoContrato) {
        implementacionContrato.setCodigoContrato(codigoContrato);
    }

    @Override
    public Date getFechaEmisionContrato() {
        return  implementacionContrato.getFechaEmisionContrato();
    }

    @Override
    public void setFechaEmisionContrato(Date fechaEmisionContrato) {
        implementacionContrato.setFechaEmisionContrato(fechaEmisionContrato);
    }

    @Override
    public ImplementacionEmpresa getEmpresa() {
        return implementacionContrato.getEmpresa();
    }

    @Override
    public void setEmpresa(ImplementacionEmpresa empresa) {
        implementacionContrato.setEmpresa(empresa);
    }

    @Override
    public List<ImplementacionPostulacionProyectoCargo> getPostulacionProyecCargo() {
        return implementacionContrato.getPostulacionProyecCargo();
    }

    @Override
    public void setPostulacionProyecCargo(List<ImplementacionPostulacionProyectoCargo> postulacionProyecCargo) {
        implementacionContrato.setPostulacionProyecCargo(postulacionProyecCargo);
    }

    @Override
    public ImplementacionPostulacion getPostulacion() {
        return implementacionContrato.getPostulacion();
    }

    @Override
    public void setPostulacion(ImplementacionPostulacion postulacion) {
        implementacionContrato.setPostulacion(postulacion);
    }

    @Override
    public ImplementacionContrato getContrato() {
        return implementacionContrato.getContrato();
    }

    @Override
    public void setContrato(ImplementacionContrato contrato) {
        implementacionContrato.setContrato(contrato);
    }
    
}

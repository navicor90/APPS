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
    public boolean heBuscadoPostulacion;
    public boolean heBuscadoPostulacionProyectoCargo;

    public boolean isHeBuscadoPostulacion() {
        return heBuscadoPostulacion;
    }

    public void setHeBuscadoPostulacion(boolean heBuscadoPostulacion) {
        this.heBuscadoPostulacion = heBuscadoPostulacion;
    }

    public boolean isHeBuscadoPostulacionProyectoCargo() {
        return heBuscadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoPostulacionProyectoCargo(boolean heBuscadoPostulacionProyectoCargo) {
        this.heBuscadoPostulacionProyectoCargo = heBuscadoPostulacionProyectoCargo;
    }

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
    public Empresa getEmpresa() {
        return implementacionContrato.getEmpresa();
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        implementacionContrato.setEmpresa(empresa);
    }

    @Override
    public List<PostulacionProyectoCargo> getPostulacionProyecCargo() {
        return implementacionContrato.getPostulacionProyecCargo();
    }

    @Override
    public void setPostulacionProyecCargo(List<PostulacionProyectoCargo> postulacionProyecCargo) {
        implementacionContrato.setPostulacionProyecCargo(postulacionProyecCargo);
    }

    @Override
    public Postulacion getPostulacion() {
        return implementacionContrato.getPostulacion();
    }

    @Override
    public void setPostulacion(Postulacion postulacion) {
        implementacionContrato.setPostulacion(postulacion);
    }

    @Override
    public Contrato getContrato() {
        return implementacionContrato.getContrato();
    }

    @Override
    public void setContrato(Contrato contrato) {
        implementacionContrato.setContrato(contrato);
    }
    
}

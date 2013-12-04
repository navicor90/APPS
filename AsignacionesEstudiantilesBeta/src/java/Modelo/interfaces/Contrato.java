/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.interfaces;

import Modelo.implementacion.ImplementacionContrato;
import Modelo.implementacion.ImplementacionEmpresa;
import Modelo.implementacion.ImplementacionPostulacion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public interface Contrato {

    public int getCodigoContrato();

    public void setCodigoContrato(int codigoContrato);

    public Date getFechaEmisionContrato();

    public void setFechaEmisionContrato(Date fechaEmisionContrato);

    public Empresa getEmpresa();

    public void setEmpresa(Empresa empresa);

    public Postulacion getPostulacion();

    public void setPostulacion(Postulacion postulacion);

    public List<ContratoEstado> getContratoEstadoList();

    public void setContratoEstadoList(List<ContratoEstado> contratoEstadoList);

    public void addContratoEstado(ContratoEstado contratoEstado);

    public PostulacionProyectoCargo getPostulacionProyecCargo();

    public void setPostulacionProyecCargo(PostulacionProyectoCargo postulacionProyecCargo);

    public Proyecto getProyecto();

    public void setProyecto(Proyecto proyecto);
}

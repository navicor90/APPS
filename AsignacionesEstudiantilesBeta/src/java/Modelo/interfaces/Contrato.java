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

    public void setCodigoContrato(int codigoContrato) ;

    public Date getFechaEmisionContrato() ;

    public void setFechaEmisionContrato(Date fechaEmisionContrato) ;

    public ImplementacionEmpresa getEmpresa() ;

    public void setEmpresa(ImplementacionEmpresa empresa) ;

    public List<ImplementacionPostulacionProyectoCargo> getPostulacionProyecCargo() ;

    public void setPostulacionProyecCargo(List<ImplementacionPostulacionProyectoCargo> postulacionProyecCargo) ;

    public ImplementacionPostulacion getPostulacion() ;

    public void setPostulacion(ImplementacionPostulacion postulacion) ;

    public ImplementacionContrato getContrato() ;

    public void setContrato(ImplementacionContrato contrato) ;
}

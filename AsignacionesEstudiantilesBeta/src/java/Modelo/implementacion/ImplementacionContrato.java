/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionEmpresa;
import Modelo.implementacion.ImplementacionPostulacion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionContrato {
    private int codContrato;
    private Date fechaEmisioncontrato;
    private ImplementacionEmpresa empresa;
    private List<ImplementacionPostulacionProyectoCargo> postProyecCargo;
    private ImplementacionPostulacion post;
    private ImplementacionContrato contrato;

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public Date getFechaEmisioncontrato() {
        return fechaEmisioncontrato;
    }

    public void setFechaEmisioncontrato(Date fechaEmisioncontrato) {
        this.fechaEmisioncontrato = fechaEmisioncontrato;
    }

    public ImplementacionEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ImplementacionEmpresa empresa) {
        this.empresa = empresa;
    }

    public List<ImplementacionPostulacionProyectoCargo> getPostProyecCargo() {
        return postProyecCargo;
    }

    public void setPostProyecCargo(List<ImplementacionPostulacionProyectoCargo> postProyecCargo) {
        this.postProyecCargo = postProyecCargo;
    }

    public ImplementacionPostulacion getPost() {
        return post;
    }

    public void setPost(ImplementacionPostulacion post) {
        this.post = post;
    }

    public ImplementacionContrato getContrato() {
        return contrato;
    }

    public void setContrato(ImplementacionContrato contrato) {
        this.contrato = contrato;
    }
    
    
            
            
}

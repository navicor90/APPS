/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class Contrato {
    private int codContrato;
    private Date fechaEmisioncontrato;
    private Empresa empresa;
    private List<PostulacionProyectoCargo> postProyecCargo;
    private Postulacion post;
    private Contrato contrato;

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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<PostulacionProyectoCargo> getPostProyecCargo() {
        return postProyecCargo;
    }

    public void setPostProyecCargo(List<PostulacionProyectoCargo> postProyecCargo) {
        this.postProyecCargo = postProyecCargo;
    }

    public Postulacion getPost() {
        return post;
    }

    public void setPost(Postulacion post) {
        this.post = post;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
            
            
}

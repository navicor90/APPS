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
public class Formulario {
    private int nroFormulario;
    private Date fechaDeCreacion;
    private PostulacionProyectoCargo postulacionProyectoCargo;
    private Empresa empresa;

    public int getNroFormulario() {
        return nroFormulario;
    }

    public void setNroFormulario(int nroFormulario) {
        this.nroFormulario = nroFormulario;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public PostulacionProyectoCargo getPostulacionProyectoCargo() {
        return postulacionProyectoCargo;
    }

    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo) {
        this.postulacionProyectoCargo = postulacionProyectoCargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}

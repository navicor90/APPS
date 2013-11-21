/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionFormulario implements Formulario{
    private int nroFormulario;
    private Date fechaDeCreacion;
    private PostulacionProyectoCargo postulacionProyectoCargo;
    private Empresa empresa;

    @Override
    public int getNroFormulario() {
        return nroFormulario;
    }

    @Override
    public void setNroFormulario(int nroFormulario) {
        this.nroFormulario = nroFormulario;
    }

    @Override
    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    @Override
    public PostulacionProyectoCargo getPostulacionProyectoCargo() {
        return postulacionProyectoCargo;
    }

    @Override
    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo) {
        this.postulacionProyectoCargo = postulacionProyectoCargo;
    }

    @Override
    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}

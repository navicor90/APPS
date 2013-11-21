/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionPostulacionProyectoCargo;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionFormulario {
    private int nroFormulario;
    private Date fechaDeCreacion;
    private ImplementacionPostulacionProyectoCargo postulacionProyectoCargo;
    private ImplementacionEmpresa empresa;

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

    public ImplementacionPostulacionProyectoCargo getPostulacionProyectoCargo() {
        return postulacionProyectoCargo;
    }

    public void setPostulacionProyectoCargo(ImplementacionPostulacionProyectoCargo postulacionProyectoCargo) {
        this.postulacionProyectoCargo = postulacionProyectoCargo;
    }

    public ImplementacionEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ImplementacionEmpresa empresa) {
        this.empresa = empresa;
    }
    
}

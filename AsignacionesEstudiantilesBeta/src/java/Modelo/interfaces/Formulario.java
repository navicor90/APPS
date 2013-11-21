/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import java.util.Date;

/**
 *
 * @author yanina
 */
public interface Formulario {
    public int getNroFormulario();

    public void setNroFormulario(int nroFormulario);

    public Date getFechaDeCreacion();

    public void setFechaDeCreacion(Date fechaDeCreacion);

    public PostulacionProyectoCargo getPostulacionProyectoCargo();

    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo);

    public Empresa getEmpresa();

    public void setEmpresa(Empresa empresa);
    
}

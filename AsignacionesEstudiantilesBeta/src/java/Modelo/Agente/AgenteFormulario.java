/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteFormulario extends Agente implements Formulario{
    String oidEmpresa;
    boolean heBuscadoEmpresa;
    ImplementacionFormulario implementacionFormulario;

    @Override
    public int getNroFormulario() {
        return implementacionFormulario.getNroFormulario();
    }

    @Override
    public void setNroFormulario(int nroFormulario) {
        implementacionFormulario.setNroFormulario(nroFormulario);
    }

    @Override
    public Date getFechaDeCreacion() {
        return implementacionFormulario.getFechaDeCreacion();
    }

    @Override
    public void setFechaDeCreacion(Date fechaDeCreacion) {
        implementacionFormulario.setFechaDeCreacion(fechaDeCreacion);
    }

    @Override
    public PostulacionProyectoCargo getPostulacionProyectoCargo() {
        return implementacionFormulario.getPostulacionProyectoCargo();
    }

    @Override
    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo) {
        implementacionFormulario.setPostulacionProyectoCargo(postulacionProyectoCargo);
    }

    @Override
    public Empresa getEmpresa() {
        return implementacionFormulario.getEmpresa();
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        implementacionFormulario.setEmpresa(empresa);
    }
    
}

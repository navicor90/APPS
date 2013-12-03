/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Agente;

import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.implementacion.ImplementacionEstadoAcademico;
import Modelo.interfaces.Carrera;
import Modelo.interfaces.EstadoAcademico;
import Modelo.interfaces.TipoEstadoAcademico;

/**
 *
 * @author milton
 */
public class AgenteEstadoAcademico extends Agente implements EstadoAcademico {

    private ImplementacionEstadoAcademico implementacionEstadoAcademico;
    private boolean heBuscadoTipoEstadoAcademico;
    private String OIDTipoEstadoAcademico;
    private String OIDEstudiante;
    private boolean heBuscadoCarrera;
    private String OIDCarrera;

    @Override
    public String getLegajo() {
        return this.implementacionEstadoAcademico.getLegajo();
    }

    @Override
    public void setLegajo(String legajo) {
        this.implementacionEstadoAcademico.setLegajo(legajo);
    }

    @Override
    public TipoEstadoAcademico getTipoEstadoAcademico() {
        TipoEstadoAcademico tipoEstadoAcademico = null;
        if (this.isHeBuscadoTipoEstadoAcademico() || this.esNuevo()) {
            tipoEstadoAcademico = this.implementacionEstadoAcademico.getTipoEstadoAcademico();
        } else {
            tipoEstadoAcademico = (TipoEstadoAcademico) FachadaPersistenciaInterna.getInstancia().buscar("TipoEstadoAcademico", this.getOIDTipoEstadoAcademico());
            this.setTipoEstadoAcademico(tipoEstadoAcademico);
            this.setHeBuscadoTipoEstadoAcademico(true);
        }
        return tipoEstadoAcademico;
    }

    @Override
    public void setTipoEstadoAcademico(TipoEstadoAcademico tipoEstadoAcademico) {
        Agente agente = (Agente) tipoEstadoAcademico;
        this.setOIDTipoEstadoAcademico(agente.getOid());
        this.implementacionEstadoAcademico.setTipoEstadoAcademico(tipoEstadoAcademico);

    }

    public ImplementacionEstadoAcademico getImplementacionEstadoAcademico() {
        return implementacionEstadoAcademico;
    }

    public void setImplementacionEstadoAcademico(ImplementacionEstadoAcademico implementacionEstadoAcademico) {
        this.implementacionEstadoAcademico = implementacionEstadoAcademico;
    }

    public boolean isHeBuscadoTipoEstadoAcademico() {
        return heBuscadoTipoEstadoAcademico;
    }

    public void setHeBuscadoTipoEstadoAcademico(boolean heBuscadoTipoEstadoAcademico) {
        this.heBuscadoTipoEstadoAcademico = heBuscadoTipoEstadoAcademico;
    }

    public String getOIDTipoEstadoAcademico() {
        return OIDTipoEstadoAcademico;
    }

    public void setOIDTipoEstadoAcademico(String OIDTipoEstadoAcademico) {
        this.OIDTipoEstadoAcademico = OIDTipoEstadoAcademico;
    }

    public String getOIDEstudiante() {
        return OIDEstudiante;
    }

    public void setOIDEstudiante(String OIDEstudiante) {
        this.OIDEstudiante = OIDEstudiante;
    }

    public boolean isHeBuscadoCarrera() {
        return heBuscadoCarrera;
    }

    public void setHeBuscadoCarrera(boolean heBuscadoCarrera) {
        this.heBuscadoCarrera = heBuscadoCarrera;
    }

    public String getOIDCarrera() {
        return OIDCarrera;
    }

    public void setOIDCarrera(String OIDCarrera) {
        this.OIDCarrera = OIDCarrera;
    }

    @Override
    public Carrera getCarrera() {
        Carrera carrera ;
        if(this.isHeBuscadoCarrera() || this.esNuevo()){
            carrera = implementacionEstadoAcademico.getCarrera();
        }else{
            carrera = (Carrera) FachadaPersistenciaInterna.getInstancia().buscar("Carrera", this.getOIDCarrera());
            this.setCarrera(carrera);
            this.setHeBuscadoCarrera(true);
        }
        return carrera;
    }

    @Override
    public void setCarrera(Carrera carrera) {
        Agente agente = (Agente) carrera;
        this.setOIDCarrera(agente.getOid());
        this.getImplementacionEstadoAcademico().setCarrera(carrera);
    }
    
    
}

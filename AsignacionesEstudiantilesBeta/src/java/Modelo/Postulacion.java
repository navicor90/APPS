package Modelo;


import Modelo.ImplementacionEstudiante;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yanina
 */
public class Postulacion {
    private String estadoPostulacion;
    private Date fechaHoraPostulacion;
    private int nroPostulacion;
    private List<PostulacionProyectoCargo> pC;
    private ImplementacionEstudiante es;

    public Postulacion() {
    }
    
    
    public String getEstadoPostulacion() {
        return estadoPostulacion;
    }

    public void setEstadoPostulacion(String estadoPostulacion) {
        this.estadoPostulacion = estadoPostulacion;
    }

    public Date getFechaHoraPostulacion() {
        return fechaHoraPostulacion;
    }

    public void setFechaHoraPostulacion(Date fechaHoraPostulacion) {
        this.fechaHoraPostulacion = fechaHoraPostulacion;
    }

    public int getNroPostulacion() {
        return nroPostulacion;
    }

    public void setNroPostulacion(int nroPostulacion) {
        this.nroPostulacion = nroPostulacion;
    }

    public List<PostulacionProyectoCargo> getpC() {
        return pC;
    }

    public void setpC(List<PostulacionProyectoCargo> pC) {
        this.pC = pC;
    }

    

    public ImplementacionEstudiante getEs() {
        return es;
    }

    public void setEs(ImplementacionEstudiante es) {
        this.es = es;
    }
    
    
    public void addPostulacionProyectoCargo( PostulacionProyectoCargo pC){
        
    }
    
        
    
    
}

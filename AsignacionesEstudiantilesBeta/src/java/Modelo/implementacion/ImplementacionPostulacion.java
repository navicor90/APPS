
package Modelo.implementacion;


import Modelo.interfaces.*;
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
public class ImplementacionPostulacion implements Postulacion{
    private String estadoPostulacion;
    private Date fechaHoraPostulacion;
    private int nroPostulacion;
    private List<PostulacionProyectoCargo> proyectoCargo;
    private Estudiante estudiante;

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

    public List<PostulacionProyectoCargo> getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(List<PostulacionProyectoCargo> proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}

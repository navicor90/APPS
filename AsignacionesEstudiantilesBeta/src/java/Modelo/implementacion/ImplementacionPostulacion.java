
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

    @Override
    public String getEstadoPostulacion() {
        return estadoPostulacion;
    }

    @Override
    public void setEstadoPostulacion(String estadoPostulacion) {
        this.estadoPostulacion = estadoPostulacion;
    }

    @Override
    public Date getFechaHoraPostulacion() {
        return fechaHoraPostulacion;
    }

    @Override
    public void setFechaHoraPostulacion(Date fechaHoraPostulacion) {
        this.fechaHoraPostulacion = fechaHoraPostulacion;
    }

    @Override
    public int getNroPostulacion() {
        return nroPostulacion;
    }

    @Override
    public void setNroPostulacion(int nroPostulacion) {
        this.nroPostulacion = nroPostulacion;
    }

    @Override
    public List<PostulacionProyectoCargo> getProyectoCargo() {
        return proyectoCargo;
    }

    @Override
    public void setProyectoCargo(List<PostulacionProyectoCargo> proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    @Override
    public Estudiante getEstudiante() {
        return estudiante;
    }

    @Override
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}

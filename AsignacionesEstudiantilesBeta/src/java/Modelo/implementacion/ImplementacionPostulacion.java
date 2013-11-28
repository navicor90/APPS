
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
    private Date fechaHoraPostulacion;
    private int nroPostulacion;
    private List<PostulacionProyectoCargo> proyectoCargosList;
    private Estudiante estudiante;
    private Date fechaHoraAnulacionPostulacion;

    @Override
    public List<PostulacionProyectoCargo> getProyectoCargosList() {
        return proyectoCargosList;
    }

    @Override
    public void setProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList) {
        this.proyectoCargosList = proyectoCargosList;
    }

    @Override
    public Date getFechaHoraAnulacionPostulacion() {
        return fechaHoraAnulacionPostulacion;
    }

    @Override
    public void setFechaHoraAnulacionPostulacion(Date fechaHoraAnulacionPostulacion) {
        this.fechaHoraAnulacionPostulacion = fechaHoraAnulacionPostulacion;
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
    public Estudiante getEstudiante() {
        return estudiante;
    }

    @Override
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void addProyectoCargo(PostulacionProyectoCargo proyectoCargo) {
        proyectoCargosList.add(proyectoCargo);
    }

}

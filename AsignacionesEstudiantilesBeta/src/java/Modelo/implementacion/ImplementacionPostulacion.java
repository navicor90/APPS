
package Modelo.implementacion;


import Modelo.interfaces.*;
import java.util.ArrayList;
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
    private List<PostulacionProyectoCargo> postulacionProyectoCargosList;
    private Estudiante estudiante;
    private Date fechaHoraAnulacionPostulacion;

    public ImplementacionPostulacion() {
        postulacionProyectoCargosList = new ArrayList<>();
    }
    
    @Override
    public List<PostulacionProyectoCargo> getPostulacionProyectoCargosList() {
        return postulacionProyectoCargosList;
    }

    @Override
    public void setPostulacionProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList) {
        this.postulacionProyectoCargosList = proyectoCargosList;
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
    public void addPostulacionProyectoCargo(PostulacionProyectoCargo proyectoCargo) {
        postulacionProyectoCargosList.add(proyectoCargo);
    }

}

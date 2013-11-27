/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgentePostulacion extends Agente implements Postulacion{
    String oidPostulacion;
    boolean heBuscadoPostulacion;
    ImplementacionPostulacion implementacionPostulacion;

    public String getOidPostulacion() {
        return oidPostulacion;
    }

    public void setOidPostulacion(String oidPostulacion) {
        this.oidPostulacion = oidPostulacion;
    }

    public boolean isHeBuscadoPostulacion() {
        return heBuscadoPostulacion;
    }

    public void setHeBuscadoPostulacion(boolean heBuscadoPostulacion) {
        this.heBuscadoPostulacion = heBuscadoPostulacion;
    }

    public ImplementacionPostulacion getImplementacionPostulacion() {
        return implementacionPostulacion;
    }

    public void setImplementacionPostulacion(ImplementacionPostulacion implementacionPostulacion) {
        this.implementacionPostulacion = implementacionPostulacion;
    }
    
    @Override
    public String getEstadoPostulacion() {
        return implementacionPostulacion.getEstadoPostulacion();
    }

    @Override
    public void setEstadoPostulacion(String estadoPostulacion) {
        implementacionPostulacion.setEstadoPostulacion(estadoPostulacion);
    }

    @Override
    public Date getFechaHoraPostulacion() {
        return implementacionPostulacion.getFechaHoraPostulacion();
    }

    @Override
    public void setFechaHoraPostulacion(Date fechaHoraPostulacion) {
        implementacionPostulacion.setFechaHoraPostulacion(fechaHoraPostulacion);
    }

    @Override
    public int getNroPostulacion() {
        return implementacionPostulacion.getNroPostulacion();
    }

    @Override
    public void setNroPostulacion(int nroPostulacion) {
        implementacionPostulacion.setEstadoPostulacion(oidPostulacion);
    }

    @Override
    public List<PostulacionProyectoCargo> getProyectoCargo() {
        return implementacionPostulacion.getProyectoCargo();
    }

    @Override
    public void setProyectoCargo(List<PostulacionProyectoCargo> proyectoCargo) {
        implementacionPostulacion.setEstadoPostulacion(oidPostulacion);
    }
    
    @Override
    public void addProyectoCargo(PostulacionProyectoCargo proyectoCargo){
        implementacionPostulacion.addProyectoCargo(proyectoCargo);
    }

    @Override
    public Estudiante getEstudiante() {
        return implementacionPostulacion.getEstudiante();
    }

    @Override
    public void setEstudiante(Estudiante estudiante) {
        implementacionPostulacion.setEstudiante(estudiante);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgentePostulacion extends Agente implements Postulacion{
    private boolean heBuscadoEstudiante;
    private boolean heBuscadoProyectoCargo;
    private String OIDEstudiante;
    private ImplementacionPostulacion implementacionPostulacion;

    public AgentePostulacion() {
        heBuscadoEstudiante = false;
        heBuscadoProyectoCargo = false;
    }
    
    public boolean isHeBuscadoProyectoCargo() {
        return heBuscadoProyectoCargo;
    }

    public void setHeBuscadoProyectoCargo(boolean heBuscadoProyectoCargo) {
        this.heBuscadoProyectoCargo = heBuscadoProyectoCargo;
    }
    
    public boolean isHeBuscadoEstudiante() {
        return heBuscadoEstudiante;
    }

    public void setHeBuscadoEstudiante(boolean heBuscadoEstudiante) {
        this.heBuscadoEstudiante = heBuscadoEstudiante;
    }

    public String getOIDEstudiante() {
        return OIDEstudiante;
    }

    public void setOIDEstudiante(String OIDEstudiante) {
        this.OIDEstudiante = OIDEstudiante;
    }
    
    

    public ImplementacionPostulacion getImplementacionPostulacion() {
        return implementacionPostulacion;
    }

    public void setImplementacionPostulacion(ImplementacionPostulacion implementacionPostulacion) {
        this.implementacionPostulacion = implementacionPostulacion;
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
        implementacionPostulacion.setNroPostulacion(nroPostulacion);
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

    @Override
    public List<PostulacionProyectoCargo> getProyectoCargosList() {
        List<PostulacionProyectoCargo> postulacionProyectoCargos;
        
        if(heBuscadoProyectoCargo){
            postulacionProyectoCargos = implementacionPostulacion.getProyectoCargosList();
        }else{
            Criterio criterioBusquedaPostulacionProyectoCargos = (Criterio) FabricaCriterio.getInstancia().crear("postulacion", "=", this);
            postulacionProyectoCargos = (List)FachadaPersistenciaInterna.getInstancia().buscar("PostulacionProyectoCargo", criterioBusquedaPostulacionProyectoCargos);
        }
        return postulacionProyectoCargos;
    }

    @Override
    public void setProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList) {
        implementacionPostulacion.setProyectoCargosList(proyectoCargosList);
    }

    @Override
    public Date getFechaHoraAnulacionPostulacion() {
        return implementacionPostulacion.getFechaHoraAnulacionPostulacion();
    }

    @Override
    public void setFechaHoraAnulacionPostulacion(Date fechaHoraAnulacionPostulacion) {
        implementacionPostulacion.setFechaHoraAnulacionPostulacion(fechaHoraAnulacionPostulacion);
    }
    
}

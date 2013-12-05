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
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgentePostulacion extends Agente implements Postulacion{
    private boolean heBuscadoEstudiante; 
    private boolean heBuscadoPostulacionProyectoCargo;
    private String OIDEstudiante;
    private ImplementacionPostulacion implementacionPostulacion;

    public AgentePostulacion() {
        heBuscadoEstudiante = false;
        heBuscadoPostulacionProyectoCargo = false;
    }

    public boolean isHeBuscadoPostulacionProyectoCargo() {
        return heBuscadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoPostulacionProyectoCargo(boolean heBuscadoPostulacionProyectoCargo) {
        this.heBuscadoPostulacionProyectoCargo = heBuscadoPostulacionProyectoCargo;
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
        this.setModificado(true);
    }

    @Override
    public int getNroPostulacion() {
        return implementacionPostulacion.getNroPostulacion();
    }

    @Override
    public void setNroPostulacion(int nroPostulacion) {
        implementacionPostulacion.setNroPostulacion(nroPostulacion);
        this.setModificado(true);
        
    }

    @Override
    public void addPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo){
        implementacionPostulacion.addPostulacionProyectoCargo(postulacionProyectoCargo);
        AgentePostulacionProyectoCargo agentePostulacionProyectoCargo = (AgentePostulacionProyectoCargo) postulacionProyectoCargo;
        agentePostulacionProyectoCargo.setOidPostulacion(this.getOid());
        this.setModificado(true);
    }

    @Override
    public Estudiante getEstudiante() {
        return implementacionPostulacion.getEstudiante();
    }

    @Override
    public void setEstudiante(Estudiante estudiante) {
        implementacionPostulacion.setEstudiante(estudiante);
        AgenteEstudiante agenteEstudiante = (AgenteEstudiante) estudiante;
        this.setOIDEstudiante(agenteEstudiante.getOid());
        this.setModificado(true);
    }

    @Override
    public List<PostulacionProyectoCargo> getPostulacionProyectoCargosList() {
        List<PostulacionProyectoCargo> postulacionProyectoCargos;
        if(heBuscadoPostulacionProyectoCargo || this.esNuevo()){
            postulacionProyectoCargos = implementacionPostulacion.getPostulacionProyectoCargosList();
        }else{
            Criterio criterioBusquedaPostulacionProyectoCargos = (Criterio) FabricaCriterio.getInstancia().crear("postulacion", "=", this);
            postulacionProyectoCargos = (List)FachadaPersistenciaInterna.getInstancia().buscar("PostulacionProyectoCargo", criterioBusquedaPostulacionProyectoCargos);
        }
        for (PostulacionProyectoCargo p:postulacionProyectoCargos) {
                Agente a = (Agente) p;
        }
        return postulacionProyectoCargos;
    }

    @Override
    public void setPostulacionProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList) {
        implementacionPostulacion.setPostulacionProyectoCargosList(proyectoCargosList);
        for (PostulacionProyectoCargo postulacionProyectoCargo : proyectoCargosList) {
            AgentePostulacionProyectoCargo agentePostulacionProyectoCargo = (AgentePostulacionProyectoCargo) postulacionProyectoCargo;
            agentePostulacionProyectoCargo.setOidPostulacion(this.getOid());
        }
        this.setModificado(true);
    }

    @Override
    public Date getFechaHoraAnulacionPostulacion() {
        return implementacionPostulacion.getFechaHoraAnulacionPostulacion();
    }

    @Override
    public void setFechaHoraAnulacionPostulacion(Date fechaHoraAnulacionPostulacion) {
        implementacionPostulacion.setFechaHoraAnulacionPostulacion(fechaHoraAnulacionPostulacion);
        this.setModificado(true);
    }
    
}

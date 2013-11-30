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
    public void addPostulacionProyectoCargo(PostulacionProyectoCargo proyectoCargo){
        implementacionPostulacion.addPostulacionProyectoCargo(proyectoCargo);
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
    public List<PostulacionProyectoCargo> getPostulacionProyectoCargosList() {
        List<PostulacionProyectoCargo> postulacionProyectoCargos;
        System.out.println("esteeeeeee es el metodo qliaaaaaaaaaaadoooo"+this.esNuevo());
        if(heBuscadoPostulacionProyectoCargo || this.esNuevo()){
            System.out.println("entraaaaaaaaaaaa la mierda estaaaaaa");
            postulacionProyectoCargos = implementacionPostulacion.getPostulacionProyectoCargosList();
        }else{
            Criterio criterioBusquedaPostulacionProyectoCargos = (Criterio) FabricaCriterio.getInstancia().crear("postulacion", "=", this);
            postulacionProyectoCargos = (List)FachadaPersistenciaInterna.getInstancia().buscar("PostulacionProyectoCargo", criterioBusquedaPostulacionProyectoCargos);
        }
        for (PostulacionProyectoCargo p:postulacionProyectoCargos) {
                Agente a = (Agente) p;
                System.out.println("PPC OID======================"+a.getOid());
        }
        return postulacionProyectoCargos;
    }

    @Override
    public void setPostulacionProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList) {
        implementacionPostulacion.setPostulacionProyectoCargosList(proyectoCargosList);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import com.google.gson.*;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
/**
 *
 * @author yanina
 */
@Stateless
@Path("/EstadoAcademicoDetallado")
public class buscarEstadoAcademicoDetallado {
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    @GET
    @Produces("application/json")
    public String consultarEstadoAcademicoDetallado (@QueryParam("legajo") String legajo){
        System.out.println("valores"+legajo);
        String pJSON= buscarAlumno(legajo);       
        return pJSON;
     }
        private String buscarAlumno(String legajo){
            List<EstadoAcademico> ListaEstadoAcademico =(List)entityManager.createQuery("SELECT a FROM EstadoAcademico a WHERE a.legajo="+legajo).getResultList();
            List<EstadoAcademicoSImple> ListaEstadoAcademicoSimple=new ArrayList<>();
            for (EstadoAcademico estadoAcademico: ListaEstadoAcademico ) {
                System.out.println("le"+estadoAcademico.getEstudianteMateria());
                System.out.println("valores"+ estadoAcademico.getLegajo());
                EstadoAcademicoSImple estadoAcademicoSimple=new EstadoAcademicoSImple();
                estadoAcademicoSimple.setLegajo(estadoAcademico.getLegajo());
                CarreraSimple carreraSimple=new CarreraSimple();
                carreraSimple.setNombre(estadoAcademico.getCarrera().getNombreCarrera());
                estadoAcademicoSimple.setCarreraSimple(carreraSimple);
                List<EstudianteMateria> ListaEstudianteMateria=estadoAcademico.getEstudianteMateria();
                List<EstudianteMateriaSimple> ListaEstudianteMateriaSimple=new ArrayList<>();
                for(EstudianteMateria estudianteMateria: ListaEstudianteMateria){
                    EstudianteMateriaSimple estudianteMateriaSimple=new EstudianteMateriaSimple();
                    MateriaSimple materiaSimple= new MateriaSimple();
                    materiaSimple.setNombre(estudianteMateria.getMateria().getNombre());
                    estudianteMateriaSimple.setMateriaSimple(materiaSimple);
                    estudianteMateriaSimple.setEstado(estudianteMateria.getEstado());
                    estudianteMateriaSimple.setId(estudianteMateria.getId());
                    estudianteMateriaSimple.setNotaFinal(estudianteMateria.getNotaFinal());
                    estudianteMateriaSimple.setFechaEstado(estudianteMateria.getFechaEstado());
                    ListaEstudianteMateriaSimple.add(estudianteMateriaSimple);
                    System.out.println("estuddiantemateria"+estudianteMateria);
                }
                estadoAcademicoSimple.setEstudianteMateriaSimple(ListaEstudianteMateriaSimple);
                ListaEstadoAcademicoSimple.add(estadoAcademicoSimple);
            }
            
        
        return convertirAJSON(ListaEstadoAcademicoSimple);
     }

    private String convertirAJSON(Object estudiante){
        Gson googleSon=new Gson();
        return googleSon.toJson(estudiante);        
    }  
}

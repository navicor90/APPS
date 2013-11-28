/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import com.google.gson.Gson;
import entidades.Estudiante;
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
    List<Estudiante> estudiantes =(List)entityManager.createQuery("SELECT e FROM Estudiante e INNER JOIN EstadoAcaddemico INNER JOIN Carrera EstudianteMateria INER JOIN Materia WHERE e.dni='"+legajo+"'").getResultList();
     String todoslosjson= "";
        for (Estudiante e:estudiantes) {
            todoslosjson += "    "+convertirAJSON(e);
        }
    return todoslosjson;
     }
    private String convertirAJSON(Object estudiante){
        Gson googleSon=new Gson();
        return googleSon.toJson(estudiante);        
    }  
}

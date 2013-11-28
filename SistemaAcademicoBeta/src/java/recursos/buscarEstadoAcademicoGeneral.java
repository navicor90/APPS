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
@Path("/EstadoAcademicoGeneral")
public class buscarEstadoAcademicoGeneral {
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    @GET
    @Produces("application/json")
    public String consultarEstadoAcademicoGeneral (@QueryParam("dni") int dni, @QueryParam("tipoDni") String tipoDni){
        System.out.println("valores"+tipoDni + dni);
        String pJSON= buscarAlumno(dni, tipoDni);       
        return pJSON;
     }
    private String buscarAlumno(int dni, String tipoDni){
        System.out.println("buscar alumnoHOLAAAAAAAAAAAAAAAAAAA");
    List<Estudiante> estudiantes =(List)entityManager.createQuery("SELECT legajo, nombreCarrera, estadoAcademico, fechaIngreso, fechaBaja, nombre FROM  Carrera, EstadoAcademico a JOIN Estudiante e  ON e.DNI='34567' AND e.TIPODNI='dni' WHERE e.ID=a.ESTUDIANTE_ID ").getResultList();
        System.out.println("entrooooooooooooooooooo"); 
    String todoslosjson= "";
        for (Estudiante e:estudiantes) {
            todoslosjson += "    "+convertirAJSON(e);
        }
    return todoslosjson;
     }
    private String convertirAJSON(Object alumno){
        Gson googleSon=new Gson();
        return googleSon.toJson(alumno);        
    }
}


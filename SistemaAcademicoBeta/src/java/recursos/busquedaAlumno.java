/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;
import entidades.*;
import javax.ejb.Stateless;
import com.google.gson.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Path("/Estudiante")
public class busquedaAlumno {
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    @GET
    @Produces("application/json")
    public String consultarAlumno (@QueryParam("legajo") String legajo){
        String pJSON= buscarAlumno(legajo);       
        return pJSON;
     }
    private String buscarAlumno(String legajo){
        System.out.println("holaaaaaaaaaaaaa");
    Estudiante estudiante =(Estudiante)entityManager.createQuery("SELECT e FROM prueba e WHERE e.valor='20'").getSingleResult();
    //prueba pruebaa=(prueba)entityManager.createQuery("SELECT e FROM prueba e WHERE e.valor='20'").getSingleResult();
        return convertirAJSON(estudiante);
     }
    private String convertirAJSON(Object alumno){
        Gson googleSon=new Gson();
        return googleSon.toJson(alumno);        
    }
}

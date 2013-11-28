/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import com.google.gson.Gson;
import entidades.Estudiante;
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
@Path("/Alumno")
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
    List<Estudiante> estudiantes =(List)entityManager.createQuery("SELECT e FROM Estudiante e INNER JOIN EstadoAcademico INER JOIN Carrera WHERE e.dni='"+dni+"' AND a.tipoDni='"+tipoDni+"'").getResultList();
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


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
@Path("/VariosEstudiantes")
public class buscarVariosAlumnos {
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    @GET
    @Produces("application/json")
    public String consultarAlumno (@QueryParam("dni") String dni){
        String pJSON= buscarAlumno(dni);       
        return pJSON;
     }
    private String buscarAlumno(String dni){
        List<Estudiante> estudiantes =(List)entityManager.createQuery("SELECT a FROM Estudiante a WHERE a.dni=123").getResultList();
        List<EstudianteSimple> estudiantesSimples= new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            EstudianteSimple e = new EstudianteSimple();
            e.setNombre(estudiante.getNombre());
            e.setDni(estudiante.getDni());
            e.setTipoDni(estudiante.getTipoDni());
            List<EstadoAcademico> estadosAcademicos=estudiante.getEstadoacademico();
            List<EstadoAcademicoSImple> estadoAcademicoSimple=new ArrayList<>();
            for (EstadoAcademico estadoAcademico: estadosAcademicos ) {
                EstadoAcademicoSImple es=new EstadoAcademicoSImple();
                es.setFechaBaja(estadoAcademico.getFechaBaja());
                es.setFechaIngreso(estadoAcademico.getFechaIngreso());
                es.setLegajo(estadoAcademico.getLegajo());
                es.setCarrera(estadoAcademico.getCarrera());
                es.setEstadoAcademico(estadoAcademico.getEstadoAcademico());
                estadoAcademicoSimple.add(es);
                }
            e.setEstadoacademicoSimple(estadoAcademicoSimple);
            estudiantesSimples.add(e);
        }
        return convertirAJSON(estudiantesSimples);
     }
    private String convertirAJSON(Object alumno){
        Gson googleSon=new Gson();
        
        List<EstudianteSimple> estudiantes = (List)alumno;
        for (EstudianteSimple e : estudiantes ){
            System.out.println(e.getDni());
        }
        System.out.println("PREVIO a to json");
        String j = googleSon.toJson(alumno);
        System.out.println(j);
                
        return googleSon.toJson(alumno);        
    }
}
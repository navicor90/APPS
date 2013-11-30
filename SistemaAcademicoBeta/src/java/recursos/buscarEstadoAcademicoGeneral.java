/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import com.google.gson.Gson;
import entidades.EstadoAcademico;
import entidades.EstadoAcademicoSImple;
import entidades.Estudiante;
import entidades.EstudianteSimple;
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
@Path("/EstadoAcademicoGeneral")
public class buscarEstadoAcademicoGeneral {
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    @GET
    @Produces("application/json")
    public String consultarEstadoAcademicoGeneral (@QueryParam("dni") Long dni, @QueryParam("tipoDni") String tipoDni){
        System.out.println("valores"+tipoDni + dni);
        String pJSON= buscarAlumno(dni, tipoDni);       
        return pJSON;
     }
    private String buscarAlumno(Long dni, String tipoDni){
        List<Estudiante> estudiantes =(List)entityManager.createQuery("SELECT a FROM Estudiante a WHERE a.dni="+dni+" AND a.tipoDni='"+tipoDni+"'").getResultList();
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
        return googleSon.toJson(alumno);        
    }
}


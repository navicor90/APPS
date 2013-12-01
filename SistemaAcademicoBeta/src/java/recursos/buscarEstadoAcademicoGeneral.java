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
        List<EstudianteSimple> ListaEstudianteSimple= new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            EstudianteSimple estudianteSimple = new EstudianteSimple();
            List<EstadoAcademico> estadosAcademicos=estudiante.getEstadoacademico();
            List<EstadoAcademicoSImple> ListaEstadoAcademicoSimple=new ArrayList<>();
            for (EstadoAcademico estadoAcademico: estadosAcademicos ) {
                EstadoAcademicoSImple estadoAcademicoSimple=new EstadoAcademicoSImple();
                estadoAcademicoSimple.setFechaBaja(estadoAcademico.getFechaBaja());
                estadoAcademicoSimple.setFechaIngreso(estadoAcademico.getFechaIngreso());
                estadoAcademicoSimple.setLegajo(estadoAcademico.getLegajo());
                CarreraSimple carreraSimple=new CarreraSimple();
                carreraSimple.setNombre(estadoAcademico.getCarrera().getNombreCarrera());
                estadoAcademicoSimple.setCarreraSimple(carreraSimple);
                estadoAcademicoSimple.setEstadoAcademico(estadoAcademico.getEstadoAcademico());
                ListaEstadoAcademicoSimple.add(estadoAcademicoSimple);
                }
            estudianteSimple.setEstadoacademicoSimple(ListaEstadoAcademicoSimple);
            ListaEstudianteSimple.add(estudianteSimple);
        }
        return convertirAJSON(ListaEstudianteSimple);
     }
    private String convertirAJSON(Object alumno){
        Gson googleSon=new Gson();
        return googleSon.toJson(alumno);        
    }
}


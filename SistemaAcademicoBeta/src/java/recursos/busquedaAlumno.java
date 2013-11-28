/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;
import entidades.Alumno;
import javax.ejb.Stateless;
import com.google.gson.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
    /**
 * webSevir
 * @author yanina
 * Recuurso REST
 * Clase que maneja un servicio
 *  solo manejará la persistencia de una etndiad, pero será accedido desde la web.
 * una clase representa a un web service
 * tiene un metodo de cada tipo
 */
//no registra estado, dps del uso desaparece
@Stateless//lo convierte en un EJB
/*path q representa al web service*/
@Path("/Alumno")//este recurso es accedidp desde la ruta    /Alumno via web
public class busquedaAlumno {
    // para hacer la busqueda a la base de datos-definir el nombre de la unidad de persistencia
    @PersistenceContext( unitName =  "SistemaAcademicoBetaPU")      
    EntityManager entityManager ;
    //nombre del parametro dentro de la uri "legajo" forma e la q la va a usar dentro del metodo
    @GET
    //valor de retorno
    @Produces("application/json")
    public String consultarAlumno (@QueryParam("legajo") String legajo){
        //buscarlo dentro de la base de dato jason- recibe el codigo q recibio por la uri
        String pJSON= buscarAlumno(legajo);       
        return pJSON;
     }
    //Busqueda en la base de datos
    private String buscarAlumno(String legajo){
        Alumno alumno;
        alumno=(Alumno)entityManager.createQuery("SELECT a FROM Alumno a WHERE a.legajo='"+legajo+"'").getSingleResult();
        //debo transformar a Strin(Json)
        return convertirAJSON(alumno);
     }
    // convierte el objeto en Json
    private String convertirAJSON(Object alumno){
        Gson googleSon=new Gson();
        return googleSon.toJson(alumno);        
    }
}
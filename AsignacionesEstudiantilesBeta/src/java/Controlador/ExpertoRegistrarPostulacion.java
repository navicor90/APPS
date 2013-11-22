/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.DTO.*;
import java.util.Date;
import java.util.List;
/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {
    
    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad){
        return null;
    }
    
    public List<DTOProyectoCargo> listarProyectoCargos(){
        return null;
    }
    
    public Date obtenerFechaYHoraActuales(){
        return new Date();
    }
    
    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO){
        return null;
    }
}

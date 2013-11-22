/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.DTO.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {
    
    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad){
        List<DTOProyecto> r = new ArrayList();
        for (int i = 0; i < 10; i++) {
            DTOProyecto d = new DTOProyecto();
            d.setDescripcion(Integer.toString(i));
            d.setNomProyecto(Integer.toString(i));
            d.setDuracion(i);
            d.setFechaInicio(new Date());
            r.add(d);
        }
        return r;
    }
    
    public List<DTOProyectoCargo> listarProyectoCargos(String nombreProyecto){
        List<DTOProyectoCargo> r = new ArrayList();
        for (int i = 0; i < 10; i++) {
            DTOProyectoCargo d = new DTOProyectoCargo();
            d.setDescripcion(Integer.toString(i));
            d.setNombreProyectoCargo(Integer.toString(i));
            d.setHorasDedicadas(12d);
            r.add(d);
        }
        return r;
    }
    
    public Date obtenerFechaYHoraActuales(){
        return new Date();
    }
    
    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO){
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.*;
import Controlador.Persistencia.*;
import java.util.Date;
import java.util.List;
/**
 *
 * @author milton
 */
public class ControladorRegistrarPostulacion {
    private ExpertoRegistrarPostulacion experto;

    public ControladorRegistrarPostulacion() {
        this.experto = (ExpertoRegistrarPostulacion) FabricaExperto.getInstancia().obtenerExperto("registrarPostulacion");
    }
    
    public List<DTOProyecto> listarProyectos(long legajo, String url){
        long codigo =0;
        if(url.contains("AsignacionesEstudiantilesBeta")) codigo = 1;
        return experto.listarProyectos(legajo, codigo);
    }
    
    public List<DTOProyectoCargo> listarProyectoCargos(Integer codigoProyecto){
        return experto.listarProyectoCargos(codigoProyecto);
    }
    
    public Date obtenerFechaYHoraActuales(){
        return experto.obtenerFechaYHoraActuales();
    }
    
    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO){
        return experto.realizarPostulacion(postulacionesDTO);
    }
    
    
}

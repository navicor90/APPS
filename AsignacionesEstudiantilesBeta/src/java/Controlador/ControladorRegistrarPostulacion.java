/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.*;
import Controlador.Persistencia.*;
import java.util.List;
/**
 *
 * @author milton
 */
public class ControladorRegistrarPostulacion {
    ExpertoRegistrarPostulacion experto;

    public ControladorRegistrarPostulacion() {
        this.experto = (ExpertoRegistrarPostulacion) FabricaExperto.getInstancia().obtenerExperto("registrarPostulacion");
    }
    
    public List<DTOProyecto> listarProyectos(long legajo, String url){
        int codUniversidad=2;
        return experto.listarProyectos(legajo, codUniversidad);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.List;

/**
 *
 * @author milton
 */
public class ControladorAsignarPrioridadPostulacion {
    ExpertoAsignarPrioridadPostulacion experto;
    
    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, int codigo){
        return experto.listarPostulaciones(legajo, codigo);
    }
    
    public List<DTOPostulacionProyectoCargo> asignarPrioridades(List<DTOPostulacionProyectoCargo> postulacionProyectoCargosDTOList){
        return experto.asignarPrioridades(postulacionProyectoCargosDTOList);
    }
    
}

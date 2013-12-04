/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FabricaExperto;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.List;

/**
 *
 * @author milton
 */
public class ControladorAsignarPrioridadPostulacion {

    ExpertoAsignarPrioridadPostulacion experto;

    public ControladorAsignarPrioridadPostulacion() {
        experto  = (ExpertoAsignarPrioridadPostulacion) FabricaExperto.getInstancia().obtenerExperto("AsignarPrioridadPostulacion");
    }
    
    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, String url) throws ExceptionAPPS {
        int codigo = 0;
        if (url.contains("AsignacionesEstudiantilesBeta")) {
            codigo = 1;
        }
        return experto.listarPostulaciones(legajo, codigo);
    }

    /* public List<DTOPostulacionProyectoCargo> asignarPrioridades(List<DTOPostulacionProyectoCargo> postulacionProyectoCargosDTOList){
     return experto.asignarPrioridades(postulacionProyectoCargosDTOList);
     }
     */
}

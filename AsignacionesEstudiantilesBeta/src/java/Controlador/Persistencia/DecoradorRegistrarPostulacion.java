/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Controlador.ExpertoRegistrarPostulacion;
import Modelo.DTO.DTOProyecto;
import java.util.List;

/**
 *
 * @author franco
 */
public class DecoradorRegistrarPostulacion extends ExpertoRegistrarPostulacion{
    @Override
    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad){
        FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
        return super.listarProyectos(legajo, codUniversidad);
    }
}

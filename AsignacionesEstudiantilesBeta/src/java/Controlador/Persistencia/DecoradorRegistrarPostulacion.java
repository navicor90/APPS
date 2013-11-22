/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Controlador.ExpertoRegistrarPostulacion;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import Modelo.DTO.DTOProyecto;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milton
 */
public class DecoradorRegistrarPostulacion extends ExpertoRegistrarPostulacion {

    @Override
    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad) {
        List<DTOProyecto> listaProyectos;
        FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
        listaProyectos = super.listarProyectos(legajo, codUniversidad);
        return listaProyectos;
    }

    @Override
    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        List<DTOPostulacionProyectoCargo> realizarPostulacion = super.realizarPostulacion(postulacionesDTO);
        try {
            FachadaPersistenciaInterna.getInstancia().ConfirmarTransaccion();
        } catch (Exception ex) {
            try {
                FachadaPersistenciaInterna.getInstancia().CancelarTransaccion();
                Logger.getLogger(DecoradorRegistrarPostulacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(DecoradorRegistrarPostulacion.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return realizarPostulacion;
    }
    
    
    
}

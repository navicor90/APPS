/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Controlador.ExpertoRegistrarPostulacion;
import Modelo.DTO.DTOProyecto;
import java.sql.SQLException;
import java.util.ArrayList;
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
        List<DTOProyecto> listarProyectos = new ArrayList();
        try {
            FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
            listarProyectos = super.listarProyectos(legajo, codUniversidad);
            FachadaPersistenciaInterna.getInstancia().ConfirmarTransaccion();
        } catch (Exception ex) {
            try {
                FachadaPersistenciaInterna.getInstancia().CancelarTransaccion();
                Logger.getLogger(DecoradorRegistrarPostulacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(DecoradorRegistrarPostulacion.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return listarProyectos;

    }
}

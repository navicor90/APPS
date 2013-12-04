/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Controlador.ExceptionAPPS;
import Controlador.ExpertoAsignarPrioridadPostulacion;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milton
 */
public class DecoradorAsignarPrioridadPostulacion extends ExpertoAsignarPrioridadPostulacion {

    @Override
    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, int codigo) throws ExceptionAPPS {
        FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
        return super.listarPostulaciones(legajo, codigo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DTOPostulacionProyectoCargo> asignarPrioridades(List<DTOPostulacionProyectoCargo> postulacionProyectoCargosDTOList) {
        List<DTOPostulacionProyectoCargo> realizarPostulacion = null;
        try {
            realizarPostulacion = super.asignarPrioridades(postulacionProyectoCargosDTOList);
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

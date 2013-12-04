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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milton
 */
public class ControladorRegistrarPostulacion {

    private ExpertoRegistrarPostulacion experto;

    public ControladorRegistrarPostulacion() {
        this.experto = (ExpertoRegistrarPostulacion) FabricaExperto.getInstancia().obtenerExperto("registrarPostulacion");
    }

    public List<DTOProyecto> listarProyectos(String legajo, String url) throws ExceptionAPPS {
        long codigo = 0;
        if (url.contains("AsignacionesEstudiantilesBeta")) {
            codigo = 1;
        }
        return experto.listarProyectos(legajo, codigo);
    }

    public List<DTOProyectoCargo> listarProyectoCargos(Integer codigoProyecto) {
        return experto.listarProyectoCargos(codigoProyecto);
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        return experto.realizarPostulacion(postulacionesDTO);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionProyectoCargoCarrera;
import Modelo.implementacion.ImplementacionProyectoCargoEstado;
import Modelo.implementacion.ImplementacionTipoCargo;
import Modelo.implementacion.ImplementacionImplementacionProyecto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoCargo {
    private int cantMinPostulacion;
    private String descripcion;
    private Boolean habilitado;
    private Date horasDedicadas;
    private int nroProyectoCargo;
    private List <ImplementacionProyectoCargoEstado> proyCarEstado;
    private ImplementacionTipoCargo tipoCargo;
    private ImplementacionImplementacionProyecto proy;
    private ImplementacionProyectoCargoCarrera proyCargCarrera;
    
    public ImplementacionProyectoCargo(List<ImplementacionProyectoCargoEstado> proyCarEstado) {
        this.proyCarEstado = proyCarEstado;
    }
    
    
            
            
    
}

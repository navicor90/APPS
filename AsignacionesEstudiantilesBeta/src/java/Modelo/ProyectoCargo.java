/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ProyectoCargo {
    private int cantMinPostulacion;
    private String descripcion;
    private Boolean habilitado;
    private Date horasDedicadas;
    private int nroProyectoCargo;
    private List <ProyectoCargoEstado> proyCarEstado;
    private TipoCargo tipoCargo;
    private Proyecto proy;
    private ProyectoCargoCarrera proyCargCarrera;
    
    public ProyectoCargo(List<ProyectoCargoEstado> proyCarEstado) {
        this.proyCarEstado = proyCarEstado;
    }
    
    
            
            
    
}

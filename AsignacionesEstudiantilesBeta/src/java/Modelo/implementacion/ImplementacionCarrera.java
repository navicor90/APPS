/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;


import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionCarrera implements Carrera {
    private Date fechaFinVigencia;
    private String nombreCarrera;
    private Universidad universdad;
    private TipoEstadoCarrera estadoCarrerra;

    @Override
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    @Override
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public Universidad getUniversdad() {
        return universdad;
    }

    @Override
    public void setUniversdad(Universidad universdad) {
        this.universdad = universdad;
    }

    @Override
    public TipoEstadoCarrera getEstadoCarrerra() {
        return estadoCarrerra;
    }

    @Override
    public void setEstadoCarrerra(TipoEstadoCarrera estadoCarrerra) {
        this.estadoCarrerra = estadoCarrerra;
    }
    

    
}

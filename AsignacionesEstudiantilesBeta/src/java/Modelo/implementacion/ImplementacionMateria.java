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
public class ImplementacionMateria implements Materia{
    private int codMateria;
    private Date fechaFinVigencia;
    private String nombreMateria;

    @Override
    public int getCodMateria() {
        return codMateria;
    }

    @Override
    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    @Override
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public String getNombreMateria() {
        return nombreMateria;
    }

    @Override
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
}

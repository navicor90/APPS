/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

/**
 *
 * @author yanina
 */
public interface ProyectoCargoCarrera {
    
    public int getCantidadMateriasRegulares();

    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares);

    public int getCantidadMateriasRendidas();

    public void setCantidadMateriasRendidas(int cantidadMateriasRendidas);

    public Carrera getCarrera();

    public void setCarrera(Carrera carrera);
    
}

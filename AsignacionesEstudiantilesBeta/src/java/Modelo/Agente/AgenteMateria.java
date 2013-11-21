/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteMateria extends Agente implements Materia{
    ImplementacionMateria implementacionMateria;

    public ImplementacionMateria getImplementacionMateria() {
        return implementacionMateria;
    }

    public void setImplementacionMateria(ImplementacionMateria implementacionMateria) {
        this.implementacionMateria = implementacionMateria;
    }
    
    @Override
    public int getCodMateria() {
        return  implementacionMateria.getCodMateria();
    }

    @Override
    public void setCodMateria(int codMateria) {
        implementacionMateria.setCodMateria(codMateria);
    }

    @Override
    public Date getFechaFinVigencia() {
        return implementacionMateria.getFechaFinVigencia();
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        implementacionMateria.setFechaFinVigencia(fechaFinVigencia);
    }

    @Override
    public String getNombreMateria() {
        return implementacionMateria.getNombreMateria();
    }

    @Override
    public void setNombreMateria(String nombreMateria) {
        implementacionMateria.setNombreMateria(nombreMateria);
    }
    
}

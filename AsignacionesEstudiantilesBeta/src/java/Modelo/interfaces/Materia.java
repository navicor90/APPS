/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import java.util.Date;

/**
 *
 * @author yanina
 */
public interface Materia {
    public int getCodMateria() ;

    public void setCodMateria(int codMateria) ;

    public Date getFechaFinVigencia() ;

    public void setFechaFinVigencia(Date fechaFinVigencia) ;

    public String getNombreMateria() ;

    public void setNombreMateria(String nombreMateria);
}

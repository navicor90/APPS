/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import Modelo.interfaces.*;
import java.util.List;

/**
 *
 * @author milton
 */
public interface Empresa {
    public String getEmailEmpresa() ;

    public void setEmailEmpresa(String emailEmpresa) ;

    public String getNombreEmpresa() ;

    public void setNombreEmpresa(String nombreEmpresa) ;

    public Long getTelefonoEmpresa() ;

    public void setTelefonoEmpresa(Long telefonoEmpresa) ;

    public Universidad getUniversidad() ;

    public void setUniversidad(Universidad universidad) ;

    public Long getIdentificacionFiscal();

    public void setIdentificacionFiscal(Long identificacionFiscal) ;

    public List<EmpresaEstado> getEmpresaEstado() ;

    public void setEmpresaEstado(List<EmpresaEstado> empresaEstado) ;
    
}

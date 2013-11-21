/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionEmpresaEstado;
import Modelo.implementacion.ImplementacionIdentificacionFiscal;
import Modelo.implementacion.ImplementacionUniversidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionEmpresa {
    private String emailEmpresa;
    private String nombreEmpresa;
    private int telefonoEmpresa;
    private ImplementacionUniversidad univ;
    private ImplementacionIdentificacionFiscal idFiscal;
    private List <ImplementacionEmpresaEstado> empEstado;

    public ImplementacionEmpresa(List<ImplementacionEmpresaEstado> empEstado) {
        this.empEstado = empEstado;
    }
    
    
    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public ImplementacionUniversidad getUniv() {
        return univ;
    }

    public void setUniv(ImplementacionUniversidad univ) {
        this.univ = univ;
    }

    public ImplementacionIdentificacionFiscal getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(ImplementacionIdentificacionFiscal idFiscal) {
        this.idFiscal = idFiscal;
    }

    public List<ImplementacionEmpresaEstado> getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(List<ImplementacionEmpresaEstado> empEstado) {
        this.empEstado = empEstado;
    }
            
    
}

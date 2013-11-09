/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanina
 */
public class Empresa {
    private String emailEmpresa;
    private String nombreEmpresa;
    private int telefonoEmpresa;
    private Universidad univ;
    private IdentificacionFiscal idFiscal;
    private List <EmpresaEstado> empEstado;

    public Empresa(List<EmpresaEstado> empEstado) {
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

    public Universidad getUniv() {
        return univ;
    }

    public void setUniv(Universidad univ) {
        this.univ = univ;
    }

    public IdentificacionFiscal getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(IdentificacionFiscal idFiscal) {
        this.idFiscal = idFiscal;
    }

    public List<EmpresaEstado> getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(List<EmpresaEstado> empEstado) {
        this.empEstado = empEstado;
    }
            
    
}

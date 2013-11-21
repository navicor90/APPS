/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.List;

/**
 *
 * @author yanina
 */
public class ImplementacionEmpresa implements Empresa {

    private String emailEmpresa;
    private String nombreEmpresa;
    private Long telefonoEmpresa;
    private Universidad universidad;
    private Long identificacionFiscal;
    private List<EmpresaEstado> empresaEstado;

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

    public Long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(Long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Long getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public void setIdentificacionFiscal(Long identificacionFiscal) {
        this.identificacionFiscal = identificacionFiscal;
    }

    public List<EmpresaEstado> getEmpresaEstado() {
        return empresaEstado;
    }

    public void setEmpresaEstado(List<EmpresaEstado> empresaEstado) {
        this.empresaEstado = empresaEstado;
    }

}

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

    @Override
    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    @Override
    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    @Override
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    @Override
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public Long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    @Override
    public void setTelefonoEmpresa(Long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    @Override
    public Universidad getUniversidad() {
        return universidad;
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public Long getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    @Override
    public void setIdentificacionFiscal(Long identificacionFiscal) {
        this.identificacionFiscal = identificacionFiscal;
    }

    @Override
    public List<EmpresaEstado> getEmpresaEstado() {
        return empresaEstado;
    }

    @Override
    public void setEmpresaEstado(List<EmpresaEstado> empresaEstado) {
        this.empresaEstado = empresaEstado;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgenteEmpresa extends Agente implements Empresa{
    String oidUniversidad;
    boolean heBuscado;
    ImplementacionEmpresa implementacionEmpresa;

    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public boolean isHeBuscado() {
        return heBuscado;
    }

    public void setHeBuscado(boolean heBuscado) {
        this.heBuscado = heBuscado;
    }

    public ImplementacionEmpresa getImplementacionEmpresa() {
        return implementacionEmpresa;
    }

    public void setImplementacionEmpresa(ImplementacionEmpresa implementacionEmpresa) {
        this.implementacionEmpresa = implementacionEmpresa;
    }
    
    
    @Override
    public String getEmailEmpresa() {
        return implementacionEmpresa.getEmailEmpresa();
    }

    @Override
    public void setEmailEmpresa(String emailEmpresa) {
        implementacionEmpresa.setEmailEmpresa(emailEmpresa);
    }

    @Override
    public String getNombreEmpresa() {
        return implementacionEmpresa.getNombreEmpresa();
    }

    @Override
    public void setNombreEmpresa(String nombreEmpresa) {
        implementacionEmpresa.setNombreEmpresa(nombreEmpresa);
    }

    @Override
    public Long getTelefonoEmpresa() {
        return implementacionEmpresa.getTelefonoEmpresa();
    }

    @Override
    public void setTelefonoEmpresa(Long telefonoEmpresa) {
        implementacionEmpresa.setTelefonoEmpresa(telefonoEmpresa);
    }

    @Override
    public Universidad getUniversidad() {
        return implementacionEmpresa.getUniversidad();
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        implementacionEmpresa.setUniversidad(universidad);
    }

    @Override
    public Long getIdentificacionFiscal() {
        return implementacionEmpresa.getIdentificacionFiscal();
    }

    @Override
    public void setIdentificacionFiscal(Long identificacionFiscal) {
        implementacionEmpresa.setIdentificacionFiscal(identificacionFiscal);
    }

    @Override
    public List<EmpresaEstado> getEmpresaEstado() {
        return implementacionEmpresa.getEmpresaEstado();
    }

    @Override
    public void setEmpresaEstado(List<EmpresaEstado> empresaEstado) {
        implementacionEmpresa.setEmpresaEstado(empresaEstado);
    }
    
}

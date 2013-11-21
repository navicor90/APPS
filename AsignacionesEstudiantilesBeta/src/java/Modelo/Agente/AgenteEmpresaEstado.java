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
public class AgenteEmpresaEstado extends Agente implements EmpresaEstado{
    String oidEmpresa;
    String oidEstadoEmpresa;
    boolean heBuscadoEmpresa;
    boolean heBuscadoEstadoEmpresa;
    ImplementacionEmpresaEstado implementacionEmpresaEstado;

    public String getOidEmpresa() {
        return oidEmpresa;
    }

    public void setOidEmpresa(String oidEmpresa) {
        this.oidEmpresa = oidEmpresa;
    }

    public String getOidEstadoEmpresa() {
        return oidEstadoEmpresa;
    }

    public void setOidEstadoEmpresa(String oidEstadoEmpresa) {
        this.oidEstadoEmpresa = oidEstadoEmpresa;
    }

    public boolean isHeBuscadoEmpresa() {
        return heBuscadoEmpresa;
    }

    public void setHeBuscadoEmpresa(boolean heBuscadoEmpresa) {
        this.heBuscadoEmpresa = heBuscadoEmpresa;
    }

    public boolean isHeBuscadoEstadoEmpresa() {
        return heBuscadoEstadoEmpresa;
    }

    public void setHeBuscadoEstadoEmpresa(boolean heBuscadoEstadoEmpresa) {
        this.heBuscadoEstadoEmpresa = heBuscadoEstadoEmpresa;
    }

    public ImplementacionEmpresaEstado getImplementacionEmpresaEstado() {
        return implementacionEmpresaEstado;
    }

    public void setImplementacionEmpresaEstado(ImplementacionEmpresaEstado implementacionEmpresaEstado) {
        this.implementacionEmpresaEstado = implementacionEmpresaEstado;
    }
    
    @Override
    public Date getFechaCambioEstadoEmpresa() {
        return implementacionEmpresaEstado.getFechaCambioEstadoEmpresa();
    }

    @Override
    public void setFechaCambioEstadoEmpresa(Date fechaCambioEstadoEmpresa) {
        implementacionEmpresaEstado.setFechaCambioEstadoEmpresa(fechaCambioEstadoEmpresa);
    }

    @Override
    public TipoEstadoEmpresa getTipoEstadoEmpresa() {
        return implementacionEmpresaEstado.getTipoEstadoEmpresa();
    }

    @Override
    public void setTipoEstadoEmpresa(TipoEstadoEmpresa tipoEstadoEmpresa) {
        implementacionEmpresaEstado.setTipoEstadoEmpresa(tipoEstadoEmpresa);
    }
    
}

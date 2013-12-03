/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgenteContratoEstado extends Agente implements ContratoEstado{
    private boolean heBuscadoTipoEstadoContrato;
    private String oidContrato;
    private String oidTipoEstadoContrato;
    ImplementacionContratoEstado implementacionContratoEstado;

    public ImplementacionContratoEstado getImplementacionContratoEstado() {
        return implementacionContratoEstado;
    }

    public void setImplementacionContratoEstado(ImplementacionContratoEstado implementacionContratoEstado) {
        this.implementacionContratoEstado = implementacionContratoEstado;
    }
    
        
    @Override
    public Date getFechaHoraCambioEstado() {
        return implementacionContratoEstado.getFechaHoraCambioEstado();
    }

    @Override
    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) {
        implementacionContratoEstado.setFechaHoraCambioEstado(fechaHoraCambioEstado);
    }

    @Override
    public TipoEstadoContrato getTipoEstadoContrato() {
        TipoEstadoContrato tipoEstadoContrato;
        if (heBuscadoTipoEstadoContrato || this.esNuevo()){
            tipoEstadoContrato = implementacionContratoEstado.getTipoEstadoContrato();
        }else{
            Criterio criterioBusquedaTipoEstadoContrato = (Criterio) FabricaCriterio.getInstancia().crear("Criterio", "=", this);
            List<TipoEstadoContrato> tipoEstadoContratoList = (List)FachadaPersistenciaInterna.getInstancia().buscar("TipoEstadoContrato", criterioBusquedaTipoEstadoContrato);
            tipoEstadoContrato = tipoEstadoContratoList.get(0);
            this.setHeBuscadoTipoEstadoContrato(true);
            this.implementacionContratoEstado.setTipoEstadoContrato(tipoEstadoContrato);
        }
        return tipoEstadoContrato;
    }

    @Override
    public void setTipoEstadoContrato(TipoEstadoContrato tipoEstadoContrato) {
        implementacionContratoEstado.setTipoEstadoContrato(tipoEstadoContrato);
    }

    public String getOidContrato() {
        return oidContrato;
    }

    public void setOidContrato(String oidContrato) {
        this.oidContrato = oidContrato;
    }

    public String getOidTipoEstadoContrato() {
        return oidTipoEstadoContrato;
    }

    public void setOidTipoEstadoContrato(String oidTipoEstadoContrato) {
        this.oidTipoEstadoContrato = oidTipoEstadoContrato;
    }

    public boolean isHeBuscadoTipoEstadoContrato() {
        return heBuscadoTipoEstadoContrato;
    }

    public void setHeBuscadoTipoEstadoContrato(boolean heBuscadoTipoEstadoContrato) {
        this.heBuscadoTipoEstadoContrato = heBuscadoTipoEstadoContrato;
    }
    
}

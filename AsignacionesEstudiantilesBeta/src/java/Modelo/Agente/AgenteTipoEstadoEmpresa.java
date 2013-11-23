/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Modelo.implementacion.*;

/**
 *
 * @author yanina
 */
public class AgenteTipoEstadoEmpresa extends Agente implements TipoEstadoEmpresa{
    ImplementacionTipoEstadoEmpresa implementacionTipoEstadoEmpresa;

    public ImplementacionTipoEstadoEmpresa getImplementacionTipoEstadoEmpresa() {
        return implementacionTipoEstadoEmpresa;
    }

    public void setImplementacionTipoEstadoEmpresa(ImplementacionTipoEstadoEmpresa implementacionTipoEstadoEmpresa) {
        this.implementacionTipoEstadoEmpresa = implementacionTipoEstadoEmpresa;
    }
    
    @Override
    public String getNombreTipoEstadoEmpresa() {
        return implementacionTipoEstadoEmpresa.getNombreTipoEstadoEmpresa();
    }

    @Override
    public void setNombreTipoEstadoEmpresa(String nombreTipoEstadoEmpresa) {
        implementacionTipoEstadoEmpresa.setNombreTipoEstadoEmpresa(nombreTipoEstadoEmpresa);
    }
    
}

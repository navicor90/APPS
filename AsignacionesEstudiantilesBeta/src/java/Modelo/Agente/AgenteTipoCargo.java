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
public class AgenteTipoCargo extends Agente implements TipoCargo{
    String oidUniversidad;
    boolean heBuscadoUniversidad;
    ImplementacionTipoCargo implementacionTipoCargo;

    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public boolean isHeBuscadoUniversidad() {
        return heBuscadoUniversidad;
    }

    public void setHeBuscadoUniversidad(boolean heBuscadoUniversidad) {
        this.heBuscadoUniversidad = heBuscadoUniversidad;
    }

    public ImplementacionTipoCargo getImplementacionTipoCargo() {
        return implementacionTipoCargo;
    }

    public void setImplementacionTipoCargo(ImplementacionTipoCargo implementacionTipoCargo) {
        this.implementacionTipoCargo = implementacionTipoCargo;
    }
    

    @Override
    public String getNomTipoCargo() {
        return implementacionTipoCargo.getNomTipoCargo();
    }

    @Override
    public void setNomTipoCargo(String nomTipoCargo) {
        implementacionTipoCargo.setNomTipoCargo(nomTipoCargo);
    }
    
    
}

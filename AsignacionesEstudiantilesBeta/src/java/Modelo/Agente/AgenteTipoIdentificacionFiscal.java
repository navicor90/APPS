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
public class AgenteTipoIdentificacionFiscal extends Agente implements TipoIdentificacionFiscal{
    ImplementacionTipoIdentificacionFiscal implementacionTipoIdentificacionFiscal;

    public ImplementacionTipoIdentificacionFiscal getImplementacionTipoIdentificacionFiscal() {
        return implementacionTipoIdentificacionFiscal;
    }

    public void setImplementacionTipoIdentificacionFiscal(ImplementacionTipoIdentificacionFiscal implementacionTipoIdentificacionFiscal) {
        this.implementacionTipoIdentificacionFiscal = implementacionTipoIdentificacionFiscal;
    }
    
    @Override
    public String getNombreTipoIdentificacionFiscal() {
        return implementacionTipoIdentificacionFiscal.getNombreTipoIdentificacionFiscal();
    }

    @Override
    public void setNombreTipoIdentificacionFiscal(String nombreTipoIdentificacionFiscal) {
        implementacionTipoIdentificacionFiscal.setNombreTipoIdentificacionFiscal(nombreTipoIdentificacionFiscal);
    }
    
}

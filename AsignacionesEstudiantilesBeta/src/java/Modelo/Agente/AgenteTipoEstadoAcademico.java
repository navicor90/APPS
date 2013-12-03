/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.implementacion.ImplementacionTipoEstadoAcademico;
import Modelo.interfaces.TipoEstadoAcademico;

/**
 *
 * @author milton
 */
public class AgenteTipoEstadoAcademico extends Agente implements TipoEstadoAcademico {
    private ImplementacionTipoEstadoAcademico implementacionTipoEstadoAcademico;

    public ImplementacionTipoEstadoAcademico getImplementacionTipoEstadoAcademico() {
        return implementacionTipoEstadoAcademico;
    }

    public void setImplementacionTipoEstadoAcademico(ImplementacionTipoEstadoAcademico implementacionTipoEstadoAcademico) {
        this.implementacionTipoEstadoAcademico = implementacionTipoEstadoAcademico;
    }

    @Override
    public int getCodigo() {
        return this.implementacionTipoEstadoAcademico.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        this.implementacionTipoEstadoAcademico.setCodigo(codigo);
    }

    @Override
    public String getNombre() {
        return this.implementacionTipoEstadoAcademico.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        this.implementacionTipoEstadoAcademico.setNombre(nombre);
    }
    
}

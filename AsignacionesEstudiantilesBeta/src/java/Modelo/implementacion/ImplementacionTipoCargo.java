/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class ImplementacionTipoCargo implements TipoCargo {
    private int codigo;
    private String nomTipoCargo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    @Override
    public String getNomTipoCargo() {
        return nomTipoCargo;
    }

    @Override
    public void setNomTipoCargo(String nomTipoCargo) {
        this.nomTipoCargo = nomTipoCargo;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.interfaces.*;
/**
 *
 * @author yanina
 */
public class FabricaAdaptadorSistemaAcademico {
    private static FabricaAdaptadorSistemaAcademico instancia;

    public static FabricaAdaptadorSistemaAcademico getInstancia() {
        if(instancia==null)instancia = new FabricaAdaptadorSistemaAcademico();
        return instancia;
    }
    public AdaptadorSistemaAcademico obtenerAdaptadorSistemaAcademico(int codUniversidad){
        return new AdaptadorSistemaAcademico02();
    }
    
}

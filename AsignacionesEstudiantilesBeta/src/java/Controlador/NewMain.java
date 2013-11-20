/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author yanina
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdaptadorSistemaAcademico01 adaptadorSistemaAcademico01=new AdaptadorSistemaAcademico01();
        adaptadorSistemaAcademico01.VerificarRegularidadEstudiante(null, 31904);
    }
    
}

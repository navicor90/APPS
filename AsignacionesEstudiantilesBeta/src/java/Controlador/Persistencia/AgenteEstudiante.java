/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Persistencia;

import Modelo.ImplementacionEstudiante;

/**
 *
 * @author franco
 */
public class AgenteEstudiante extends Agente{
    String oidEstudiante;
    String oidUniversidad;
    ImplementacionEstudiante ie;

    public AgenteEstudiante(ImplementacionEstudiante ie) {
        this.ie = ie;
    }
    
}

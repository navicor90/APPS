/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.*;
import Modelo.interfaces.*;


/**
 *
 * @author franco
 */
public class FabricaEntidades {
    static private FabricaEntidades instancia;

    public static FabricaEntidades getInstancia() {
        if(instancia == null){
            instancia = new FabricaEntidades();
        }
        return instancia;
    }
    
    public Object crearEntidad(Class clase){
        Agente entidadNueva = null;
        if(clase == Estudiante.class){
            entidadNueva = new AgenteEstudiante();
        }
        if(clase == Postulacion.class){
            entidadNueva = new AgentePostulacion();
        }
        if(clase == PostulacionProyectoCargo.class){
            entidadNueva = new AgentePostulacionProyectoCargo();
        }
        if(clase == PostulacionProyectoCargoEstado.class){
            entidadNueva = new AgentePostulacionProyectoCargoEstado();
        }
        return entidadNueva;
    }
    
}

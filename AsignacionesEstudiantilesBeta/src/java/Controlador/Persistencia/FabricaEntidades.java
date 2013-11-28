/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.*;
import Modelo.implementacion.ImplementacionEstudiante;
import Modelo.implementacion.ImplementacionPostulacion;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargo;
import Modelo.implementacion.ImplementacionPostulacionProyectoCargoEstado;
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
            AgenteEstudiante agenteEstudiante = new AgenteEstudiante();
            agenteEstudiante.setImplementacionEstudiante(new ImplementacionEstudiante());
            entidadNueva = agenteEstudiante;
        }
        if(clase == Postulacion.class){
            AgentePostulacion agentePostulacion = new AgentePostulacion();
            agentePostulacion.setImplementacionPostulacion(new ImplementacionPostulacion());
            entidadNueva = agentePostulacion;
        }
        if(clase == PostulacionProyectoCargo.class){
            AgentePostulacionProyectoCargo agentePostulacionProyectoCargo = new AgentePostulacionProyectoCargo();
            agentePostulacionProyectoCargo.setImplementacionPostulacionProyectoCargo(new ImplementacionPostulacionProyectoCargo());
            entidadNueva = agentePostulacionProyectoCargo;
        }
        if(clase == PostulacionProyectoCargoEstado.class){
            AgentePostulacionProyectoCargoEstado agentePostulacionProyectoCargoEstado = new AgentePostulacionProyectoCargoEstado();
            agentePostulacionProyectoCargoEstado.setImplementacionPostulacionProyectoCargoEstado(new ImplementacionPostulacionProyectoCargoEstado());
            entidadNueva = agentePostulacionProyectoCargoEstado;
        }
        return entidadNueva;
    }
    
}

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
import Modelo.implementacion.ImplementacionTipoCargo;
import Modelo.interfaces.*;

import java.util.Random;

/**
 *
 * @author franco
 */
public class FabricaEntidades {

    static private FabricaEntidades instancia;

    public static FabricaEntidades getInstancia() {
        if (instancia == null) {
            instancia = new FabricaEntidades();
        }
        return instancia;
    }

    public Object crearEntidad(Class clase) {
        Agente entidadNueva = null;
        if (clase == Estudiante.class) {
            AgenteEstudiante agenteEstudiante = new AgenteEstudiante();
            agenteEstudiante.setImplementacionEstudiante(new ImplementacionEstudiante());
            entidadNueva = agenteEstudiante;
        }
        if (clase == Postulacion.class) {
            AgentePostulacion agentePostulacion = new AgentePostulacion();
            agentePostulacion.setImplementacionPostulacion(new ImplementacionPostulacion());
            entidadNueva = agentePostulacion;
        }
        if (clase == PostulacionProyectoCargo.class) {
            AgentePostulacionProyectoCargo agentePostulacionProyectoCargo = new AgentePostulacionProyectoCargo();
            agentePostulacionProyectoCargo.setImplementacionPostulacionProyectoCargo(new ImplementacionPostulacionProyectoCargo());
            entidadNueva = agentePostulacionProyectoCargo;
        }
        if (clase == PostulacionProyectoCargoEstado.class) {
            AgentePostulacionProyectoCargoEstado agentePostulacionProyectoCargoEstado = new AgentePostulacionProyectoCargoEstado();
            agentePostulacionProyectoCargoEstado.setImplementacionPostulacionProyectoCargoEstado(new ImplementacionPostulacionProyectoCargoEstado());
            entidadNueva = agentePostulacionProyectoCargoEstado;
        }
        if (clase == TipoCargo.class) {
            AgenteTipoCargo agenteTipoCargo = new AgenteTipoCargo();
            agenteTipoCargo.setImplementacionTipoCargo(new ImplementacionTipoCargo());
            entidadNueva = agenteTipoCargo;
        }
        entidadNueva.setOid(getCadenaAlfanumAleatoria());
        return entidadNueva;
    }

    private String getCadenaAlfanumAleatoria() {
        int longitud = 40;
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud){
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <='Z') ){
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

/**
 *
 * @author milton
 */
public class FactoriaIntermediarioPersistencia {

    static FactoriaIntermediarioPersistencia instancia;

    public static FactoriaIntermediarioPersistencia obtenerInstancia() {
        if (instancia == null) {
            instancia = new FactoriaIntermediarioPersistencia();
        }
        return instancia;
    }

    public IntermediarioPersistencia obtenerIntermediarioPersistencia(String tipo) {
        IntermediarioPersistencia intermediario;
        switch (tipo) {
            case "Estudiante":
                intermediario = new IntermediarioPersistenciaEstudiante();
                break;
            case "Proyecto":
                intermediario = new IntermediarioPersistenciaProyecto();
                break;
            case "ProyectoCargo":
                intermediario = new IntermediarioPersistenciaProyectoCargo();
                break;
            case "TipoCargo":
                intermediario = new IntermediarioPersistenciaTipoCargo();
                break;
            case "Universidad":
                intermediario = new IntermediarioPersistenciaUniversidad();
                break;
            case "Postulacion":
                intermediario = new IntermediarioPersistenciaPostulacion();
                break;
            case "PostulacionProyectoCargo":
                intermediario = new IntermediarioPersistenciaPostulacionProyectoCargo();
                break;
            case "TipoEstadoPostulacionProyectoCargo":
                intermediario = new IntermediarioPersistenciaTipoEstadoPostulacionProyectoCargo();
                break;
            case "PostulacionProyectoCargoEsado":
                intermediario = new IntermediarioPersistenciaPostulacionProyectoCargoEstado();
                break;
            case "ProyectoCargoCarrera":
                intermediario = new IntermediarioPersistenciaProyectoCargoCarrera();
                break;
            default:
                intermediario = null;
        }
        return intermediario;
    }
}

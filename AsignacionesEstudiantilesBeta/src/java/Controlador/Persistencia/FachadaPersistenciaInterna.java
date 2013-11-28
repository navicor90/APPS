/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author franco
 */
public class FachadaPersistenciaInterna {

    static private FachadaPersistenciaInterna instancia;
    private Connection conexion;

    public static FachadaPersistenciaInterna getInstancia() {
        if (instancia == null) {
            instancia = new FachadaPersistenciaInterna();
        }
        return instancia;
    }

    public List<Object> buscar(String nombreEntidad, Expresion c) {
        return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nombreEntidad).buscar(c);
    }

    public Object buscar(String nombreEntidad, String oid) {
        return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nombreEntidad).buscar(oid);
    }

    public void guardar(Object obj) {
        IntermediarioPersistencia intermediario = FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(obj.getClass().getSimpleName());
        intermediario.guardar(obj);
    }

    public void iniciarTransaccion() {
        conexion = Conexion.getConnection();
    }

    public void ConfirmarTransaccion() throws SQLException {
        conexion.commit();
        conexion.close();
    }

    public void CancelarTransaccion() throws SQLException {
        conexion.rollback();
        conexion.close();
    }

    public Connection getConexion() {
        return conexion;
    }
    
}

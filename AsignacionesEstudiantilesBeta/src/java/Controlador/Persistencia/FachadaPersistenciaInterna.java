/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Criterio;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author franco
 */
public abstract class FachadaPersistenciaInterna {
    static FachadaPersistenciaInterna instancia;
    public static FachadaPersistenciaInterna getInstancia(){
        /*if(instancia == null) instancia = new FachadaPersistenciaInterna()*/;
        return instancia;
    }

public FachadaPersistenciaInterna() {
    }

public List<Object> buscar(Criterio c, String nomEntidad){
    return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nomEntidad).buscar(c);
    }
public Object buscar(String oid, String nomEnt){
    return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nomEnt).buscar(oid);
}
public void iniciarTransaccion(){
    try{
    Connection con = Conexion.getConnection();
    Statement st = con.createStatement();
    }catch(SQLException a){
        /*manejo excepcion*/
    }
    
}
public abstract void guardar(Object obj, String nomEnt);
}

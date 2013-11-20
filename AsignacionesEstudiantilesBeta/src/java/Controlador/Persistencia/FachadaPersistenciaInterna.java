/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
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
    Statement st;
    public static FachadaPersistenciaInterna getInstancia(){
        /*if(instancia == null) instancia = new FachadaPersistenciaInterna()*/;
        return instancia;
    }

public FachadaPersistenciaInterna() {
    }

public List<Object> buscar(Expresion c, String nomEntidad){
    return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nomEntidad).buscar(c);
    }
public Object buscar(String oid, String nomEnt){
    return FactoriaIntermediarioPersistencia.obtenerInstancia().obtenerIntermediarioPersistencia(nomEnt).buscar(oid);
}
public void iniciarTransaccion(){
    try{
    Connection con = Conexion.getConnection();
    st = con.createStatement();
    }catch(SQLException a){
        /*manejo excepcion*/
    }
    
}
public abstract void guardar(Object obj, String nomEnt);
}

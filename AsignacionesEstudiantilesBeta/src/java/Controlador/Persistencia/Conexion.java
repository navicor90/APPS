/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author milton
 */
public class Conexion {
      
    public static Connection getConnection()
    {
        Connection conexion=null;
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/AE";
            String usuarioDB="root";
            String passwordDB="soyceleste";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            conexion=null;
        }
        catch(SQLException ex)
        {
            conexion=null;
        }
        catch(Exception ex)
        {
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
}
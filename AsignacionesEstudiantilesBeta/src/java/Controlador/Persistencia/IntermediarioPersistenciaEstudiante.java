/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Estudiante;
import Modelo.Universidad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaEstudiante implements IntermediarioPersistencia{

    @Override
    public List<Object> Buscar(String codigo) {
        List<Object> listaResultado = new ArrayList<>();
        try {
            Connection c = Conexion.getConnection();
            Statement st = c.createStatement();
            String query ="SELECT * FROM Estudiantes WHERE legajo ='"+codigo+"';";
            ResultSet resultSet = st.executeQuery(query);
            
            while(!resultSet.isLast()){
                Estudiante e= new Estudiante();
                e.setLegajo(resultSet.getString("legajo"));
                e.setNombre(resultSet.getString("nombre"));
                e.setApellido(resultSet.getString("apellido"));
                e.setUniversidad((Universidad)resultSet.getObject("universidad"));
                listaResultado.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return listaResultado;
        }
    }

    @Override
    public boolean guardar(Object object) {
        boolean result = false;
        try {
            Estudiante e = (Estudiante) object;
            Connection c = Conexion.getConnection();
            Statement st = c.createStatement();
            String query ="INSERT INTO Estudiantes";
            ResultSet resultSet = st.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return result;
        }
    }
    
    
    
    
    
}

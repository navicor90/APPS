/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import Modelo.Agente.*;
import Modelo.implementacion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class IntermediarioPersistenciaEstudiante extends IntermediarioPersistenciaRelacional {

    @Override
    public List<Object> convertirRegistroAObjeto(ResultSet rs) throws SQLException {
        List<Object> estudiantes = new ArrayList<>();
        while (rs.next()) {
            ImplementacionEstudiante estudianteI = new ImplementacionEstudiante();
            AgenteEstudiante estudianteA = new AgenteEstudiante(estudianteI);
            estudianteI.setApellido(rs.getString("apellido"));
            estudianteI.setDni(rs.getLong("dni"));
            estudianteI.setEmail(rs.getString("email"));
            estudianteI.setLegajo(rs.getString("legajo"));
            estudianteI.setNombre(rs.getString("nombre"));
            estudianteI.setTelefono(rs.getLong("telefono"));
            estudianteI.setTipoDni(rs.getString("tipoDni"));
            estudiantes.add(estudianteA);
        }
        return estudiantes;
    }

    @Override
    public String armarConsultaSeleccion(Expresion e) {
        return null;
    }
    /* esto es nuevo
     @Override
     public abstract String convertirObjectoRegistro(Object obj);
     @Override
     public abstract String armarConsultaSeleccion(Criterio cri);
     @Override
     public abstract String armarConsultaSeleccion(String oid);
     @Override
     public abstract String armarConsultaInsercion(Object objInsert);
     @Override
     public abstract String armarConsultaActualizacion(Object objUpdate);
     */
    /* Esto es lo que estaba hecho antes
     @Override
     public List<Object> materializar() {
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
     //falta commit y close()??
     //return si termina el catch no deveria pasar a True??
            
     } catch (SQLException ex) {
     Logger.getLogger(IntermediarioPersistenciaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
     }finally{
     return result;
     }
     }
    
     */

    @Override
    public Object materializar(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desmaterializar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String convertirObjectoRegistro(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

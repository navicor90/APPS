/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Expresion;
import Modelo.Agente.*;
import Modelo.Criterio;
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
        List<Object> estudiantesList = new ArrayList<>();
        while (rs.next()) {
            AgenteEstudiante estudianteAgente = new AgenteEstudiante();
            ImplementacionEstudiante estudianteImplementacion = new ImplementacionEstudiante();
            estudianteAgente.setImplementacionEstudiante(estudianteImplementacion);
            estudianteAgente.setOid(rs.getString("OIDEstudiante"));
            estudianteAgente.setCodigo(rs.getInt("codigoEstudiante"));
            estudianteAgente.setApellido(rs.getString("apellidoEstudiante"));
            estudianteAgente.setNombre(rs.getString("nombreEstudiante"));
            estudianteAgente.setDni(rs.getLong("dniEstudiante"));
            estudianteAgente.setTipoDni(rs.getString("tipoDNIEstudiante"));
            estudianteAgente.setLegajo(rs.getString("legajoEstudiante"));
            estudianteAgente.setEmail(rs.getString("emailEstudiante"));
            estudianteAgente.setOidUniversidad(rs.getString("OIDUniversidad"));
            estudiantesList.add(estudianteAgente);
        }
        return estudiantesList;
    }

    @Override
    public String armarConsultaSeleccion(Expresion expresion) {
        String sql = "SELECT * FROM AE.estudiantes WHERE "+desarmarExpresion(expresion);
        return sql;
    }

    @Override
    public String convertirObjetoRegistro(Object obj) {
        return null;
    }

    @Override
    public String armarConsultaSeleccion(String oid) {
        return null;
    }

    @Override
    public String armarConsultaInsercion(Object objInsert) {
        return null;
    }

    @Override
    public String armarConsultaActualizacion(Object objUpdate) {
        return null;
    }

    @Override
    public String desarmarCriterioPorObjeto(Criterio criterio) {
        return "";
    }
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

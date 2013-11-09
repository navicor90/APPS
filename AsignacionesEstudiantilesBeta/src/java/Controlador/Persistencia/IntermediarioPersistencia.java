/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import java.util.List;

/**
 *
 * @author milton
 */
public interface IntermediarioPersistencia {
    public List<Object> Buscar(String codigo);
    public boolean guardar(Object object);
}

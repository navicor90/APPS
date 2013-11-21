/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

/**
 *
 * @author yanina
 */
public interface SeleccionPostulacionProyectoCargo {
     public int getEstado();

    public void setEstado(int estado);

    public int getOrdenMerito();

    public void setOrdenMerito(int ordenMerito);

    public EstadoSeleccionPostulacionProyectoCargo getEstadoSelecccionProyectoCargo();

    public void setEstadoSelecccionProyectoCargo(EstadoSeleccionPostulacionProyectoCargo estadoSelecccionProyectoCargo);

    public PostulacionProyectoCargo getPostulacionProyectoCargo();

    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo);

    public ProyectoCargo getProyectoCargo();

    public void setProyectoCargo(ProyectoCargo proyectoCargo);
}

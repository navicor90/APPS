/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class EstudianteMateriaSimple {
    private String id; 
    private MateriaSimple materiaSimple;
    private String estado;
    private int notaFinal;
    private Date fechaEstado;

    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MateriaSimple getMateriaSimple() {
        return materiaSimple;
    }

    public void setMateriaSimple(MateriaSimple materiaSimple) {
        this.materiaSimple = materiaSimple;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}



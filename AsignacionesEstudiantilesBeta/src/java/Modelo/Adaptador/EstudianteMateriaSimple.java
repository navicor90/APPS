/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author yanina
 */
public class EstudianteMateriaSimple {
    private long id;
    @SerializedName("materiaSimple")
    private MateriaSimple materiaSimples;
    private String estado;
    private Float notaFinal;

    public EstudianteMateriaSimple() {
    }

    public EstudianteMateriaSimple(long id, MateriaSimple materiaSimples, String estado, Float notaFinal) {
        this.id = id;
        this.materiaSimples = materiaSimples;
        this.estado = estado;
        this.notaFinal = notaFinal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MateriaSimple getMateriaSimples() {
        return materiaSimples;
    }

    public void setMateriaSimples(MateriaSimple materiaSimples) {
        this.materiaSimples = materiaSimples;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }
    

    
    
}

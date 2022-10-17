package com.serratec.relacionamentos.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

public class Materia {
    
    @Id
@GeneratedValue(strategy = GeneratedValue)
@Column(name= "id_materia")
    private long id;

    private String nome;
@OneToMany(mappedBy = "materias")
    private List<materias> materias;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<materias> materias) {
        this.materias = materias;
    }


}

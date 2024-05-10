package com.ufro.Malipo.model;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    @Column(name = "tipo",nullable = false,length = 40)
    private String tipo;

    public Categoria(){
        super();
    }

    public Categoria(Long id, String tipo) {
        super();
        this.id = id;
        this.tipo = tipo;
    }

    public Categoria(String tipo) {
        super();
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}

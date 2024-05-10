package com.ufro.Malipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "nombre",nullable = false,length = 100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Column(name = "valor",nullable = false)
    private int valor;

    @Column(name = "stock",nullable = false)
    private int stock;

    @Column(name = "imagen",nullable = false)
    private String imagen;

    public Producto(){

    }

    public Producto(Long id, String nombre, Categoria categoria, int valor, int stock, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.valor = valor;
        this.stock = stock;
        this.imagen = imagen;
    }

    public Producto(String nombre, Categoria categoria, int valor, int stock) {
        super();
        this.nombre = nombre;
        this.categoria = categoria;
        this.valor = valor;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", valor=" + valor +
                ", stock=" + stock +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}

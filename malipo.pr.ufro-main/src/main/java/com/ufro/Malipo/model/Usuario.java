package com.ufro.Malipo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "rut", nullable = false)
    private String rut;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "contraseña", nullable = false, length = 70)
    private String contraseña;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "usuarios_roles",
    joinColumns = @JoinColumn(name = "rut_usuario", referencedColumnName = "rut"),
    inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "id"))
    private Collection<Rol> rol;

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String apellido, String contraseña, Collection<Rol> rol) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Collection<Rol> getRol() {
        return rol;
    }

    public void setRol(Collection<Rol> rol) {
        this.rol = rol;
    }
}

package com.ufro.Malipo.service;

import com.ufro.Malipo.model.Producto;
import com.ufro.Malipo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    public List<Producto> listarProducto() {
       return (List<Producto>)repositorio.findAll();
    }


    public Producto guardarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    public Producto obtenerProducto(Long id) {
        return repositorio.findById(id).get();
    }


    public Producto actualizarProducto(Producto producto) {
        return repositorio.save(producto);
    }


    public void eliminarProducto(Long id) {
        repositorio.deleteById(id);
    }
}

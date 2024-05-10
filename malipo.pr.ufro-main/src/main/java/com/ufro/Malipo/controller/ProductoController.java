package com.ufro.Malipo.controller;

import com.ufro.Malipo.model.Producto;
import com.ufro.Malipo.service.CategoriaService;
import com.ufro.Malipo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;


    @GetMapping("/listado")
    public String listarProductos(Model modelo) {
        modelo.addAttribute("productos", productoService.listarProducto());
        return "listado_productos";
    }

    @GetMapping("/listado/añadir")
    public String agregarProductos(Model modelo) {
        modelo.addAttribute("producto", new Producto());
        modelo.addAttribute("listaCategorias", categoriaService.listaCategoria());
        return "crear_producto";
    }

    @PostMapping("/listado")
    public String guardarProducto(Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/listado";
    }

    @GetMapping("/listado/editar/{id}")
    public String editarProducto(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("producto", productoService.obtenerProducto(id));
        modelo.addAttribute("listaCategorias", categoriaService.listaCategoria());
        return "modificar_producto";
    }

    @PostMapping("/listado/{id}")
    public String modificarProducto(@PathVariable Long id, @ModelAttribute("producto") Producto producto, Model modelo) {
        Producto productoExistente = productoService.obtenerProducto(id);

        productoExistente.setId(id);
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setCategoria(producto.getCategoria());
        productoExistente.setValor(producto.getValor());
        productoExistente.setStock(producto.getStock());
        productoExistente.setImagen(producto.getImagen());

        productoService.actualizarProducto(productoExistente);
        return "redirect:/listado";
    }

    @GetMapping("/listado/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/listado";
    }
}

package com.ufro.Malipo.controller;

import com.ufro.Malipo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    private ProductoService productoService;

    @RequestMapping("/")
    public String paginaPrincipal(Model modelo, Principal p){
        modelo.addAttribute("productos", productoService.listarProducto());

        return "index";
    }
}

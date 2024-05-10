package com.ufro.Malipo.service;

import com.ufro.Malipo.model.Categoria;
import com.ufro.Malipo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    public List<Categoria> listaCategoria() {
        return (List<Categoria>)repositorio.findAll();
    }
}

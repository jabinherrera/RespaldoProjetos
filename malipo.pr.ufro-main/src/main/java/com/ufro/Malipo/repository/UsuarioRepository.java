package com.ufro.Malipo.repository;

import com.ufro.Malipo.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByRut(String rut);
}

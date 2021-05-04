package com.nicholasmorlin.casadocodigo.repository;

import com.nicholasmorlin.casadocodigo.modelo.Autor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AutorRepository extends CrudRepository<Autor, Integer> {

    public Optional<Autor> findByEmail(String email);
}

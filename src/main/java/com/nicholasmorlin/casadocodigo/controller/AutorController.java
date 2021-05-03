package com.nicholasmorlin.casadocodigo.controller;

import com.nicholasmorlin.casadocodigo.controller.request.AutorForm;
import com.nicholasmorlin.casadocodigo.modelo.Autor;
import com.nicholasmorlin.casadocodigo.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarAutor(@RequestBody @Valid AutorForm autorForm) {
        Autor autor = autorForm.converter();
        autorRepository.save(autor);
        return ResponseEntity.ok(autor.toString());
    }
}

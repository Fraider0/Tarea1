package com.example.CRUD.para.entidad.Curso.controllers;


import com.example.CRUD.para.entidad.Curso.models.CursoModel;
import com.example.CRUD.para.entidad.Curso.services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CursoModel")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody CursoModel curso) {
        service.save(curso);
    }

    @GetMapping
    public List<CursoModel> getCursos() {
        return service.getcursos();
    }

    @PutMapping
    public void update(@RequestBody CursoModel curso) {
        service.update(curso);
    }

    @DeleteMapping
    public void delete(@RequestBody CursoModel curso) {
        service.delete(curso);
    }
}
package com.example.CRUD.para.entidad.Curso.services;

import com.example.CRUD.para.entidad.Curso.models.CursoModel;
import com.example.CRUD.para.entidad.Curso.reposytories.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repository;

    public CursoService(CursoRepository repositorio) {this.repository = repositorio;}

    public void save(CursoModel curso) {repository.saveCurse(curso);}

    public List<CursoModel> getcursos() {
        return repository.getCursos();
    }

    public void update(CursoModel curso) {
    }

    public void delete(CursoModel curso) {
    }
}
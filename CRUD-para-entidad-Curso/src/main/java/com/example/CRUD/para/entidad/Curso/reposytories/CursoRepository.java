package com.example.CRUD.para.entidad.Curso.reposytories;
import com.example.CRUD.para.entidad.Curso.models.CursoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository {

   public List<CursoModel> lisataCurse =  new ArrayList<>();

   public void saveCurse(CursoModel curso){
       lisataCurse.add(curso);
   }

   public List<CursoModel> getCursos() {return lisataCurse;}

}
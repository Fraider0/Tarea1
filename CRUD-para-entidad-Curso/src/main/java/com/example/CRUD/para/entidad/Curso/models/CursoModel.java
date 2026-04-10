package com.example.CRUD.para.entidad.Curso.models;

public class CursoModel {

    private String nombre;
    private int duracion;
    private String profesor;

    public CursoModel() {
    }

    public CursoModel(String nombre, int duracion, String profesor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
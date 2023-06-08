package com.sistema.cursos.webapp.entidades;

import javax.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cursoId;
    private String nombreCurso;
    private String FechaInicio;
    private String fechaFin;
    private String categoria;
    private String fotoCategoria;
    private String nombreProfesor;
    private String fotoProfesor;

    public String getFotoCategoria() {
        return fotoCategoria;
    }

    public void setFotoCategoria(String fotoCategoria) {
        this.fotoCategoria = fotoCategoria;
    }

    public String getFotoProfesor() {
        return fotoProfesor;
    }

    public void setFotoProfesor(String fotoProfesor) {
        this.fotoProfesor = fotoProfesor;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    public Curso() {
    }
}

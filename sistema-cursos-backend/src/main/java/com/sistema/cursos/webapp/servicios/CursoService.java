package com.sistema.cursos.webapp.servicios;

import com.sistema.cursos.webapp.entidades.Curso;

import java.util.List;
import java.util.Set;

public interface CursoService {

    Curso agregarCurso(Curso curso);
    Curso actualizarCurso(Curso curso);
    Set<Curso> obtenerCursos();
    Curso obtenerCurso(Long cursoId);
    void eliminarCurso(Long cursoId);
    List<Curso> buscarPorNombreProfesor(String nombreProfesor);
    List<Curso> buscarPorCategoria(String categoria);


}

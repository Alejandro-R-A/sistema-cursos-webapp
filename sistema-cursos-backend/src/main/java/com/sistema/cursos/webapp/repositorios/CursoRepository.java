package com.sistema.cursos.webapp.repositorios;

import com.sistema.cursos.webapp.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    List<Curso> findByNombreProfesor(String nombreProfesor);
    List<Curso> findByCategoria(String categoria);
}

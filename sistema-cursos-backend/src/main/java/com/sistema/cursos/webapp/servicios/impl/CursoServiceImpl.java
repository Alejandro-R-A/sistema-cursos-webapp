package com.sistema.cursos.webapp.servicios.impl;

import com.sistema.cursos.webapp.entidades.Curso;
import com.sistema.cursos.webapp.repositorios.CursoRepository;
import com.sistema.cursos.webapp.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Set<Curso> obtenerCursos() {
        return new LinkedHashSet<>(cursoRepository.findAll());
    }

    @Override
    public Curso obtenerCurso(Long cursoId) {
        return cursoRepository.findById(cursoId).get();
    }

    @Override
    public void eliminarCurso(Long cursoId) {
        Curso curso = new Curso();
        curso.setCursoId(cursoId);
        cursoRepository.delete(curso);
    }

    @Override
    public List<Curso> buscarPorNombreProfesor(String nombreProfesor) {
        return cursoRepository.findByNombreProfesor(nombreProfesor);
    }

    @Override
    public List<Curso> buscarPorCategoria(String categoria) {
        return cursoRepository.findByCategoria(categoria);
    }
}

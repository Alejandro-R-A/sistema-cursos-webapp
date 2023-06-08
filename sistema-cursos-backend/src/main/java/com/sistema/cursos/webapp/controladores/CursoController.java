package com.sistema.cursos.webapp.controladores;

import com.sistema.cursos.webapp.entidades.Curso;
import com.sistema.cursos.webapp.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
@CrossOrigin("*")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/")
    public ResponseEntity<Curso> guardarCurso(@RequestBody Curso curso)
    {
        //condicionales para agregar foto segun la categoria
        if(curso.getCategoria() == "Development")
        {
            curso.setFotoCategoria("development.png");
        } else if (curso.getCategoria() == "QA") {
            curso.setFotoCategoria("qa.png");
        } else {
            curso.setFotoCategoria("ia.png");
        }

        //condicionales para agregar foto segun el profesor
        if(curso.getNombreProfesor() == "Fowler")
        {
            curso.setFotoProfesor("fowler.png");
        } else if (curso.getNombreProfesor() == "David") {
            curso.setFotoProfesor("david.png");
        } else {
            curso.setFotoProfesor("maria.png");
        }

        Curso cursoGuardado = cursoService.agregarCurso(curso);

        return ResponseEntity.ok(cursoGuardado);
    }
    @GetMapping("/{cursoId}")
    public Curso listarCursoPorId(@PathVariable("cursoId") Long cursoId){
        return cursoService.obtenerCurso(cursoId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarCursos(){
        return ResponseEntity.ok(cursoService.obtenerCursos());
    }

    @PutMapping("/")
    public Curso actualizarCurso(@RequestBody Curso curso){
        return cursoService.actualizarCurso(curso);
    }

    @DeleteMapping("/{cursoId}")
    public void eliminarCurso(@PathVariable("cursoId") Long cursoId){
        cursoService.eliminarCurso(cursoId);
    }

}

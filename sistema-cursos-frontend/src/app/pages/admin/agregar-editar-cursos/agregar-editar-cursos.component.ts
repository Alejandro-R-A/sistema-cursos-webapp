import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { CursoService } from 'src/app/services/curso.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-agregar-editar-cursos',
  templateUrl: './agregar-editar-cursos.component.html',
  styleUrls: ['./agregar-editar-cursos.component.css'],
})
export class AgregarEditarCursosComponent implements OnInit{
  curso = {
    nombreCurso: '',
    fechaInicio: '',
    fechaFin: '',
    categoria: '',
    nombreProfesor: ''
  }
  constructor(private cursoService: CursoService, private snack:MatSnackBar, private router:Router){}
  ngOnInit(): void {
  }

  formSubmit(){
    if(this.curso.nombreCurso.trim()== '' || this.curso.nombreCurso.trim() == null)
    {
      this.snack.open("El título es requerido !!",'',{
        duration:3000
      })
      return ;
    }

    this.cursoService.agregarCurso(this.curso).subscribe(
      (dato:any) =>{
        this.curso.nombreCurso = '';
        this.curso.fechaInicio = '';
        this.curso.fechaFin = '';
        this.curso.categoria = '';
        this.curso.nombreProfesor = '';
        Swal.fire('Curso agregado', 'El curso se agregó con exito', 'success');
        this.router.navigate(['/admin']);
      },
      (error) =>{
        console.log(error);
        Swal.fire('Error', 'Error al guardar el curso', 'error');
      }
    )
  }



}

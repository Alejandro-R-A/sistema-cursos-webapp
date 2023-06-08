import { Component, OnInit } from '@angular/core';
import { CursoService } from 'src/app/services/curso.service';

@Component({
  selector: 'app-ver-cursos',
  templateUrl: './ver-cursos.component.html',
  styleUrls: ['./ver-cursos.component.css']
})
export class VerCursosComponent implements OnInit{
  cursos: any = []

  constructor(private cursoService: CursoService){}
  ngOnInit(): void {
    this.obtenerCursos();
}

obtenerCursos(){
  this.cursoService.listarCursos().subscribe(
    (dato:any)=>{
      this.cursos = dato
      console.log(this.cursos);
    },
    (error) =>{
      console.log(error);
    }
  )
}
eliminarCurso(cursoId : any)
{
  this.cursoService.eliminarCurso(cursoId).subscribe(data =>{
    this.obtenerCursos();
  }, error =>{
    console.log(error);
  }); 
};

}

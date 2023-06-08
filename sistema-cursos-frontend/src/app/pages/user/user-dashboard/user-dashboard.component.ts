import { Component, OnInit } from '@angular/core';
import { CursoService } from 'src/app/services/curso.service';

export interface Tile {
  color: string;
  cols: number;
  rows: number;
  text: string;
}
@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export default class UserDashboardComponent implements OnInit{
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
}
 

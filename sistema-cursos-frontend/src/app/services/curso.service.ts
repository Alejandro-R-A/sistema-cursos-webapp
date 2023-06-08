import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class CursoService {

  constructor(private http: HttpClient) { }

  public listarCursos(){
    return this.http.get(`${baseUrl}/curso/`);
  }

  public agregarCurso(curso:any){
    return this.http.post(`${baseUrl}/curso/`,curso);
  }

  public eliminarCurso(cursoId:any){
    return this.http.delete(`${baseUrl}/curso/${cursoId}`)
  }

  actualizarCurso(curso : any)
  {
    return this.http.put(`${baseUrl}/curso/`, curso);
  }
  public obtenerCursoPorId(cursoId:any){
    return this.http.get(`${baseUrl}/curso/${cursoId}`);
  }
}

package com.sistema.cursos.webapp.servicios;

import com.sistema.cursos.webapp.entidades.Usuario;
import com.sistema.cursos.webapp.entidades.UsuarioRol;
import javax.persistence.SecondaryTable;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);
}

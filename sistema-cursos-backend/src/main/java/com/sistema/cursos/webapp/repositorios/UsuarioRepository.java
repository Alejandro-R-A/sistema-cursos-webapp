package com.sistema.cursos.webapp.repositorios;

import com.sistema.cursos.webapp.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}

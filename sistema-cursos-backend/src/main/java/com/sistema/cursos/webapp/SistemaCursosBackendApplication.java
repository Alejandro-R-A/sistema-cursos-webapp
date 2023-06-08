package com.sistema.cursos.webapp;

import com.sistema.cursos.webapp.entidades.Rol;
import com.sistema.cursos.webapp.entidades.Usuario;
import com.sistema.cursos.webapp.entidades.UsuarioRol;
import com.sistema.cursos.webapp.excepciones.UsuarioFoundException;
import com.sistema.cursos.webapp.excepciones.UsuarioNotFoundException;
import com.sistema.cursos.webapp.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaCursosBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaCursosBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try
		{
			Usuario usuario = new Usuario();

		usuario.setNombre("Alejandro");
		usuario.setApellido("Romero");
		usuario.setUsername("admin");
		usuario.setPassword(bCryptPasswordEncoder.encode("123"));
		usuario.setEmail("ale@gmail.com");
		usuario.setTelefono("123432");
		usuario.setPerfil("foto1.png");

		Rol rol = new Rol();

		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());
		}
		catch (UsuarioFoundException exception)
		{
			exception.printStackTrace();
		}*/
	}
}

package org.cibertec.repositorio;

import org.cibertec.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
	
}

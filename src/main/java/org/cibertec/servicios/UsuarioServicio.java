package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Usuario;

public interface UsuarioServicio {
	
	public List<Usuario> ListarUsuario();
	
	public void guardar (Usuario usuario);
	
	public void actualizar (Usuario usuario);
	
	public void eliminar (Integer cod);
	
	public Usuario encontrarUsuario(Integer cod);
	
	public Usuario buscarNombre(String nombre);
	
}

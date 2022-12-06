package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Usuario;
import org.cibertec.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicioImplementar implements UsuarioServicio{

	
	@Autowired
	private UsuarioRepositorio UsuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> ListarUsuario() {
		return (List<Usuario>) UsuarioRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Usuario usuario) {
		UsuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void actualizar(Usuario usuario) {
		UsuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		UsuarioRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario encontrarUsuario(Integer cod) {
		return UsuarioRepository.findById(cod).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario buscarNombre(String nombre) {
		return UsuarioRepository.findByNombre(nombre);
	}

}

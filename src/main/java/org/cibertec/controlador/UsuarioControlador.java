package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Usuario;
import org.cibertec.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Usuario")
@CrossOrigin("*")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioservicio;
	
	@GetMapping("/lista")
	public List<Usuario> lista() {
		return usuarioservicio.ListarUsuario();
	}	
	
	@GetMapping("/{codigo}")
	public  Usuario List(@PathVariable("codigo") Integer cod) {
		return usuarioservicio.encontrarUsuario(cod);
	}
	
	@PostMapping("/Registrar")
	public void registrar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@PutMapping("/Actualizar")
	public void actualizar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@DeleteMapping("/Eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		usuarioservicio.eliminar(cod);
	}
	
	@GetMapping("/Buscar/{nombre}")
	public Usuario buscar(@PathVariable("nombre") String nombre) {
		return usuarioservicio.buscarNombre(nombre);
	}
	
	
}

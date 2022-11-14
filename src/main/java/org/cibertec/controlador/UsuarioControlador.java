package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Usuario;
import org.cibertec.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioservicio;
	
	@RequestMapping(path = "/Usuario/lista", method = RequestMethod.GET)
	public List<Usuario> lista() {
		return usuarioservicio.ListarUsuario();
	}	
	
	@RequestMapping(path = "/Usuario/{codigo}", method = RequestMethod.GET)
	public  Usuario List(@PathVariable(name = "codigo", required = true) Integer cod) {
		return usuarioservicio.encontrarUsuario(cod);
	}
	
	@RequestMapping(path = "/Usuario", method = RequestMethod.POST)
	public void registrar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@RequestMapping(path = "/Usuario", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@RequestMapping(path = "/Usuario/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "codigo", required = true) Integer cod) {
		usuarioservicio.eliminar(cod);
	}
	
	@RequestMapping(path = "/Usuario/Buscar/{correo}", method = RequestMethod.GET)
	public Usuario buscar(@PathVariable(name = "correo", required = true) String correo) {
		return usuarioservicio.buscarCorreo(correo);
	}
	
}

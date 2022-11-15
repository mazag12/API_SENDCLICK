package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Mensaje;
import org.cibertec.servicios.MensajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeControlador {

	@Autowired
	private MensajeServicio mensajeservicio;
	
	@RequestMapping(path = "/Mensaje/lista", method = RequestMethod.GET)
	public List<Mensaje> lista() {
		return mensajeservicio.ListarServicio();
	}	
	
	@RequestMapping(path = "/Mensaje/{codigo}", method = RequestMethod.GET)
	public  Mensaje List(@PathVariable(name = "codigo", required = true) Integer cod) {
		return mensajeservicio.encontrarServicio(cod);
	}
	
	@RequestMapping(path = "/Mensaje", method = RequestMethod.POST)
	public void registrar(@RequestBody Mensaje mensaje) {
		mensajeservicio.guardar(mensaje);
	}
	
	@RequestMapping(path = "/Mensaje", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Mensaje mensaje) {
		mensajeservicio.guardar(mensaje);
	}
	
	@RequestMapping(path = "/Mensaje/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "codigo", required = true) Integer cod) {
		mensajeservicio.eliminar(cod);
	}
	
}

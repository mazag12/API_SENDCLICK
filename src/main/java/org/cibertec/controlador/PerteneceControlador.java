package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Pertenece;
import org.cibertec.servicios.PerteneceServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerteneceControlador {

	@Autowired
	private PerteneceServicio perteneceservicio;
	
	@RequestMapping(path = "/Pertenece/lista", method = RequestMethod.GET)
	public List<Pertenece> lista() {
		return perteneceservicio.ListarPertenece();
	}	
	
	@RequestMapping(path = "/Pertenece/{codigo}", method = RequestMethod.GET)
	public  Pertenece List(@PathVariable(name = "codigo", required = true) Integer cod) {
		return perteneceservicio.encontrarPertenece(cod);
	}
	
	@RequestMapping(path = "/Pertenece", method = RequestMethod.POST)
	public void registrar(@RequestBody Pertenece pertenece) {
		perteneceservicio.guardar(pertenece);
	}
	
	@RequestMapping(path = "/Pertenece", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Pertenece pertenece) {
		perteneceservicio.guardar(pertenece);
	}
	
	@RequestMapping(path = "/Pertenece/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "codigo", required = true) Integer cod) {
		perteneceservicio.eliminar(cod);
	}
	
}

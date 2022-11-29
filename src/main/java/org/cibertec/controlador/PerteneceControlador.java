package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Pertenece;
import org.cibertec.servicios.PerteneceServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pertenece")
public class PerteneceControlador {

	@Autowired
	private PerteneceServicio perteneceservicio;
	
	@GetMapping("/lista")
	public List<Pertenece> lista() {
		return perteneceservicio.ListarPertenece();
	}	
	
	@GetMapping("/{codigo}")
	public  Pertenece List(@PathVariable("codigo") Integer cod) {
		return perteneceservicio.encontrarPertenece(cod);
	}
	
	@PostMapping("/Registrar")
	public void registrar(@RequestBody Pertenece pertenece) {
		perteneceservicio.guardar(pertenece);
	}
	
	@PutMapping("/Actualizar")
	public void actualizar(@RequestBody Pertenece pertenece) {
		perteneceservicio.guardar(pertenece);
	}
	
	@DeleteMapping("/Eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		perteneceservicio.eliminar(cod);
	}
	
}

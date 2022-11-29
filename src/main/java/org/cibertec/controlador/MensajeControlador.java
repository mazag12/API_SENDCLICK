package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Mensaje;
import org.cibertec.servicios.MensajeServicio;
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
@RequestMapping("/Mensaje")
public class MensajeControlador {

	@Autowired
	private MensajeServicio mensajeservicio;
	
	@GetMapping("/lista")
	public List<Mensaje> lista() {
		return mensajeservicio.ListarServicio();
	}	
	
	@GetMapping("/{codigo}")
	public  Mensaje List(@PathVariable("codigo") Integer cod) {
		return mensajeservicio.encontrarServicio(cod);
	}
	
	@PostMapping("/Registrar")
	public void registrar(@RequestBody Mensaje mensaje) {
		mensajeservicio.guardar(mensaje);
	}
	
	@PutMapping("/Actualizar")
	public void actualizar(@RequestBody Mensaje mensaje) {
		mensajeservicio.guardar(mensaje);
	}
	
	@DeleteMapping("/Eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		mensajeservicio.eliminar(cod);
	}
	
}

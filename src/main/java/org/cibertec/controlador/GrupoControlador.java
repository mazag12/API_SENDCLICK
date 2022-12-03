package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Grupo;
import org.cibertec.servicios.GrupoServicio;
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
@RequestMapping("/Grupo")
@CrossOrigin("*")
public class GrupoControlador {

	@Autowired
	private GrupoServicio gruposervicio;
	
	@GetMapping("/lista")
	public List<Grupo> lista() {
		return gruposervicio.ListarGrupo();
	}	
	
	@GetMapping("/{codigo}")
	public  Grupo List(@PathVariable("codigo") Integer cod) {
		return gruposervicio.encontrarGrupo(cod);
	}
	
	@PostMapping("/Registrar")
	public void registrar(@RequestBody Grupo grupo) {
		gruposervicio.guardar(grupo);
	}
	
	@PutMapping("/Actualizar")
	public void actualizar(@RequestBody Grupo grupo) {
		gruposervicio.guardar(grupo);
	}
	
	@DeleteMapping("/Eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		gruposervicio.eliminar(cod);
	}
	
}

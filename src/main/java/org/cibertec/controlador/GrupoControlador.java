package org.cibertec.controlador;

import java.util.List;

import org.cibertec.entidad.Grupo;
import org.cibertec.servicios.GrupoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrupoControlador {

	@Autowired
	private GrupoServicio gruposervicio;
	
	@RequestMapping(path = "/Grupo/lista", method = RequestMethod.GET)
	public List<Grupo> lista() {
		return gruposervicio.ListarGrupo();
	}	
	
	@RequestMapping(path = "/Grupo/{codigo}", method = RequestMethod.GET)
	public  Grupo List(@PathVariable(name = "codigo", required = true) Integer cod) {
		return gruposervicio.encontrarGrupo(cod);
	}
	
	@RequestMapping(path = "/Grupo", method = RequestMethod.POST)
	public void registrar(@RequestBody Grupo grupo) {
		gruposervicio.guardar(grupo);
	}
	
	@RequestMapping(path = "/Grupo", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Grupo grupo) {
		gruposervicio.guardar(grupo);
	}
	
	@RequestMapping(path = "/Grupo/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "codigo", required = true) Integer cod) {
		gruposervicio.eliminar(cod);
	}
	
}

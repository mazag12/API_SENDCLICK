package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Grupo;
import org.cibertec.repositorio.GrupoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoServicioImplementar implements GrupoServicio{

	@Autowired
	private GrupoRepositorio GrupoRepository;
	
	@Override
	public List<Grupo> ListarGrupo() {
		return (List<Grupo>) GrupoRepository.findAll();
	}

	@Override
	public void guardar(Grupo grupo) {
		GrupoRepository.save(grupo);
	}

	@Override
	public void actualizar(Grupo grupo) {
		GrupoRepository.save(grupo);
	}

	@Override
	public void eliminar(Integer cod) {
		GrupoRepository.deleteById(cod);
	}

	@Override
	public Grupo encontrarGrupo(Integer cod) {
		return GrupoRepository.findById(cod).orElse(null);
	}
	
}

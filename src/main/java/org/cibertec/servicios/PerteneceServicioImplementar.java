package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Pertenece;
import org.cibertec.repositorio.PerteneceRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerteneceServicioImplementar implements PerteneceServicio{

	@Autowired
	private PerteneceRepositorio perteneceRepository;
	
	@Override
	public List<Pertenece> ListarPertenece() {
		return (List<Pertenece>) perteneceRepository.findAll();
	}

	@Override
	public void guardar(Pertenece pertenece) {
		perteneceRepository.save(pertenece);
	}

	@Override
	public void actualizar(Pertenece pertenece) {
		perteneceRepository.save(pertenece);
	}

	@Override
	public void eliminar(Integer cod) {
		perteneceRepository.deleteById(cod);
	}

	@Override
	public Pertenece encontrarPertenece(Integer cod) {
		return perteneceRepository.findById(cod).orElse(null);
	}

}

package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Mensaje;
import org.cibertec.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeServicioImplementar implements MensajeServicio{
	
	@Autowired
	private MensajeRepositorio mensajeRepository;
	
	@Override
	public List<Mensaje> ListarServicio() {
		return (List<Mensaje>) mensajeRepository.findAll();
	}

	@Override
	public void guardar(Mensaje mensaje) {
		mensajeRepository.save(mensaje);
	}

	@Override
	public void actualizar(Mensaje mensaje) {
		mensajeRepository.save(mensaje);
	}

	@Override
	public void eliminar(Integer cod) {
		mensajeRepository.deleteById(cod);
	}

	@Override
	public Mensaje encontrarServicio(Integer cod) {
		return mensajeRepository.findById(cod).orElse(null);
	}

}

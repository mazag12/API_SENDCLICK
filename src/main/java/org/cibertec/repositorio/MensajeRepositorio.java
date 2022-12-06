package org.cibertec.repositorio;

import org.cibertec.entidad.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeRepositorio extends CrudRepository<Mensaje, Integer> {

	Mensaje findByTelefono(String telefono);
	
	Mensaje findByNombre(String nombre);
	
}

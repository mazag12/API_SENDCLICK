package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Mensaje;

public interface MensajeServicio {

	public List<Mensaje> ListarServicio();
	
	public void guardar (Mensaje mensaje);
	
	public void actualizar (Mensaje mensaje);
	
	public void eliminar (Integer cod);
	
	public Mensaje encontrarServicio(Integer cod);
	
}

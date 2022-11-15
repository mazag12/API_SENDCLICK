package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Pertenece;

public interface PerteneceServicio {

	public List<Pertenece> ListarPertenece();
	
	public void guardar (Pertenece pertenece);
	
	public void actualizar (Pertenece pertenece);
	
	public void eliminar (Integer cod);
	
	public Pertenece encontrarPertenece(Integer cod);
	
}

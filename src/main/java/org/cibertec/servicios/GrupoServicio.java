package org.cibertec.servicios;

import java.util.List;

import org.cibertec.entidad.Grupo;

public interface GrupoServicio {
	
	public List<Grupo> ListarGrupo();
	
	public void guardar (Grupo grupo);
	
	public void actualizar (Grupo grupo);
	
	public void eliminar (Integer cod);
	
	public Grupo encontrarGrupo(Integer cod);
		
}

package org.cibertec.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MENSAJE")
public class Mensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MENSAJE_ID")
	int numero;
	
	@Column(name = "MENSAJE_USUARIO")
	String nombre;
	
	@Column(name = "MENSAJE_TEXTO")
	String mensaje;
	
	@Column(name = "TELEFONO")
	String telefono;
	
}

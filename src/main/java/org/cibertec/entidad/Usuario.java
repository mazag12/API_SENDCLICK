package org.cibertec.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USUARIO_ID")
	int usuario;
	
//	@Email
	@Column(name = "USUARIO_CORREO")
	String correo;
	
//	@NotNull
	@Column(name = "USUARIO_PASSWORD")
	String contrasena;
	
	@Column(name = "USUARIO_NOMBRE")
	String nombre;

}

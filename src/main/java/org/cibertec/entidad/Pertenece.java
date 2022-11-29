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
@Table(name = "PERTENECE")
public class Pertenece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERTENECE_ID")
	int codigo; 
	
	@Column(name = "PERTENECE_USUARIO")
	int per_grupo;
	
	@Column(name = "PERTENECE_GRUPO")
	int per_usuario;
	
}

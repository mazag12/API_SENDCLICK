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
@Table(name = "GRUPO")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GRUPO_ID")
	int grupo;
	
	@Column(name = "GRUPO_DENOMINACION")
	String denominacion;
	
}

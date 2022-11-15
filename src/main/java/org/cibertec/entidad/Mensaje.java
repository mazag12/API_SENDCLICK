package org.cibertec.entidad;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MENSAJE")
public class Mensaje {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MENSAJE_ID")
	int numero;
	
	@ManyToOne
	@JoinColumn(name = "MENSAJE_USUARIO", insertable = false, updatable = false)
	Usuario usuario;
	
	String MENSAJE_USUARIO;
	
	@ManyToOne
	@JoinColumn(name = "MENSAJE_GRUPO", insertable = false, updatable = false)
	Grupo grupo;
	
	String MENSAJE_GRUPO;
	
	@Column(name = "MENSAJE_TEXTO")
	String texto;
	
	@Column(name = "MENSAJE_FECHA")
	Date fecha;
	
}

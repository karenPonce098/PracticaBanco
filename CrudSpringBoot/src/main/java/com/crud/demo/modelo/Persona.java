package com.crud.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idpersona;

	@Column(name="nombre")
	private String name;

	private String apellido;

	@Column(name = "titular")
	private int idtitular;

	public Persona() {
	}
	
}

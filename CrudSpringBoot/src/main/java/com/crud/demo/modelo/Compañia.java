package com.crud.demo.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compañia")
public class Compañia {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int idcompañia;
	private String nombre;

    @Column(name="id_titular")
    private int idtitular;
 
	public Compañia() {
		
	}
}

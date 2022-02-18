package com.crud.demo.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_consumidor")
public class CuentaConsumidor {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int idcuentaconsumidor;

	private String nombre;

    @Column(name = "titular")
	private int idtitular;

    public CuentaConsumidor() {
		
	}
}

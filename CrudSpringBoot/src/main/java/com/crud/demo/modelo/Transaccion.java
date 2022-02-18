package com.crud.demo.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaccion")
public class Transaccion {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int idtransaccion;
	private String banco;
    private int tipocargo;
    
    @Column(name = "cuenta")
	private int idcuentacomercial;
 
	public Transaccion() {
		
	}
}

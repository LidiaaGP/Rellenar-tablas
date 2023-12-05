package com.ipartek.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="edadesrecomendadas")
public class EdadRecomendada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="edad")
	private String edad;

	public EdadRecomendada(int id, String edad) {
		super();
		this.id = id;
		this.edad = edad;
	}

	public EdadRecomendada() {
		super();
		this.id = 0;
		this.edad = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "EdadRecomendada [id=" + id + ", edad=" + edad + "]";
	}
	
	
	
	
}

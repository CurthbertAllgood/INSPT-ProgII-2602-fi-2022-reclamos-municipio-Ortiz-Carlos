package com.mycompany.proyectofinal;
import java.io.Serializable;


class Reclamo implements Serializable{

	private String descripcion;
	private int id;

	public Reclamo(String descripcion, int id) {
		this.descripcion = descripcion;
		this.id = id;
	}
	
	public Reclamo(){
		
	}

	public int getId(){
		return id;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	
	
}

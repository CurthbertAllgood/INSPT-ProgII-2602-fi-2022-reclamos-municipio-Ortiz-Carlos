package com.mycompany.proyectofinal.Modelo;
import java.io.Serializable;
import java.time.LocalDate;


public class Reclamo implements Serializable{

	
    private int idReclamo;

    private LocalDate fechaCreacion;

    private LocalDate Resolucion;

    private Object Categoria;

    private Object Domicilio;

    private Object EstadoReclamo;

    private String descripcion;

    private String detalle;


	public Reclamo(int idReclamo, LocalDate fechaCreacion, LocalDate Resolucion, Object Categoria, Object Domicilio, Object estadoReclamo, 
		String descripcion, String detalle) {
		this.idReclamo = idReclamo;
		this.fechaCreacion = fechaCreacion;
		this.Resolucion = Resolucion;
		this.Categoria = Categoria;
		this.Domicilio = Domicilio;
		this.EstadoReclamo = estadoReclamo;
		this.descripcion = descripcion;
		this.detalle = detalle;
	}

	
	public Reclamo(String descripcion, int idReclamo) {
		this.descripcion = descripcion;
		this.idReclamo = idReclamo;
	}
	
	public Reclamo(){
		
	}

	Reclamo(int id, String descripcion, String fechaCreacion, String fechaResolucion, String resolucion, String categoria, int idPersona, int idDomicilio) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	public float getId(){
		return idReclamo;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	
}

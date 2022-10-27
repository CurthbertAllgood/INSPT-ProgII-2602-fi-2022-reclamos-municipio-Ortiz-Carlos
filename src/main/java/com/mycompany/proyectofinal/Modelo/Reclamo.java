package com.mycompany.proyectofinal.Modelo;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Reclamo implements Serializable{

	
    private int idReclamo;
    
    private String DescripReclamo;
    
    private LocalDate FCReclamo;
    
    private LocalDate FRReclamo;

    private Categoria CategoriaReclamo;

    private Domicilio Domi;

    private EstadoReclamo Estado;

    private String DetalleResolucion;
    
    private Persona idPersonaReclamo;

	
	public Reclamo(){
		
	}


	public Reclamo(int id, String descripcion, LocalDate fechaCreacion, LocalDate fechaResolucion, Categoria categoria, Domicilio domicilio, EstadoReclamo estado, String detalle, Persona idPersona){
	idReclamo=id;
	DescripReclamo=descripcion;
	FCReclamo=fechaCreacion;
	FRReclamo=fechaResolucion;
	Domi=domicilio;
	DetalleResolucion=detalle;
	CategoriaReclamo=categoria;
	Estado=estado;
	idPersonaReclamo=idPersona;
	
	}

	public	Reclamo(int id, String descripcion, String fechaCreacion, String detalle, String categoria, int idPersona) {
		setId(id);
		setDescripcion(descripcion);
		setFechaCreacion(fechaCreacion);
		
		setDetalleResolucion(detalle);
		setCategoria(CategoriaReclamo);
		setPersona(idPersona);
		
	}

	//Getters 
	
	public int getId(){
		return idReclamo;
	}
	
	public String getDescripcion(){
		return DescripReclamo;
	}
	
	public LocalDate getFechaCreacion(){
		return FCReclamo;
	}
	
	public LocalDate getFechaResolucion(){
		return FRReclamo;
	}
	
	public Categoria getCategoria(){
		Categoria categoria = null;
		return categoria;
	}
	
	public Domicilio getDomicilio(){
		Domicilio dom=null;
		return dom;
	}
	
	
	public EstadoReclamo getEstadoReclamo(){
		EstadoReclamo er=null;
		return er;
	}
	
	public String getDetalle(){
		return DetalleResolucion;
	}
	public Persona getIdPersona(){
		return idPersonaReclamo;
	}
	
	// INICIO SETTERS
	
	//Set Id Reclamo
	
	public void setId(int id){
		if(id<0){
			throw new RuntimeException("Valor de ID incorrecto");
		}
		this.idReclamo=id;
	}

	//Set Descripcion de reclamo

	public void setDescripcion(String Descripcion) {
		
		DescripReclamo=Descripcion;
		
	}

	public void setFechaResolucion(String fechaResolucion) {
		try{
		LocalDate fechaFinal= LocalDate.parse(fechaResolucion);
			this.FRReclamo = fechaFinal;
		}catch(DateTimeParseException ex){
		}
	}
	
	
	

	public void setFechaCreacion(String fechaCreacion) {
		try{
		LocalDate fechaFinal= LocalDate.parse(fechaCreacion);
		this.FCReclamo = fechaFinal;
		}catch(DateTimeParseException ex){
			throw new RuntimeException("La fecha de reclamo no es válida", ex);
		}
	}
	
	public void setDetalleResolucion(String detalle) {

		DetalleResolucion=detalle;
	}

	public void setCategoria(Categoria CategoriaReclamo) {
		this.CategoriaReclamo=null;
	}

	public void setPersona(int idPersona) {
		idPersonaReclamo=null;
	}



@Override
	public String toString() {
		return "Reclamo{" + "idReclamo=" + idReclamo +   ", descripcion=" + DescripReclamo + ", fechaCreacion=" + FCReclamo  + ", fechaResolucion=" + FRReclamo + ", Categoria=" + CategoriaReclamo + ", Domicilio=" + Domi + ", EstadoReclamo=" + Estado + ", detalle=" + DetalleResolucion + ", idPersona=" + idPersonaReclamo + '}';
	}	
	
}

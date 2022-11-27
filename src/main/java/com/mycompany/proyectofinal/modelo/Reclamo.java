package com.mycompany.proyectofinal.modelo;
import java.io.Serializable;
import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Reclamo implements Serializable{

	
    private Long idReclamo;
    
    private String DescripReclamo;
    
    private LocalDate FCReclamo;
    
    private LocalDate FRReclamo;

    private Categoria CategoriaReclamo;

    private Long idDomicilio;

    private EstadoReclamo Estado;

    private String DetalleResolucion;
    
    private Long idPersonaReclamo;
    
    private Long idPersona;

	
	public Reclamo(){
		
	}


	public Reclamo(Long id, String descripcion, String fechaCreacion, /*String fechaResolucion,*/ String detalle, String categoria, Long idPersona) {
		setId(id);
		setDescripcion(descripcion);
		setFechaCreacion(fechaCreacion);
		//setFechaResolucion(fechaResolucion);
		setDetalleResolucion(detalle);
		setCategoria(CategoriaReclamo);
		setPersona(idPersona);
	}
	/*
	Reclamo(Long id, String descripcion, String fechaCreacion, String detalle, String categoria, Long idPersona) {
		setId(id);
		setDescripcion(descripcion);
		setFechaCreacion(fechaCreacion);
		setDetalleResolucion(detalle);
		setCategoria(CategoriaReclamo);
		setPersona(idPersona);
	}

	*/

	//Getters 
	
	public Long getId(){
		return idReclamo;
	}
	
	public String getDescripcion(){
		return DescripReclamo;
	}
	
	public Date getFechaCreacion(){
		return java.sql.Date.valueOf(FCReclamo);
	}
	
	public Date getFechaResolucion(){
		return java.sql.Date.valueOf(FRReclamo);
	}
	
	public String getDetalle(){
		return DetalleResolucion;
	}
	
	public Categoria getCategoria(){
		Categoria categoria = null;
		return categoria;
	}
	
	
	public Long getIdDomicilio(){
		return idDomicilio;
	}
	
	
	public EstadoReclamo getEstadoReclamo(){
		EstadoReclamo er=null;
		return er;
	}
	

	public Long getIdPersona(){
		return idPersonaReclamo;
	}
	
	// INICIO SETTERS
	
	//Set Id Reclamo FUNCIONA
	
	public long setId(Long id){
		if(id<0){
			throw new RuntimeException("Valor de ID incorrecto");
		}
		return	this.idReclamo=id;
	}

	//Set Descripcion de reclamo FUNCIONA

	public String setDescripcion(String Descripcion) {
		
		return this.DescripReclamo=Descripcion;
		
	}

	//Set fecha de resolucion NO FUNCIONA, tira null pointer exception
	
	public void setFechaResolucion(String fechaResolucion) {
		try{
		LocalDate fechaFinal= LocalDate.parse(fechaResolucion);
			this.FRReclamo = fechaFinal;
		}catch(DateTimeParseException ex){
			throw new RuntimeException("La fecha ingresada tiene parametros erroneos");
		}
	}
	
	
	//set fecha Creacion FUNCIONA

	public void setFechaCreacion(String fechaCreacion) {
		try{
		LocalDate fechaFinal= LocalDate.parse(fechaCreacion);
		this.FCReclamo = fechaFinal;
		}catch(DateTimeParseException ex){
			throw new RuntimeException("La fecha de reclamo no es válida", ex);
		}
	}
	//Setea detalles de resolucion de incidente, por el momento NO FUNCIONA
	
	public void setDetalleResolucion(String detalle) {
		if(DetalleResolucion==null || detalle.trim().isEmpty()){
			DetalleResolucion="el reclamo sigue en revision";
		}
		this.DetalleResolucion=detalle;
	}

	//NO SE SETEO TODAVIA
	public void setCategoria(Categoria CategoriaReclamo) {
		
		this.CategoriaReclamo=null;
	}

	
	// NO SE SETEO TODAVIA
	public void setPersona(Long idPersona) {
		Long persona=idPersona;
	}




}
	
		


package com.mycompany.proyectofinal.model.DTO;

import java.sql.SQLException;

public class DomicilioDTO {

    private String Direccion;

    private String numeracion;

    private ComunaDTO Comuna;

    private CodigoPostalDTO CodigoPostal;
    
    private Long idPersona;

	public DomicilioDTO() {
	}
    
    
	public String getDireccion(){
		return Direccion;
	}
	
	public String getNumeracion(){
		return numeracion;
		
	}
	
	
    
}




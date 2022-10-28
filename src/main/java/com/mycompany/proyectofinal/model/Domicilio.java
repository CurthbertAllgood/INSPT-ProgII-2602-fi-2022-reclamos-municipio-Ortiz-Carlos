package com.mycompany.proyectofinal.model;

import java.sql.SQLException;

public class Domicilio {

    private String Direccion;

    private String numeracion;

    private Comuna Comuna;

    private CodigoPostal CodigoPostal;
    
    private Long idPersona;

	public Domicilio() {
	}
    
    
	public String getDireccion(){
		return Direccion;
	}
	
	public String getNumeracion(){
		return numeracion;
		
	}
	
	
    
}




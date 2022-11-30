/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.modelo.Persona;
import com.mycompany.proyectofinal.modelo.Persona;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class PersonaContribuyente extends Persona{

	public PersonaContribuyente(Long id, String nombre, String apellido, String rol) {
		super(id, nombre, apellido, rol);
		
		
	}


	private String GET_ALL;
	
	@Override
	public String getQuery() {
		return GET_ALL=("SELECT * from reclamo where id_Persona='"+ this.getPersonaId()+"'");
			
		
	}
	
	
}

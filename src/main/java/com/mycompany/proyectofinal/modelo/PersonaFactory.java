/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;



public class PersonaFactory {
	
	
	public static Persona crearPersona(String tipoModelo, Long id, String nombre, String apellido){
		
		Persona p=init();
			
		
		switch(tipoModelo){
			case "Administrador":
				p = new  PersonaAdmin(id, nombre, apellido, tipoModelo);
				break;
			case "Contribuyente":
				p = new PersonaContribuyente(id, nombre, apellido, tipoModelo);
				break;
		}
		
		
		return p;
	}


	private static Persona init(){
		return null;
	}



	
	
}

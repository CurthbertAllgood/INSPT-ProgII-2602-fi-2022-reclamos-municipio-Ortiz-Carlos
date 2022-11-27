/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.model.DTO.PersonaAdminDAO;
import com.mycompany.proyectofinal.model.DTO.PersonaContribuyenteDAO;



public class PersonaFactory {
	
	
	public static PersonaDAO crearPersona(String tipoModelo, Long id, String nombre, String apellido){
		
		PersonaDAO p=init();
			
		
		switch(tipoModelo){
			case "Administrador":
				p = new PersonaAdminDAO(id, nombre, apellido);
				break;
			case "Contribuyente":
				p = new PersonaContribuyenteDAO(id, nombre, apellido);
				break;
		}
		

		

		return p;
	}


	private static PersonaDAO init(){
		return null;
	}



	
	
}

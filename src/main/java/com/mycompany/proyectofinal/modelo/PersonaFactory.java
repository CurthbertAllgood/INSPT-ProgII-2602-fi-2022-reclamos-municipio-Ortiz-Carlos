/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.DTO.PersonaContribuyenteDTO;
import com.mycompany.proyectofinal.DTO.PersonaDTO;
import com.mycompany.proyectofinal.DTO.PersonaAdminDTO;



public class PersonaFactory {
	
	
	public static PersonaDTO crearPersona(String tipoModelo, Long id, String nombre, String apellido){
		
		PersonaDTO p=init();
			
		
		switch(tipoModelo){
			case "Administrador":
				p = new PersonaAdminDTO(id, nombre, apellido);
				break;
			case "Contribuyente":
				p = new PersonaContribuyenteDTO(id, nombre, apellido);
				break;
		}
		
		if(p==null){


			//p= new PersonaAdminDTO(Long.valueOf(1), "carlos", "ortiz");
		}
		

		return p;
	}


	private static PersonaDTO init(){
		return null;
	}



	
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.model;



public class ModeloFactory {

		
	public static Modelo crearModelo(String tipoModelo){
		switch(tipoModelo){
			case "reclamo":
				new ModeloReclamo();
				break;
		}
		return null;
		
	}

	
	
}

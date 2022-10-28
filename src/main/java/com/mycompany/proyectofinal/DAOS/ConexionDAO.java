/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DAOS;


/**
 *
 * @author VGRCAORT
 */
public interface ConexionDAO {
	
	
	ReclamoDAO getReclamoDAO();
	PersonaDAO getPersonaDAO();
	DomicilioDAO getDomicilioDAO();
	UsuarioDAO getUsuarioDAO();
	
}

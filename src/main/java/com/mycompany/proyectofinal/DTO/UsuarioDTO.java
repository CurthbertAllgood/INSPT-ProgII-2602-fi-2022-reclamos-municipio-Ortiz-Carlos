/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DTO;

/**
 *
 * @author VGRCAORT
 */
public class UsuarioDTO {
	private String userId;
	private String pass;

	public UsuarioDTO(String userId, String pass) {
		this.userId = userId;
		this.pass = pass;
	}

	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}

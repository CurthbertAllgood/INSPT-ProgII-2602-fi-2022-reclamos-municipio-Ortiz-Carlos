/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DTO;

import com.mycompany.proyectofinal.DTO.PersonaDTO;
import com.mycompany.proyectofinal.DTO.PersonaDTO;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class PersonaContribuyenteDTO extends PersonaDTO{

	@Override
	public PersonaDTO cargarPersona(Long id_Persona) {
		return super.cargarPersona(id_Persona); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	public PersonaContribuyenteDTO(Long PersonaId, String nombre, String apellido) {
		super(PersonaId, nombre, apellido);
	}



	public PersonaContribuyenteDTO(String rol, Long id, String nombre, String apellido, int DNI, String email, int telefono) {
		super(rol, id, nombre, apellido, DNI, email, telefono);
	}

	public PersonaContribuyenteDTO() {
	}

	@Override
	public List<PersonaDTO> getList() {
		return super.getList(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public void update() {
		super.update(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public void remove() {
		super.remove(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public void add() {
		super.add(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public Long get() {
		return super.get(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public void setRol(String rol) {
		super.setRol(rol); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public String getRol() {
		return super.getRol(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}
	
}

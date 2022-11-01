/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.model;

import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class PersonaContribuyente extends Persona{

	public PersonaContribuyente(int id, String nombre, String apellido, int DNI, String email, int telefono) {
		super(id, nombre, apellido, DNI, email, telefono);
	}

	public PersonaContribuyente() {
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
	public int get() {
		return super.get(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}
	@Override
	public List<Persona> getList(){
		return null;
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

package com.mycompany.proyectofinal.model;

import java.util.List;

public class Persona {

    private int PersonaId;
    
    private String nombre;

    private String apellido;

    private Float dni;

    private String email;

    private Float telefono;
    
    private List<Domicilio> Domicilio;

    private List<Usuario> Usuario;

    private List<Reclamo> Reclamoid;

	public Persona(int id, String nombre, String apellido, int DNI, String email, int telefono) {
		setid(id);
		setNombre(nombre);
		setApellido(apellido);
		setDNI(DNI);
		setEmail(email);
		setTelefono(telefono);
	}
    
    
    public int getIdPersona(){
	    return PersonaId;
    }
    
    public void generaReclamo() {
    }

    public void cancelaReclamo() {
    }

    public void modificaReclamo() {
    }

	private void setid(int id) {
		if(id<0){
			throw new RuntimeException("Valor de ID incorrecto");
		}
		this.PersonaId=id;
	}

	private void setNombre(String nombre) {
		
	}

	private void setApellido(String apellido) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	private void setDNI(int DNI) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	private void setEmail(String email) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	private void setTelefono(int telefono) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}

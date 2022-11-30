package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.DTO.DomicilioDTO;
import com.mycompany.proyectofinal.DTO.DomicilioDTO;
import com.mycompany.proyectofinal.DTO.ReclamoDTO;
import com.mycompany.proyectofinal.DTO.ReclamoDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import java.util.List;

public abstract class Persona {
	
    private String rol;
    
    private Long PersonaId;
    
    private String nombre;

    private String apellido;

    private Float dni;

    private String email;

    private Float telefono;
    
    private List<DomicilioDTO> Domicilio;

    private List<UsuarioDTO> Usuario;

    private List<ReclamoDTO> Reclamoid;

	public Persona(String rol, Long id, String nombre, String apellido, int DNI, String email, int tele) {
		setRol(rol);
		setPersonaId(id);
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setEmail(email);
		setTelefono(telefono);
	}

	public Persona(Long id, String nombre, String apellido, String rol) {
		this.PersonaId = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rol = rol;
		
	}
	

	Persona() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Long getPersonaId() {
		return PersonaId;
	}

	public void setPersonaId(Long PersonaId) {
		this.PersonaId = PersonaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Float getDni() {
		return dni;
	}

	public void setDni(Float dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getTelefono() {
		return telefono;
	}

	public void setTelefono(Float telefono) {
		this.telefono = telefono;
	}

	public List<DomicilioDTO> getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(List<DomicilioDTO> Domicilio) {
		this.Domicilio = Domicilio;
	}

	public List<UsuarioDTO> getUsuario() {
		return Usuario;
	}

	public void setUsuario(List<UsuarioDTO> Usuario) {
		this.Usuario = Usuario;
	}

	public List<ReclamoDTO> getReclamoid() {
		return Reclamoid;
	}

	public void setReclamoid(List<ReclamoDTO> Reclamoid) {
		this.Reclamoid = Reclamoid;
	}
	
	public String getQuery(){
		return null;
	}
    
	

}

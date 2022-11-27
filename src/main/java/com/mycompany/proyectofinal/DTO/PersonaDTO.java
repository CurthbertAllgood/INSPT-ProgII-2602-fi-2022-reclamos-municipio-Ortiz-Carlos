package com.mycompany.proyectofinal.DTO;

import com.mycompany.proyectofinal.DTO.DomicilioDTO;
import com.mycompany.proyectofinal.DTO.ReclamoDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import java.util.List;

public abstract class PersonaDTO {
	
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

	public PersonaDTO(String rol, Long id, String nombre, String apellido, int DNI, String email, int telefono) {
		setRol(rol);
		setid(id);
		setNombre(nombre);
		setApellido(apellido);
		setDNI(DNI);
		setEmail(email);
		setTelefono(telefono);
	}

	public PersonaDTO(Long PersonaId, String nombre, String apellido) {
		this.PersonaId = PersonaId;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	

	PersonaDTO() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
    
	
	
    public PersonaDTO cargarPersona(Long id_Persona){
	    PersonaDTO p = null;
	    return p;
    }
    public String getRol() {
    	return rol;
    }

    public void setRol(String rol) {
    	this.rol = rol;
    }
    
    public Long get(){
	    return PersonaId;
    }
   
    public void add() {
    }

    public void remove() {
    }

    public void update() {
    }
    
    public List<PersonaDTO> getList(){
	    return null;
	}

	private void setid(Long id) {
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

	void cargaUsuario(Long id_Persona) {
		
	}

}

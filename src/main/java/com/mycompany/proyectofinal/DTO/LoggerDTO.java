/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DTO;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author VGRCAORT
 */
public class LoggerDTO {
	private int loggerId;
	private LocalDate dia;
	private LocalTime hora;
	private String id;
	private Long id_Persona;

	public LoggerDTO(LocalDate dia, LocalTime hora, String id, Long id_p) {
		this.dia = dia;
		this.hora = hora;
		this.id = id;
		this.id_Persona=id_p;
	}

	public LoggerDTO() {
	}

	public Long getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(Long id_Persona) {
		this.id_Persona = id_Persona;
	}


	public LoggerDTO(int idLog, String user, LocalDate fecha, LocalTime hora) {
		this.loggerId=idLog;
		this.id=user;
		this.dia=fecha;
		this.hora=hora;
		
	}
	
	

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getDia() {
		return dia.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	public LocalTime getHora() {
		return hora;
	}

	public String getId() {
		return id;
	}
	
	
	
	
	
}

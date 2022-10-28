/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DAOS.MySQLDAOS;

import com.mycompany.proyectofinal.DAOS.PersonaDAO;
import com.mycompany.proyectofinal.model.Conexion;
import com.mycompany.proyectofinal.model.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class MySQLPersonaDAO implements PersonaDAO{

	
	private final Conexion generaConexion;
	final private String GET_ALL="SELECT * FROM Persona";
	final private String SET_RECLAMO="INSERT INTO Persona VALUES(null, ?,?,?,?,?,?,?)";
	


	private Connection con;

	public MySQLPersonaDAO(Connection con) throws SQLException, ClassNotFoundException{
		this.generaConexion = new Conexion();
		this.con= con;
	}
	
	
	
	@Override
	public void agregar(Persona p) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void modificar(Persona p) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void eliminar(Persona p) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void obtener(Persona p) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public List<Persona> obtenerLista() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	
	
}

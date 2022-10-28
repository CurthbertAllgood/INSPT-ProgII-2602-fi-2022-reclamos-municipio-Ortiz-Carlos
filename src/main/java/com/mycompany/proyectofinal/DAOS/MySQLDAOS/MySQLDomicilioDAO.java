/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.DAOS.MySQLDAOS;

import com.mycompany.proyectofinal.DAOS.DomicilioDAO;
import com.mycompany.proyectofinal.model.Conexion;
import com.mycompany.proyectofinal.model.Domicilio;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class MySQLDomicilioDAO implements DomicilioDAO {

	
	private final Conexion generaConexion;
	final private String GET_ALL="SELECT * FROM Domicilio";
	final private String SET_RECLAMO="INSERT INTO domicilio VALUES(null, ?,?,?,?,?,?,?)";
	


	private Connection con;

	public MySQLDomicilioDAO(Connection con) throws SQLException, ClassNotFoundException{
		this.generaConexion = new Conexion();
		this.con= con;
	}
	
	@Override
	public void agregar(Domicilio T) {
	
	}

	@Override
	public void modificar(Domicilio T) {

	}

	@Override
	public void eliminar(Domicilio T) {
		
	}

	@Override
	public void obtener(Domicilio id) {
		
	}

	@Override
	public List<Domicilio> obtenerLista() {
	
		return null;
	
	}
	
}

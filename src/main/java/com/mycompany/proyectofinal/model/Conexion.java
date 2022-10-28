/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.model;

import com.mycompany.proyectofinal.DAOS.ConexionDAO;
import com.mycompany.proyectofinal.DAOS.DomicilioDAO;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLDomicilioDAO;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLPersonaDAO;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLReclamoDAO;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLUsuarioDAO;
import com.mycompany.proyectofinal.DAOS.PersonaDAO;
import com.mycompany.proyectofinal.DAOS.ReclamoDAO;
import com.mycompany.proyectofinal.DAOS.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *	
 * @author VGRCAORT
 */
public class Conexion implements ConexionDAO{

	private static Connection con;
	private static String user="root";
	private static String pass="Prisma01";
	private static String url="jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static String driver="com.mysql.cj.jdbc.Driver";
	private ReclamoDAO reclamo=null;
	private PersonaDAO persona=null;
	private DomicilioDAO domicilio=null;
	private UsuarioDAO usuario=null;
	
	
	
	public Connection getConexion() throws SQLException, ClassNotFoundException{
	if(con==null){
		Class.forName(driver);
		con= DriverManager.getConnection(url, user, pass);
		getReclamoDAO();
	}
		return con;
	}
	
	
	@Override
	public ReclamoDAO getReclamoDAO() {
		if(reclamo==null){
			try {
				reclamo = new MySQLReclamoDAO(con);
			} catch (SQLException | ClassNotFoundException ex) {
				System.out.println("No llega la conexion");
			}
		}
		return reclamo;
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		if(persona==null){
			try {
				persona = new MySQLPersonaDAO(con);
			} catch (SQLException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		return persona;
	}	

	@Override
	public DomicilioDAO getDomicilioDAO() {
		if(domicilio==null){
			try {
				domicilio = new MySQLDomicilioDAO(con);
			} catch (SQLException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		return domicilio;
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		if(usuario==null){
			try {
				usuario = new MySQLUsuarioDAO(con);
			} catch (SQLException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		return usuario;
	}

	Connection getConexion(String GET_ALL) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	
}

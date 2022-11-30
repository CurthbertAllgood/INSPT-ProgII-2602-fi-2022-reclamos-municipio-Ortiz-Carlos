package com.mycompany.proyectofinal.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author VGRCAORT
 */
public class UsuarioDAO {
	private String user;
	private String password;
	private PersonaFactory model;
	
	
	final private String GET_ALL="SELECT * FROM Reclamo";
	final private String ADD_RECLAMO="INSERT INTO reclamo VALUES(null, ?,?,?,?,?,?,?)";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String usuario = "root";
	private static final String contrasenia = "Prisma01";
	private Conexion generaConexion;
	
	
	public Persona autenticar(String user, String password) throws ClassNotFoundException, SQLException{
		Persona p = null;
		try(Connection con = Conexion.getConexion(DRIVER, URL, usuario, contrasenia);
			PreparedStatement ps= con.prepareStatement("SELECT rol, id_Persona, Nombre, Apellido FROM persona WHERE id_Persona = (SELECT id_Persona FROM usuario WHERE Contraseña='" +password+ "' AND id_Usuario='"+user+"')")){
		try(ResultSet rs= ps.executeQuery()){
			if(rs.next()){
			p= model.crearPersona(rs.getString(1), rs.getLong(2), rs.getString(3), rs.getString(4));
			}
		        } catch (SQLException ex) {
				throw new RuntimeException("Error de SQL", ex);
			} catch (Exception ex) {
				throw new RuntimeException("Error al agregar alumno", ex);
			}
		
		}

	return p;
}
}


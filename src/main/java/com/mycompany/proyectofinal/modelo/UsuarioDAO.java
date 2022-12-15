package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.DTO.LoggerDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author VGRCAORT
 */
public class UsuarioDAO {
	private String user;
	private String password;
	private PersonaFactory model;
	private UsuarioDTO usu;
	private LoggerDTO log;
	
	private String GET_USER=("SELECT * FROM Usuario where id_Usuario='"+user+"'");
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String usuario = "root";
	private static final String contrasenia = "Prisma01";
	private Conexion generaConexion;
	
	
	
	public Persona autenticar(String user, String password) throws ClassNotFoundException, SQLException{
		Persona p = null;
		usu= new UsuarioDTO(user, password);
		Logger logger= new Logger();
		try(Connection con = Conexion.getConexion(DRIVER, URL, usuario, contrasenia);
			PreparedStatement ps= con.prepareStatement("SELECT rol, id_Persona, Nombre, Apellido FROM persona WHERE id_Persona = (SELECT id_Persona FROM usuario WHERE Contraseña='" +usu.getPass()+ "' AND id_Usuario='"+usu.getUserId()+"')")){
		try(ResultSet rs= ps.executeQuery()){
			if(rs.next()){
			p= model.crearPersona(rs.getString(1), rs.getLong(2), rs.getString(3), rs.getString(4));
			log = new LoggerDTO(LocalDate.now(), LocalTime.now(),usu.getUserId(),p.getPersonaId());
				logger.addLog(log);
			}
		        } catch (SQLException ex) {
				throw new RuntimeException("Error de SQL", ex);
			} catch (Exception ex) {
				throw new RuntimeException("Error al agregar Usuario", ex);
			}
		
		}

	return p;
}
}


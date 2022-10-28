package com.mycompany.proyectofinal.DAOS.MySQLDAOS;

import com.mycompany.proyectofinal.DAOS.UsuarioDAO;
import com.mycompany.proyectofinal.model.Conexion;
import com.mycompany.proyectofinal.model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MySQLUsuarioDAO implements UsuarioDAO{
	
	
	private final Conexion generaConexion;
	final private String GET_ALL="SELECT * FROM Usuario";
	
	final private String SET_RECLAMO="INSERT INTO usuario VALUES(null, ?,?,?)";
	


	private Connection con;

	public MySQLUsuarioDAO(Connection con) throws SQLException, ClassNotFoundException{
		this.generaConexion = new Conexion();
		this.con= con;
	}

	public MySQLUsuarioDAO() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	

	@Override
	public void agregar(Usuario T) {
	
	}

	@Override
	public void modificar(Usuario T) {
	
	}

	@Override
	public void eliminar(Usuario T) {
	
	}

	@Override
	public void obtener(Usuario id) {
	
	}

	@Override
	public List<Usuario> obtenerLista() {

		return null;

	}
	
	public boolean compararSiExiste(String userId) throws SQLException, ClassNotFoundException{
		Connection con=null;
			con= generaConexion.getConexion();
		return true;
	}
	
	
	
}

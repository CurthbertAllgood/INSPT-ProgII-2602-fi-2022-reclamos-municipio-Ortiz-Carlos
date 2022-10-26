
package com.mycompany.proyectofinal.Modelo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Modelo {
	
	private final Conexion generaConexion= new Conexion();
	private final String GET_ALL_RECLAMOS="SELECT * FROM reclamo";
	
	public List<Reclamo> getReclamo() throws SQLException{
		List<Reclamo> listaReclamos = new ArrayList<>();
		Connection con = generaConexion.getConexion(); 
		PreparedStatement ps = con.prepareStatement(GET_ALL_RECLAMOS); 
		ResultSet rs = ps.executeQuery();
			while(rs.next()){
				listaReclamos.add(rsReclamo(rs));
			}
			
		return listaReclamos;
	}

		
		
	private Reclamo rsReclamo(ResultSet rs) throws SQLException{
		int id= rs.getInt("id_Reclamo");
		String descripcion= rs.getString("descripcion");
		String fechaCreacion= rs.getString("Fecha_Creacion");
		String fechaResolucion= rs.getString("Fecha_Resolucion");
		String resolucion= rs.getString("Resolucion");
		String categoria= rs.getString("Categoria");
		int idPersona=rs.getInt("id_Persona");
		int idDomicilio= rs.getInt("domicilio_id_domicilio");
		
		
	return new Reclamo(id, descripcion, fechaCreacion, fechaResolucion, resolucion, categoria, idPersona, 
		   idDomicilio);
		
	}
	
	
}
	


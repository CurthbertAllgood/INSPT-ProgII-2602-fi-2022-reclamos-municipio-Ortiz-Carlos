/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.model.DTO.ReclamoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class PersonaAdminDAO extends PersonaDAO{
	private static final String GET_ALL="SELECT * from Reclamo";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "Prisma01";
	private Conexion generaConexion;

	PersonaAdminDAO(Long id, String nombre, String apellido) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	
	
	
	@Override
	public List<ReclamoDTO> getList() throws SQLException  {
        List<ReclamoDTO> listaReclamo = new ArrayList<>();
		System.out.println("entraste al listado de reclamos");
        try (Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);PreparedStatement ps = con.prepareStatement(GET_ALL)){
            try(ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
		  listaReclamo.add(rsReclamo(rs));
            }
	    }catch (SQLException ex) {
            throw new RuntimeException("Error al obtener reclamo", ex);
        }finally{
		con.close();
	}

        return listaReclamo;
    }
}	
	private ReclamoDTO rsReclamo(ResultSet rs) throws SQLException{
	Long id= rs.getLong("id_Reclamo");
	System.out.println("nuevo id"+id);
	String fechaCreacion= rs.getString("Fecha_Creacion");
	System.out.println(fechaCreacion);
	String descripcion= rs.getString("Descripcion");
	System.out.println(descripcion);
	//String fechaResolucion= rs.getString("Fecha_Resolucion");  // esta dando error de nullPointer
	//System.out.println(fechaResolucion);
	String detalle= rs.getString("Resolucion"); // no esta regresando datos, se esta analizando
	System.out.println(detalle);
	String categoria= rs.getString("Categoria"); //falta adaptar el setCategoria
	System.out.println(categoria);
	Long idPersona=rs.getLong("id_Persona");// falta adaptar el setPersona
	System.out.println(idPersona);
	return new ReclamoDTO(id, descripcion, fechaCreacion, /*fechaResolucion,*/ detalle, categoria, idPersona);
	}
	
	
	
}

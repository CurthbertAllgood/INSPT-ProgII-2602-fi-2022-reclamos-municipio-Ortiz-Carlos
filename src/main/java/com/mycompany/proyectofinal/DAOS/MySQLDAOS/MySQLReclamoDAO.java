package com.mycompany.proyectofinal.DAOS.MySQLDAOS;

import com.mycompany.proyectofinal.DAOS.ReclamoDAO;
import com.mycompany.proyectofinal.model.Conexion;
import com.mycompany.proyectofinal.model.Reclamo;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQLReclamoDAO implements ReclamoDAO{
	final private String GET_ALL="SELECT * FROM Reclamo";
	final private String SET_RECLAMO="INSERT INTO reclamo VALUES(null, ?,?,?,?,?,?,?)";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos";
	private static final String USER = "root";
	private static final String PASS = "Prisma01";
	private final Conexion generaConexion;

	private final Connection con;

	public MySQLReclamoDAO(Connection con) throws SQLException, ClassNotFoundException{
		this.generaConexion = new Conexion();
		this.con= con;
	}
	
	
	//541168419182
	//08105556267 de 9 a 18 hs y sab de 9 a 12
	
	//5491159366575


	
	
	
	@Override
	public void agregar(Reclamo r) {
		PreparedStatement stat= null;
		try{
			stat=con.prepareStatement(SET_RECLAMO);
			stat.setLong(1, r.getId());
			stat.setString(2, r.getDescripcion());
			stat.setDate(2,r.getFechaCreacion());
			stat.setDate(4, r.getFechaResolucion());
			stat.setString(5, r.getDetalle());
			stat.setObject(6,r.getCategoria());
			stat.setLong(7, r.getIdDomicilio());
			stat.setLong(8, r.getIdPersona());
		}catch(SQLException ex){
			throw new RuntimeException("No se logro conectar a la base");
			
		}finally{
			if(stat!=null){
			try {
				stat.close();
			} catch (SQLException ex) {
				throw new RuntimeException("Error de sql");
			}
			}
	}
		
	}
	
	

	@Override
	public void modificar(Reclamo r) {
	
	}

	@Override
	public void eliminar(Reclamo r) {
	
	}

	@Override
	public void obtener(Reclamo id) {
	
	}

	@Override
	public List<Reclamo> obtenerLista() {
		List<Reclamo> listaReclamos = new ArrayList<>();
		Connection con = null;
		try {
			con = generaConexion.getConexion();
			System.out.println(con);
		} catch (SQLException ex) {
			Logger.getLogger(MySQLReclamoDAO.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(MySQLReclamoDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		PreparedStatement ps; 
		try {
			ps = con.prepareStatement(GET_ALL);
			System.out.println(ps);
		} catch (SQLException ex) {
			throw new RuntimeException("error al pasar la consulta al ResultSet");
		}
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			System.out.println(rs);
		} catch (SQLException ex) {
			throw new RuntimeException("error en la ejecucion de query");
		}
		try {
			while(rs.next()){
				System.out.println(rs);
				listaReclamos.add(rsReclamo(rs));
			}
		} catch (SQLException ex) {
			throw new RuntimeException("Error en el salto de fila");
		}
		System.out.println("LLEGASTE A CARGAR LOS DATOS AL ARRAY");
		return listaReclamos;
	}
	
	
		
	private Reclamo rsReclamo(ResultSet rs) throws SQLException{
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
	return new Reclamo(id, descripcion, fechaCreacion, /*fechaResolucion,*/ detalle, categoria, idPersona);
	}
	
}

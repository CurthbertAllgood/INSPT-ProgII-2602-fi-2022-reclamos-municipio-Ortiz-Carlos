
package com.mycompany.proyectofinal.model;
import com.mycompany.proyectofinal.DTO.ReclamoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleRole;
import static jdk.internal.org.jline.utils.Colors.s;

public class ModeloReclamo implements Modelo<ReclamoDTO>{
	final private String GET_ALL="SELECT * FROM Reclamo";
	final private String ADD_RECLAMO="INSERT INTO reclamo VALUES(null, ?,?,?,?,?,?,?)";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "Prisma01";
	private Conexion generaConexion;
	
	@Override
	public List<ReclamoDTO> getList()  {
        List<ReclamoDTO> listaReclamo = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
	    
            while (rs.next()) {
		  listaReclamo.add(rsReclamo(rs));
            }
	
        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener carreras", ex);
        }
	
        return listaReclamo;
    }
	

	@Override
	public ReclamoDTO get(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public int add(ReclamoDTO reclamo) {
		int regsAgregados=0;
		try(Connection con= generaConexion.getConexion(DRIVER, URL, USER, PASS);PreparedStatement ps= con.prepareStatement(ADD_RECLAMO)){
			generaReclamo(ps, reclamo);
			regsAgregados=ps.executeUpdate();
		}catch(SQLException ex){
			throw new RuntimeException("No se logro cargar en la bd", ex);
		}catch(RuntimeException ex) {
			throw new RuntimeException("hubo un error en la generacion del reclamo", ex);
		}catch(Exception ex) {
			Logger.getLogger(ModeloReclamo.class.getName()).log(Level.SEVERE, null, ex);
		}
		return regsAgregados;
	}

	@Override
	public int update(ReclamoDTO reclamo) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public int remove(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}



//Generadores de objeto ReclamoDTO

	//addReclamo	
	public void generaReclamo(PreparedStatement ps, ReclamoDTO rec)throws SQLException{
		ps.setLong(1, rec.getId());
		ps.setString(2, rec.getDescripcion());
		ps.setDate(3, rec.getFechaCreacion());
		ps.setDate(4, rec.getFechaResolucion());
		ps.setString(5, rec.getDetalle());
		ps.setObject(6, rec.getCategoria());
		ps.setLong(7, rec.getIdDomicilio());
		ps.setObject(8, rec.getEstadoReclamo());
		ps.setLong(9, rec.getIdPersona());
	}
	
	//getList y getReclamo
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


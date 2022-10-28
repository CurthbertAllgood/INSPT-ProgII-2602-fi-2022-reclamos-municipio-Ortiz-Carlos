
package com.mycompany.proyectofinal;
import com.mycompany.proyectofinal.model.Modelo;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLReclamoDAO;
import com.mycompany.proyectofinal.DAOS.MySQLDAOS.MySQLUsuarioDAO;
import com.mycompany.proyectofinal.DAOS.ReclamoDAO;
import com.mycompany.proyectofinal.DAOS.UsuarioDAO;
import com.mycompany.proyectofinal.model.Conexion;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;


// Servlet Para mostrar y generar Reclamos
@WebServlet(name = "RegistroServlet", urlPatterns = {"/reclamos"})
public class Controlador extends HttpServlet {

	private Conexion model;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		request.setAttribute("listaReclamos", model.getReclamoDAO().obtenerLista());
		
		request.getRequestDispatcher("/pages/reclamos.jsp").forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		String userId= request.getParameter("user");
		String password= request.getParameter("password");
		MySQLUsuarioDAO userDAO= new MySQLUsuarioDAO();
		
	
		
		
	}
	
	
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
	
	
	@Override
	public void init() throws ServletException{
		this.model=new Conexion();
	}
    
    
    
	
}

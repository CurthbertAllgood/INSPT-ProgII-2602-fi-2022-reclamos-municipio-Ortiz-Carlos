
package com.mycompany.proyectofinal.Controller;
import com.mycompany.proyectofinal.model.Modelo;
import com.mycompany.proyectofinal.model.Conexion;
import com.mycompany.proyectofinal.model.ModeloFactory;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


//DoGet y DoPost es un pasador de datos, no tiene logica


// Servlet Para mostrar y generar Reclamos
@WebServlet(name = "RegistroServlet", urlPatterns = {"/reclamos"})
public class Controlador extends HttpServlet {
	
	private Modelo model;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String accion= request.getParameter("accion");
		switch("accion"){
			default:
			request.setAttribute("listaReclamos", model.getList());
			request.getRequestDispatcher("/pages/reclamos.jsp").forward(request, response);
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		String userId= request.getParameter("user");
		String password= request.getParameter("password");
		
	}
	
	
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
	
	
	@Override
	public void init() throws ServletException {
        this.model = getModelo();
	}
    
    
	private Modelo getModelo() throws ServletException{
		Modelo m=null;
		String tipoModelo="reclamo";
		m = ModeloFactory.crearModelo(tipoModelo);
		
		return m; 
	}
	
}

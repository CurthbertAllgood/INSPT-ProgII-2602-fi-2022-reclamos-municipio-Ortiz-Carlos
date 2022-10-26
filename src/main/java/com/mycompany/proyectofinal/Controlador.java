
package com.mycompany.proyectofinal;
import com.mycompany.proyectofinal.Modelo.Modelo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(name = "RegistroServlet", urlPatterns = {"/reclamos"})
public class Controlador extends HttpServlet {

	private Modelo model;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		try {
			request.setAttribute("listaReclamos", model.getReclamo());
		} catch (SQLException ex) {
			Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
		}
		request.getRequestDispatcher("/pages/reclamos.jsp").forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		
	}
	@Override
	public String getServletInfo() {
		return "Short description";
	}
	
	
	@Override
	public void init() throws ServletException{
		this.model=new Modelo();
	}

	
}

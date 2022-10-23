
package com.mycompany.proyectofinal;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "RegistroServlet", urlPatterns = {"/reclamos"})
public class Controlador extends HttpServlet {

	private Modelo model;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		request.setAttribute("listaReclamos", model.getReclamo());
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

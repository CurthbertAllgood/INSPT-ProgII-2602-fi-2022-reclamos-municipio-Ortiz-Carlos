
package com.mycompany.proyectofinal.Controller;
import com.mycompany.proyectofinal.modelo.Persona;
import com.mycompany.proyectofinal.DTO.ReclamoDTO;
import com.mycompany.proyectofinal.modelo.Conexion;
import com.mycompany.proyectofinal.modelo.ReclamoDAO;
import com.mycompany.proyectofinal.modelo.PersonaFactory;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
//DoGet y DoPost es un pasador de datos, no tiene logica

// Servlet Para mostrar y generar Reclamos
@WebServlet(name = "ReclamoServlet", urlPatterns = {"/reclamos"})
public class ControladorReclamosDomicilio extends HttpServlet {

	private ReclamoDAO model;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
			HttpSession session = request.getSession();
			Persona m = (Persona) session.getAttribute("userLogueado");
			System.out.println(m.getApellido());
			System.out.println(m.getNombre());
			System.out.println(m.getPersonaId());
			System.out.println(m.getRol());
			System.out.println(m);
		try {	
			request.setAttribute("listaReclamos", model.getReclamos(m));
		} catch (SQLException ex) {
			Logger.getLogger(ControladorReclamosDomicilio.class.getName()).log(Level.SEVERE, null, ex);
		}
			request.getRequestDispatcher("/pages/reclamos.jsp").forward(request, response);
		}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
	
	@Override
	public void init() throws ServletException {
		model= new ReclamoDAO();
	}
	
	
	
	
	
}

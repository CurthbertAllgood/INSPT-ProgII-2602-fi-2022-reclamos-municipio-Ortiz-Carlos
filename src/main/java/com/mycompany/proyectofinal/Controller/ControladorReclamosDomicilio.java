
package com.mycompany.proyectofinal.Controller;
import com.mycompany.proyectofinal.model.DTO.ReclamoDTO;
import com.mycompany.proyectofinal.modelo.Conexion;
import com.mycompany.proyectofinal.modelo.PersonaDAO;
import com.mycompany.proyectofinal.modelo.ModeloReclamo;
import com.mycompany.proyectofinal.modelo.PersonaFactory;
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
import jakarta.servlet.http.HttpSession;
//DoGet y DoPost es un pasador de datos, no tiene logica

// Servlet Para mostrar y generar Reclamos
@WebServlet(name = "ReclamoServlet", urlPatterns = {"/reclamos"})
public class ControladorReclamosDomicilio extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			PersonaDAO m = (PersonaDAO) session.getAttribute("userLogueado");
			System.out.println(m);
			request.setAttribute("listaReclamos", m.getList());
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
	

    
    

	
}

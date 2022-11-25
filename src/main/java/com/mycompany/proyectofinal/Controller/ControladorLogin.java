

//generar Servlets por entidad/vista, no por roles.

//Usar la base de datos para filtrar informacion, no usar variables ni metodos para ese tipo de cosas. Lo que puede resolver la bd lo tiene que hacer la bd




package com.mycompany.proyectofinal.Controller;

import com.mycompany.proyectofinal.model.UsuarioDAO;
import com.mycompany.proyectofinal.DTO.PersonaDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import jakarta.servlet.RequestDispatcher;
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


/**
 *
 * @author VGRCAORT
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class ControladorLogin extends HttpServlet {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private PersonaDTO p= null;



	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		 request.getRequestDispatcher("/pages/login.jsp").forward(request, response);
					
		}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		try {
			String userId  = request.getParameter("user");
			String password = request.getParameter("password");
			UsuarioDAO m= new UsuarioDAO();
			p=m.autenticar(userId, password);
			
			//Devuelve un objeto vacio, entonces salta al sqlException
			
			if(p!=null){
				String haciaDondeIba = request.getParameter("deDondeViene");
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(10);
				session.setAttribute("userLogueado", p);
			}
			else{
				
				request.setAttribute("hayError", true);
				request.setAttribute("mensajeError", "Credenciales incorrectas!");
				doGet(request, response);
			}
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("no se genero el objeto", ex);
		} catch (SQLException ex) {
			throw new RuntimeException("error de base de datos", ex);
		}
	
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}

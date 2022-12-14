

//generar Servlets por entidad/vista, no por roles.

//Usar la base de datos para filtrar informacion, no usar variables ni metodos para ese tipo de cosas. Lo que puede resolver la bd lo tiene que hacer la bd




package com.mycompany.proyectofinal.Controller;

import com.mycompany.proyectofinal.modelo.UsuarioDAO;
import com.mycompany.proyectofinal.modelo.Persona;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import com.mycompany.proyectofinal.DTO.LoggerDTO;
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
			System.out.println(userId);
			String password = request.getParameter("password");
			System.out.println(password);
			Persona p= new UsuarioDAO().autenticar(userId, password);
			System.out.println(p);	
			if(p!=null){
				String haciaDondeIba = request.getParameter("deDondeViene");
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(10);
				session.setAttribute("userLogueado", p);
				response.sendRedirect(request.getContextPath()+haciaDondeIba);
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

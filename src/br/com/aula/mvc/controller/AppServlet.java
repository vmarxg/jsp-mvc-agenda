package br.com.aula.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ControllerServlet
 * @param <T>
 */
@WebServlet("/app")
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String parametro = request.getParameter("logica");
		String pagina = null;
		try {
			switch (parametro) {
			case "Login":
				pagina = "/resources/views/login.jsp";			
				break;			
			case "Home":
				pagina = "/resources/views/home.jsp";
				break;		
			}			
			request.getRequestDispatcher(pagina).forward(request, response);
			
		} catch (Exception e) {
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}	
	}	

}

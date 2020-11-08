package br.com.aula.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.aula.mvc.logica.*;


/**
 * Servlet implementation class ControllerServlet
 * @param <T>
 */
@WebServlet("/app/contatos")
public class ContatoServlet extends HttpServlet {
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
			case "AdicionaContato":
				pagina = new AdicionaContato().executa(request,response);
				break;
			case "ListaContatos":
				pagina = new ListaContatos().executa(request, response);
				break;
			case "RemoveContato":
				pagina = new RemoveContato().executa(request,response);
				break;
			case "AdicionaContatoForm":
				pagina = "/resources/views/contato/adiciona-contato.jsp";
				break;
			case "EditaContato":
				pagina = new BuscaContatoId().executa(request, response); 
				break;
			case "AtualizaContato":
				pagina = new AtualizaContato().executa(request, response);
				break;
			}			
			request.getRequestDispatcher(pagina).forward(request, response);
			
		} catch (Exception e) {
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}	
	}	
	
	

}

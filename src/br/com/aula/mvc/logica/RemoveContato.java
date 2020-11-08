package br.com.aula.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.aula.mvc.model.dao.ContatoDao;
import br.com.aula.mvc.model.etidade.Contato;

public class RemoveContato implements Logica {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		return "contatos?logica=ListaContatos";	
	}
}

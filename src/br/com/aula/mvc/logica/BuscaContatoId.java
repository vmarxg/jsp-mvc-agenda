package br.com.aula.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.aula.mvc.model.dao.ContatoDao;
import br.com.aula.mvc.model.etidade.Contato;

public class BuscaContatoId implements Logica{

	@Override
	public String executa(HttpServletRequest request, 
			HttpServletResponse response) 
					throws Exception {
		
		long id = Long.parseLong(request.getParameter("id"));
		
		Contato contato = new ContatoDao().getContatoId(id);
		request.setAttribute("contato", contato);

		return "/resources/views/contato/edita-contato.jsp";			
	}

}

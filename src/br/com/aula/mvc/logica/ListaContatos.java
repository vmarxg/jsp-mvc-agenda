package br.com.aula.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.aula.mvc.model.dao.ContatoDao;
import br.com.aula.mvc.model.etidade.Contato;

public class ListaContatos implements Logica{

	@Override
	public String executa(HttpServletRequest request, 
			HttpServletResponse response) 
					throws Exception {
		List<Contato> contatos = new ContatoDao().getLista();
		request.setAttribute("contatos", contatos);
		
		return "/resources/views/contato/lista-contatos.jsp";	
	}

}

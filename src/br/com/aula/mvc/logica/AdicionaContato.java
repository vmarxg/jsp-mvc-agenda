package br.com.aula.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.aula.mvc.model.dao.ContatoDao;
import br.com.aula.mvc.model.etidade.Contato;

public class AdicionaContato implements Logica{

	@Override
	public String executa(HttpServletRequest request, 
			HttpServletResponse response) 
					throws Exception {
			
		// monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		contato.setEndereco(request.getParameter("endereco"));
		contato.setEmail(request.getParameter("email"));		
		
		try {
		// fazendo a conversão da data
		Calendar dataNascimento = null;	
		Date date =
				new SimpleDateFormat("dd/MM/yyyy")
				.parse(request.getParameter("dataNascimento"));
		dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		contato.setDataNascimento(dataNascimento);
		} catch (Exception e) {
			throw new ServletException("A conversão de data causou uma exceção", e);
		}
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
					
		return "contatos?logica=ListaContatos";

	}

}

package br.com.aula.mvc.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.aula.mvc.jdbc.ConnectionFactory;
import br.com.aula.mvc.model.etidade.Contato;

public class ContatoDao {
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Object obj){
		if (!(obj instanceof Contato)) {
			return;
		}
		
		Contato contato = (Contato) obj;
		String sql = "INSERT INTO contatos "
				+ "(nome,email,endereco,dataNascimento) " + "VALUES (?,?,?,?)";

		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void atualiza(Object obj) {
		if (!(obj instanceof Contato)) {
			return;
		}
			
		Contato contato = (Contato) obj;

		String sql = "UPDATE contatos SET nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
	
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
	
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public Contato getContatoId(Long id) {

		if (id == null) {
			throw new IllegalStateException("Id do contato não deve ser nulo.");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contatos where id = ?");
			stmt.setLong(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return montaContatoComResultSet(rs);
			}

			rs.close();
			stmt.close();

			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<>();

			PreparedStatement stmt = this.connection
					.prepareStatement("SELECT * FROM contatos");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Contato contato = montaContatoComResultSet(rs);
				contatos.add(contato);
			}
			return contatos;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private Contato montaContatoComResultSet(ResultSet rs) {
		try {
			Contato contato = new Contato();

			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(rs.getDate("dataNascimento"));
			
			contato.setDataNascimento(dataNascimento);

			return contato;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Object obj) {
		if (!(obj instanceof Contato)) {
			return;
		}
		
		Contato contato = (Contato) obj;
		
		try {
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM contatos WHERE id=?");
			stmt.setLong(1, contato.getId());

			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}

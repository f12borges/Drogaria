package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = new Estado();

		estado.setNome("Santa Catarina");
		estado.setSigla("SC");

		estadoDAO.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {

		EstadoDAO estadoDAO = new EstadoDAO();

		List<Estado> resultado = estadoDAO.listar();

		// Teste de lista de registros.
		for (Estado estado : resultado) {
			System.out.println("Listar: " + estado.getCodigo() + " " + estado.getNome() + " " + estado.getSigla());
		}
	}

	@Test
	@Ignore
	public void buscar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(2L);

		// Teste de busca de registros.
		System.out.println("Buscar: " + estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
	}

	@Test
	@Ignore
	public void excluir() {

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(2L);

		estadoDAO.excluir(estado);
	}

	@Test
	@Ignore
	public void editar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(2L);

		estado.setSigla("BA");
		estado.setNome("Bahia");

		estadoDAO.editar(estado);
	}
}

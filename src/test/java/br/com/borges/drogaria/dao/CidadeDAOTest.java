package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Cidade;
import br.com.borges.drogaria.domain.Estado;

public class CidadeDAOTest {

	@Test
	@Ignore
	public void salvar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(1L);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = new Cidade();

		cidade.setNome("Florianópolis");
		cidade.setEstado(estado);		

		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void listar() {

		CidadeDAO cidadeDAO = new CidadeDAO();

		List<Cidade> resultado = cidadeDAO.listar();

		// Teste de lista de registros.
		for (Cidade cidade : resultado) {
			System.out.println("Listar:");
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Código da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println();
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(3L);

		cidadeDAO.excluir(cidade);
	}

	@Test
	@Ignore
	public void editar() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(2L);

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3L);

		cidade.setNome("Florianópolis");
		cidade.setEstado(estado);

		cidadeDAO.editar(cidade);
	}
}

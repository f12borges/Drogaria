package br.com.borges.drogaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Cidade;
import br.com.borges.drogaria.domain.Estado;

public class CidadeDAOTest {

	@Test
	//@Ignore
	public void salvar() {

		Long codigoEstado = 1L;

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);

		Cidade cidade = new Cidade();
		cidade.setNome("São Paulo");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Código da Cidade: " + cidade.getCodigo() + ".");
			System.out.println("Nome da Cidade: " + cidade.getNome() + ".");
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo() + ".");
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla() + ".");
			System.out.println("Nome do Estado: " + cidade.getNome() + ".");
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 1L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		System.out.println("\nCódigo da Cidade: " + cidade.getCodigo() + ".");
		System.out.println("Nome da Cidade: " + cidade.getNome() + ".");
		System.out.println("Código do Estado: " + cidade.getEstado().getCodigo() + ".");
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla() + ".");
		System.out.println("Nome do Estado: " + cidade.getNome() + ".");
		System.out.println();

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 5L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		cidadeDAO.excluir(cidade);

	}

	@Test
	@Ignore
	public void editar() {

		Long codigoCidade = 1L;
		Long codigoEstado = 1L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);

		cidade.setNome("São Paulo");
		cidade.setEstado(estado);
		
		cidadeDAO.editar(cidade);
		
	}

}

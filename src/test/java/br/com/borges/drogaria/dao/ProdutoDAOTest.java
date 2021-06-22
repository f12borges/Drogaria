package br.com.borges.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Fabricante;
import br.com.borges.drogaria.domain.Produto;

public class ProdutoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));

		Produto produto = new Produto();
		produto.setDescricao("CoronaVac");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("922.10"));
		produto.setQuantidade(new Short("10000"));

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);

	}

	@Test
	@Ignore
	public void listar() {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		for (Produto produto : resultado) {
			System.out.println("Teste: " + produto.getDescricao() + ".");
		}
	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 1L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		System.out.println("Teste: " + produto.getDescricao() + ".");

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 1L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		produtoDAO.excluir(produto);

	}

	@Test
	@Ignore
	public void editar() {

		Long codigo = 1L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		produto.setDescricao("CoronaVac");
		produto.setPreco(new BigDecimal("1547.50"));
		
		produtoDAO.editar(produto);

	}
}

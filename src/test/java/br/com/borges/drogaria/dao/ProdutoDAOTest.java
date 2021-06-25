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
		Fabricante fabricante = fabricanteDAO.buscar(1L);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = new Produto();

		produto.setDescricao("CoronaVac");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("922.10"));
		produto.setQuantidade(new Short("10000"));	

		produtoDAO.salvar(produto);
	}

	@Test
	@Ignore
	public void listar() {

		ProdutoDAO produtoDAO = new ProdutoDAO();

		List<Produto> resultado = produtoDAO.listar();

		// Teste de lista de registros.
		for (Produto produto : resultado) {
			System.out.println("Listar:");
			System.out.println("Descrição Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição Produto: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Descrição Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Descrição Produto: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(1L);

		produtoDAO.excluir(produto);
	}

	@Test
	@Ignore
	public void editar() {		

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(3L);
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(3L);

		produto.setDescricao("BNT162");
		produto.setPreco(new BigDecimal("1847.50"));
		produto.setQuantidade(new Short("17000"));
		produto.setFabricante(fabricante);

		produtoDAO.editar(produto);

	}
}

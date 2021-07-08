package br.com.borges.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.ItemVenda;
import br.com.borges.drogaria.domain.Produto;
import br.com.borges.drogaria.domain.Venda;

public class ItemVendaDAOTest {

	@Test
	@Ignore
	public void salvar() {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(1L);

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(1L);

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = new ItemVenda();

		itemVenda.setProduto(produto);
		itemVenda.setQuantidade(new Short("1"));
		itemVenda.setValorParcial(new BigDecimal("1.0"));
		itemVenda.setVenda(venda);

		itemVendaDAO.salvar(itemVenda);
	}

	@Test
	@Ignore
	public void listar() {

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		List<ItemVenda> resultado = itemVendaDAO.listar();

		// Teste de lista de registros.
		for (ItemVenda itemVenda : resultado) {
			System.out.println("Listar:");
			System.out.println("Venda: " + itemVenda.getVenda().getCodigo());
			System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
			System.out.println("Quantidade: " + itemVenda.getQuantidade());
			System.out.println("Valor Parcial: " + itemVenda.getValorParcial());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(6L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Venda: " + itemVenda.getVenda().getCodigo());
		System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
		System.out.println("Quantidade: " + itemVenda.getQuantidade());
		System.out.println("Valor Parcial: " + itemVenda.getValorParcial());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(9L);

		itemVendaDAO.excluir(itemVenda);
	}

	@Test
	@Ignore
	public void editar() {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(3L);

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(3L);

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(3L);

		itemVenda.setProduto(produto);
		itemVenda.setQuantidade(new Short("3"));
		itemVenda.setValorParcial(new BigDecimal("3000.00"));
		itemVenda.setVenda(venda);

		itemVendaDAO.editar(itemVenda);
	}
}

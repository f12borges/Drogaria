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

		ItemVenda itemVenda = new ItemVenda();

		itemVenda.setProduto(produto);
		itemVenda.setQuantidade(new Short("10"));
		itemVenda.setValorParcial(new BigDecimal("22.10"));
		itemVenda.setVenda(venda);

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		itemVendaDAO.salvar(itemVenda);

	}

	@Test
	@Ignore
	public void listar() {

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		List<ItemVenda> resultado = itemVendaDAO.listar();

		for (ItemVenda itemVenda : resultado) {

			System.out.println("Listar: " + itemVenda.getCodigo());
		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 1L;

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);

		System.out.println("Buscar: " + itemVenda.getCodigo());

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 1L;

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		itemVendaDAO.excluir(itemVenda);

	}
	
	@Test
	@Ignore
	public void editar() {
		
		Long codigo = 3L;

		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();

		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		itemVenda.setQuantidade(new Short("1"));
		
		itemVendaDAO.editar(itemVenda);
		
	}

}

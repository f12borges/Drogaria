package br.com.borges.drogaria.dao;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Cliente;
import br.com.borges.drogaria.domain.Funcionario;
import br.com.borges.drogaria.domain.Venda;

public class VendaDAOTest {

	@Test
	@Ignore
	public void salvar() {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(1L);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(1L);

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = new Venda();

		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setHorario(new Date());
		venda.setValorTotal(new BigDecimal("155.10"));

		vendaDAO.salvar(venda);
	}

	@Test
	@Ignore
	public void listar() {

		VendaDAO vendaDAO = new VendaDAO();

		List<Venda> resultado = vendaDAO.listar();

		// Teste de lista de registros.
		for (Venda venda : resultado) {
			System.out.println("Listar:");
			System.out.println("Nome Funcionario: " + venda.getFuncionario().getPessoa().getNome());
			System.out.println("Nome Cliente: " + venda.getCliente().getPessoa().getNome());
			System.out.println("Valor: " + venda.getValorTotal());
			System.out.println("Horário: " + venda.getHorario());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(6L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Nome Funcionario: " + venda.getFuncionario().getPessoa().getNome());
		System.out.println("Nome Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Valor: " + venda.getValorTotal());
		System.out.println("Horário: " + venda.getHorario());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(9L);

		vendaDAO.excluir(venda);
	}

	@Test
	// @Ignore
	public void editar() {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(2L);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(3L);

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(2L);

		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setHorario(new Date());
		venda.setValorTotal(new BigDecimal("945.10"));

		vendaDAO.editar(venda);
	}
}

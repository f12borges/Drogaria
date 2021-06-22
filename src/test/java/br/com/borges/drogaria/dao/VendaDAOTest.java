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

		Cliente cliente = clienteDAO.buscar(4L);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		Funcionario funcionario = funcionarioDAO.buscar(1L);

		Venda venda = new Venda();

		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setHorario(new Date());
		venda.setValorTotal(new BigDecimal("1.10"));

		VendaDAO vendaDAO = new VendaDAO();

		vendaDAO.salvar(venda);

	}

	@Test
	@Ignore
	public void listar() {

		VendaDAO vendaDAO = new VendaDAO();

		List<Venda> resultado = vendaDAO.listar();

		for (Venda venda : resultado) {

			System.out.println("Listar: " + venda.getCodigo() + " " + venda.getHorario());
		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 4L;

		VendaDAO vendaDAO = new VendaDAO();

		Venda venda = vendaDAO.buscar(codigo);

		System.out.println("Buscar: " + venda.getCodigo() + " " + venda.getHorario());

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 4L;

		VendaDAO vendaDAO = new VendaDAO();

		Venda venda = vendaDAO.buscar(codigo);
		
		vendaDAO.excluir(venda);

	}
	
	@Test
	public void editar() {
		
		Long codigo = 5L;

		VendaDAO vendaDAO = new VendaDAO();

		Venda venda = vendaDAO.buscar(codigo);
		
		venda.setHorario(new Date());
		venda.setValorTotal(new BigDecimal("5.50"));
		
		vendaDAO.editar(venda);
		
	}

}

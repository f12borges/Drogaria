package br.com.borges.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Cliente;
import br.com.borges.drogaria.domain.Pessoa;

public class ClienteDAOTest {

	@Test
	@Ignore
	public void salvar() throws ParseException {

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();

		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("24/06/2021"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		clienteDAO.salvar(cliente);
	}

	@Test
	@Ignore
	public void listar() {

		ClienteDAO clienteDAO = new ClienteDAO();

		List<Cliente> resultado = clienteDAO.listar();

		// Teste de lista de registros.
		for (Cliente cliente : resultado) {
			System.out.println("Listar:");
			System.out.println("Nome: " + cliente.getPessoa().getNome());
			System.out.println("Liberado: " + cliente.getLiberado());
			System.out.println("Data do Cadastro: " + cliente.getDataCadastro());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(9L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Nome: " + cliente.getPessoa().getNome());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println("Data do Cadastro: " + cliente.getDataCadastro());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(9L);

		clienteDAO.excluir(cliente);
	}

	@Test
	@Ignore
	public void editar() {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(3L);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);

		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);

		clienteDAO.editar(cliente);
	}
}

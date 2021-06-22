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

		Cliente cliente = new Cliente();

		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("21/06/2021"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();

		clienteDAO.salvar(cliente);

	}

	@Test
	@Ignore
	public void listar() {

		ClienteDAO clienteDAO = new ClienteDAO();

		List<Cliente> resultado = clienteDAO.listar();

		for (Cliente cliente : resultado) {

			System.out.println("Listar: " + cliente.getPessoa().getNome());

		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 5L;

		ClienteDAO clienteDAO = new ClienteDAO();

		Cliente cliente = clienteDAO.buscar(codigo);

		System.out.println("Buscar: " + cliente.getPessoa().getNome());

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 7L;

		ClienteDAO clienteDAO = new ClienteDAO();

		Cliente cliente = clienteDAO.buscar(codigo);
		
		clienteDAO.excluir(cliente);

	}
	
	@Test
	@Ignore
	public void editar() {
		
		Long codigo = 4L;

		ClienteDAO clienteDAO = new ClienteDAO();

		Cliente cliente = clienteDAO.buscar(codigo);
		
		cliente.setLiberado(true);
		
		clienteDAO.editar(cliente);
		
	}

}

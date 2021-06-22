package br.com.borges.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Funcionario;
import br.com.borges.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {

	@Test
	@Ignore
	public void salvar() throws ParseException {

		PessoaDAO pessoaDAO = new PessoaDAO();

		Pessoa pessoa = pessoaDAO.buscar(2L);

		Funcionario funcionario = new Funcionario();

		funcionario.setCarteiraTrabalho("123456");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("21/06/2021"));
		funcionario.setPessoa(pessoa);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		funcionarioDAO.salvar(funcionario);

	}

	@Test
	@Ignore
	public void listar() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		List<Funcionario> resultado = funcionarioDAO.listar();

		for (Funcionario funcionario : resultado) {

			System.out.println("Listar: " + funcionario.getPessoa().getNome());
		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 3L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		System.out.println("Buscar: " + funcionario.getPessoa().getNome());

	}
	
	@Test
	@Ignore
	public void excluir() {
		
		Long codigo = 3L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		funcionarioDAO.excluir(funcionario);
	}
	
	@Test
	public void editar() {
		
		Long codigo = 4L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		funcionario.setCarteiraTrabalho("9999");
		
		funcionarioDAO.editar(funcionario);
		
	}

}

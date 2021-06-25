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
		Pessoa pessoa = pessoaDAO.buscar(1L);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();

		funcionario.setCarteiraTrabalho("123456");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("24/06/2021"));
		funcionario.setPessoa(pessoa);

		funcionarioDAO.salvar(funcionario);
	}

	@Test
	@Ignore
	public void listar() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		List<Funcionario> resultado = funcionarioDAO.listar();

		// Teste de lista de registros.
		for (Funcionario funcionario : resultado) {
			System.out.println("Listar:");
			System.out.println("Nome: " + funcionario.getPessoa().getNome());
			System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
			System.out.println("Ativo: " + funcionario.getDataAdmissao());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Nome: " + funcionario.getPessoa().getNome());
		System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Ativo: " + funcionario.getDataAdmissao());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(5L);

		funcionarioDAO.excluir(funcionario);
	}

	@Test
	@Ignore
	public void editar() throws ParseException {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(3L);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);

		funcionario.setCarteiraTrabalho("123456");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("24/06/2021"));
		funcionario.setPessoa(pessoa);

		funcionarioDAO.editar(funcionario);
	}
}

package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Cidade;
import br.com.borges.drogaria.domain.Pessoa;

public class PessoaDAOTest {

	@SuppressWarnings("removal")
	@Test
	@Ignore
	public void salvar() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Fernando Borges");
		pessoa.setCpf("11111111111");
		pessoa.setRg("111111111");
		pessoa.setRua("Rua 1");
		pessoa.setNumero(new Short("1"));
		pessoa.setBairro("Jardim 1");
		pessoa.setCep("11111111");
		pessoa.setTelefone("1111111111");
		pessoa.setCelular("11111111111");
		pessoa.setEmail("1@email.com");
		pessoa.setCidade(cidade);

		pessoaDAO.salvar(pessoa);
	}

	@Test
	@Ignore
	public void listar() {

		PessoaDAO pessoaDAO = new PessoaDAO();

		List<Pessoa> resultado = pessoaDAO.listar();

		// Teste de lista de registros.
		for (Pessoa pessoa : resultado) {
			System.out.println("Listar:");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("Celular: " + pessoa.getCelular());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("E-mail: " + pessoa.getEmail());
			System.out.println("Rua: " + pessoa.getRua());
			System.out.println("Número: " + pessoa.getNumero());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("CEP: " + pessoa.getCep());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("Cidade: " + pessoa.getCidade().getNome());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Listar:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("E-mail: " + pessoa.getEmail());
		System.out.println("Rua: " + pessoa.getRua());
		System.out.println("Número: " + pessoa.getNumero());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("Cidade: " + pessoa.getCidade().getNome());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(4L);

		pessoaDAO.excluir(pessoa);
	}

	@SuppressWarnings("removal")
	@Test
	@Ignore
	public void editar() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);

		pessoa.setNome("Eli");
		pessoa.setCpf("11111111111");
		pessoa.setRg("111111111");
		pessoa.setRua("Rua 1");
		pessoa.setNumero(new Short("1"));
		pessoa.setBairro("Jardim 1");
		pessoa.setCep("11111111");
		pessoa.setTelefone("1611111111");
		pessoa.setCelular("16111111111");
		pessoa.setEmail("f12borges@gmail.com");
		pessoa.setCidade(cidade);

		pessoaDAO.editar(pessoa);
	}
}

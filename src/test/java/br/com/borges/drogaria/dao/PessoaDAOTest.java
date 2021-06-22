package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Cidade;
import br.com.borges.drogaria.domain.Pessoa;

public class PessoaDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Long codigoCidade = 1L;

		CidadeDAO cidadeDAO = new CidadeDAO();

		Cidade cidade = cidadeDAO.buscar(codigoCidade);

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

		PessoaDAO pessoaDAO = new PessoaDAO();

		pessoaDAO.salvar(pessoa);

	}

	@Test
	@Ignore
	public void listar() {

		PessoaDAO pessoaDAO = new PessoaDAO();

		List<Pessoa> resultado = pessoaDAO.listar();

		for (Pessoa pessoa : resultado) {
			System.out.println("Listar: " + pessoa.getNome() + ".");
		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();

		Pessoa pessoa = pessoaDAO.buscar(codigo);

		System.out.println("Buscar: " + pessoa.getNome() + ".");

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();

		Pessoa pessoa = pessoaDAO.buscar(codigo);

		pessoaDAO.excluir(pessoa);

	}

	@Test
	public void editar() {

		Long codigo = 3L;

		PessoaDAO pessoaDAO = new PessoaDAO();

		Pessoa pessoa = pessoaDAO.buscar(codigo);

		pessoa.setCelular("19");

		pessoaDAO.editar(pessoa);

	}

}

package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Pessoa;
import br.com.borges.drogaria.domain.Usuario;

public class UsuarioDAOTest {

	@Test
	@Ignore
	public void salvar() {

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();

		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('F');

		usuarioDAO.salvar(usuario);
	}

	@Test
	@Ignore
	public void listar() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		List<Usuario> resultado = usuarioDAO.listar();

		// Teste de lista de registros.
		for (Usuario usuario : resultado) {
			System.out.println("Listar:");
			System.out.println("Nome: " + usuario.getPessoa().getNome());
			System.out.println("Tipo: " + usuario.getTipo());
			System.out.println("Ativo: " + usuario.getAtivo());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Nome: " + usuario.getPessoa().getNome());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(6L);

		usuarioDAO.excluir(usuario);
	}

	@Test
	// @Ignore
	public void eidtar() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(3L);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);

		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('B');
		usuarioDAO.editar(usuario);
	}
}

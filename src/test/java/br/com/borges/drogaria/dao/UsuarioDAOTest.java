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

		Usuario usuario = new Usuario();

		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('F');

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		usuarioDAO.salvar(usuario);

	}

	@Test
	@Ignore
	public void listar() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		List<Usuario> resultado = usuarioDAO.listar();

		for (Usuario usuario : resultado) {

			System.out.println("Listar: " + usuario.getPessoa().getNome());

		}

	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 2L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = usuarioDAO.buscar(codigo);

		System.out.println("Listar: " + usuario.getPessoa().getNome());

	}

	@Test
	@Ignore
	public void excluir() {

		Long codigo = 4L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = usuarioDAO.buscar(codigo);
		
		usuarioDAO.excluir(usuario);

	}
	
	@Test
	@Ignore
	public void eidtar() {
		
		Long codigo = 3L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = usuarioDAO.buscar(codigo);
		
		usuario.setTipo('A');
		
		usuarioDAO.editar(usuario);
		
	}

}

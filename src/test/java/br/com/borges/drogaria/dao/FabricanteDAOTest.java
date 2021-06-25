package br.com.borges.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.borges.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() {
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = new Fabricante();
		
		fabricante.setDescricao("Sinovac");
		
		fabricanteDAO.salvar(fabricante);
	}

	@Test
	@Ignore
	public void listar() {

		FabricanteDAO FabricanteDAO = new FabricanteDAO();

		List<Fabricante> resultado = FabricanteDAO.listar();

		// Teste de lista de registros.
		for (Fabricante fabricante : resultado) {
			System.out.println("Listar:");
			System.out.println("Código: " + fabricante.getCodigo());
			System.out.println("Descrição: " + fabricante.getDescricao());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(1L);

		// Teste de busca de registros.
		System.out.println("Buscar:");
		System.out.println("Código: " + fabricante.getCodigo());
		System.out.println("Descrição: " + fabricante.getDescricao());
		System.out.println();
	}

	@Test
	@Ignore
	public void excluir() {

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(4L);

		fabricanteDAO.excluir(fabricante);
	}

	@Test
	@Ignore
	public void editar() {

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(4L);

		fabricante.setDescricao("Pfizer");
		
		fabricanteDAO.editar(fabricante);
	}
}

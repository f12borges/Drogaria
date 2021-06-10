package br.com.borges.drogaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Estado;
import br.com.borges.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("TESTE");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);

	}

	@Test
	public void listar() {
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = FabricanteDAO.listar();

		System.out.println("\nTotal de registros encontados: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println("\n" + fabricante.getDescricao());
		}
	}
}

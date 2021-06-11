package br.com.borges.drogaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
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
	@Ignore
	public void listar() {
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = FabricanteDAO.listar();

		System.out.println("\nTotal de registros encontados: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println("\n" + fabricante.getDescricao());
		}
	}
	
	@Test
	public void buscar(){
		Long codigo = 1L;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if(fabricante == null){
			System.out.println("\nNenhum registro encontrado!");
		}else{
			System.out.println("\nRegistro encontrado:");
			System.out.println("\n" +fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
}

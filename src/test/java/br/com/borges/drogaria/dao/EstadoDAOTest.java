package br.com.borges.drogaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Estado estado = new Estado();
		estado.setNome("São Paulo");
		estado.setSigla("SP");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);

	}

	@Test
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		System.out.println("\nTotal de registros encontados: " + resultado.size());
		
		for(Estado  estado : resultado) {
			System.out.println("\n" + estado.getCodigo() + " " + estado.getNome() + " " + estado.getSigla());
		}
		
	}
}

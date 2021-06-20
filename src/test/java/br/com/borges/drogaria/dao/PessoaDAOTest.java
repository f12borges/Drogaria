package br.com.borges.drogaria.dao;

import org.junit.Ignore;
import org.junit.Test;
import br.com.borges.drogaria.domain.Cidade;
import br.com.borges.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	
	@Test
	//@Ignore
	public void salvar() {
		
		Long codigoCidade = 1L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fernando Borges");
		pessoa.setCpf("11111111111");
		pessoa.setRg("111111111");
		pessoa.setRua("Rua 1");
		pessoa.setNumero(new Short ("1"));
		pessoa.setBairro("Jardim 1");
		pessoa.setCep("11111111");
		pessoa.setTelefone("1111111111");
		pessoa.setCelular("11111111111");
		pessoa.setEmail("1@email.com");
		pessoa.setCidade(cidade);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa); 
		
	}

}

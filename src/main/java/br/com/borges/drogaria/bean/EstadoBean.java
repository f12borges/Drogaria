package br.com.borges.drogaria.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.borges.drogaria.dao.EstadoDAO;
import br.com.borges.drogaria.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {

	private Estado estado;
	
	private List<Estado> estados;
	

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@PostConstruct
	public void listar () {
		
		try {
			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar();
			
		}catch(RuntimeException erro) {
			
			Messages.addGlobalError("Ocorreu um erro ao tentar listar os estados");
			erro.printStackTrace();
			
		}
	}

	public void novo() {
		estado = new Estado();
	}

	public void salvar() {

		try {

			EstadoDAO estadoDao = new EstadoDAO();
			estadoDao.salvar(estado);

			novo();

			Messages.addGlobalInfo("Estado salvo com sucesso!");

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao salvar o estado");
			erro.printStackTrace();

		}
	}
}
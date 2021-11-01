package br.com.borges.drogaria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.borges.drogaria.domain.Estado;

@ManagedBean
@ViewScoped
public class EstadoBean {

	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void novo() {
		estado = new Estado();
	}

	public void salvar() {
		Messages.addGlobalInfo("Nome: " + estado.getNome() + " Sigla: " + estado.getSigla());
	}
}

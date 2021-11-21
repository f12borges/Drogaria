package br.com.borges.drogaria.bean;

import java.io.Serializable;

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
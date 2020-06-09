package br.com.seriando.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "Filme")
public class Filme extends Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String duracao;

	public Filme () {
		super();
	}
	
	public Filme(Long idProduto, String titulo, String descricao, String atores, String tipoDoProduto, String duracao) {
		super(idProduto, titulo, descricao, atores, tipoDoProduto);
		this.duracao = duracao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

}

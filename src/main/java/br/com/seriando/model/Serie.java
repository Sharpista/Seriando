package br.com.seriando.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "Serie")
public class Serie extends Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String temporadas;

	public Serie() {
		super();
	}
	public Serie(Long idProduto, String titulo, String descricao, String atores, String tipoDoProduto,
			String temporadas) {
		super(idProduto, titulo, descricao, atores, tipoDoProduto);
		this.temporadas = temporadas;
	}

	public String getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}

}

package br.com.seriando.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoDoProduto", length = 7, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Produto")
@Data
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long idProduto;
	private String titulo;
	private String descricao;
	private String atores;
	@Column(insertable = false, updatable = false)
	private String tipoDoProduto;
	@ManyToMany(mappedBy = "produtos")
	private List<Usuario> usuarios;
	
	public Produto() {
		
	}
	
	
	public Produto(Long idProduto, String titulo, String descricao, String atores, String tipoDoProduto) {
		super();
		this.idProduto = idProduto;
		this.titulo = titulo;
		this.descricao = descricao;
		this.atores = atores;
		this.tipoDoProduto = tipoDoProduto;
		usuarios = new ArrayList<Usuario>();
	}
	

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getId() {
		return idProduto;
	}

	public void setId(Long id) {
		this.idProduto = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public String getTipoDoProduto() {
		return tipoDoProduto;
	}

	public void setTipoDoProduto(String tipoDoProduto) {
		this.tipoDoProduto = tipoDoProduto;
	}

}

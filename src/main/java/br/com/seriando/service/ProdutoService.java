package br.com.seriando.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.seriando.model.Filme;
import br.com.seriando.model.Produto;
import br.com.seriando.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private  ProdutoRepository produtoRepository;
	
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}
	public Optional<Produto> find(Long id) {
		return produtoRepository.findById(id);
	}
	public List<Produto> findAll(String tipo){
		
		return produtoRepository.findByTipoDoProduto(tipo);
	}
	public void delete(Produto produto) {
		this.produtoRepository.delete(produto);
	}
	
}

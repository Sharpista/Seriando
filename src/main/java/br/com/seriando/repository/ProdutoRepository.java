package br.com.seriando.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.seriando.model.Filme;
import br.com.seriando.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query(value="SELECT * FROM Produto WHERE tipo_do_produto = ?1", nativeQuery = true)
	public List<Produto>findByTipoDoProduto(String tipoDoProduto);
	
	
}

package br.com.seriando.repository;

import br.com.seriando.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query(value = "SELECT u FROM Usuario u Where email = ?1 and senha= ?1", nativeQuery = true)
    public boolean existeUsuario(Usuario usuario);
    
}

package br.com.seriando.service;

import br.com.seriando.model.Usuario;
import br.com.seriando.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario create(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	public Optional<Usuario> find(Long usuarioId) {
		return usuarioRepository.findById(usuarioId);
	}

	public void delete(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	public List<Usuario>getAll(){
		return usuarioRepository.findAll();
	}
	
    
    
    public Usuario verificarUsuario(Usuario usuario) {
		return this.verificarUsuario(usuario);
    	
    }

}

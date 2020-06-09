package br.com.seriando.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.seriando.model.Usuario;
import br.com.seriando.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@GetMapping("/inicio")
	public String inicio() {
		return "inicio";
	}
	@GetMapping("/formLogin")
	public ModelAndView formLogin() {
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/usuario", method = RequestMethod.GET, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public List<Usuario> Get() {
		return usuarioService.getAll();
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Usuario> Put(@PathVariable(value = "id") Long id, @Valid @RequestBody Usuario newUsuario) {

		Optional<Usuario> usuario = usuarioService.find(id);
		if (usuario.isPresent()) {
			Usuario usr = usuario.get();
			usr.setNome(newUsuario.getNome());
			usr.setEmail(newUsuario.getEmail());
			usuarioService.create(usr);
			return new ResponseEntity<Usuario>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}

	}
	
	@RequestMapping(value = "/usuario", method =  RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody ModelAndView Post(@Valid Usuario usuario) {
		
		usuarioService.create(usuario);
		return new ModelAndView("login");
	}
	
	@RequestMapping(name="/cadastrar")
	public ModelAndView cadastrar() {
		return new ModelAndView("cadastrar");
		
	}
	
	
	@PostMapping(value = "/login")
	public ModelAndView Login(Usuario usuario, HttpSession session) {
		
		boolean rs = this.usuarioService.verificarUsuario(usuario) != null;
		if(rs != false) {
			System.out.println(usuario.getId());
			return new ModelAndView("inicio");
		}
		return new ModelAndView("index");
		
	}


	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Usuario> GetById(@PathVariable(value = "id") Long id) {

		Optional<Usuario> usuario = usuarioService.find(id);
		if (usuario.isPresent()) {
			return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Usuario> Delete(@PathVariable(value = "id") Long id) {
		Optional<Usuario> usuario = usuarioService.find(id);
		if (usuario.isPresent()) {
			usuarioService.delete(usuario.get());
			return new ResponseEntity<Usuario>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
	}

}

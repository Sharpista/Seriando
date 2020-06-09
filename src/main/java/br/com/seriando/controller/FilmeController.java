package br.com.seriando.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.seriando.model.Filme;
import br.com.seriando.model.Produto;
import br.com.seriando.service.ProdutoService;

@Controller
public class FilmeController {

	@Autowired
	ProdutoService produtoService;

	@GetMapping("/cadastrarFilme")
	public String showForm() {
		return "cadastrarfilme";
	}
	@PostMapping(value="/salvarFilme")
	public String salvarFilme(@Valid Filme filme, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}

		produtoService.create(filme);
		model.addAttribute("filmes", produtoService.findAll("Filme"));
		return "lista-filmes";
	}

	@GetMapping("/editarFilme/{id}")
	public String atulizarFilme(@PathVariable("id") long id, Model model) {
		Produto produto = produtoService.find(id)
				.orElseThrow(() -> new IllegalArgumentException("Filme Invalido :" + id));
		model.addAttribute("produto", produto);
		return "atualizar-filme";
	}

	@PostMapping("/atualizarFilme/{id}")
	public String atualizarFilme(@PathVariable("id") long id, @Valid Filme filme, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			filme.setId(id);
			return "atualizar-filme";
		}

		produtoService.create(filme);
		model.addAttribute("filmes", produtoService.findAll("Filme"));
		return "lista-filmes";
	}

	@GetMapping("/listarFilme")
	public String Listar(Model model) {
		model.addAttribute("filmes", produtoService.findAll("Filme"));
		return "lista-filmes";
	}
	@GetMapping("/deletarFilme/{id}")
	public String deletarFilme(@PathVariable("id") long id, Model model) {
		Produto produto = produtoService.find(id).orElseThrow(() -> new IllegalArgumentException("Id Invalido :" + id));
		produtoService.delete(produto);
		model.addAttribute("filmes", produtoService.findAll("Filme"));
		return "lista-filmes";
	}

}

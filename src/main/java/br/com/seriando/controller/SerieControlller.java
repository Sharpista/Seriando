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

import br.com.seriando.model.Produto;
import br.com.seriando.model.Serie;
import br.com.seriando.service.ProdutoService;

@Controller
public class SerieControlller {

	@Autowired
	ProdutoService produtoService;

	@GetMapping("/cadastrarSerie")
	public String showForm() {
		return "cadastrarserie";
	}
	
	@PostMapping("/salvarSerie")
	public String salvarSerie(@Valid Serie serie, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "inicio";
		}

		produtoService.create(serie);
		model.addAttribute("series", produtoService.findAll("Serie"));
		return "lista-series";
	}

	@GetMapping("/editarSerie/{id}")
	public String atulizarSerie(@PathVariable("id") long id, Model model) {
		Produto produto = produtoService.find(id)
				.orElseThrow(() -> new IllegalArgumentException("Serie Invalida :" + id));
		model.addAttribute("produto", produto);
		return "atualizar-serie";
	}

	@PostMapping("/atualizarSerie/{id}")
	public String atualizarSerie(@PathVariable("id") long id, @Valid Serie serie, BindingResult result, Model model) {
		if (result.hasErrors()) {
			serie.setId(id);
			return "atualizar-serie";
		}

		produtoService.create(serie);
		model.addAttribute("series", produtoService.findAll("Serie"));
		return "lista-series";
	}

	@GetMapping("/listarSerie")
	public String Listar(Model model) {
		model.addAttribute("series", produtoService.findAll("Serie"));
		return "lista-series";
	}

	@GetMapping("/deletarSerie/{id}")
	public String deletarSerie(@PathVariable("id") long id, Model model) {
		Produto produto = produtoService.find(id).orElseThrow(() -> new IllegalArgumentException("Id Invalido :" + id));
		produtoService.delete(produto);
		model.addAttribute("series", produtoService.findAll("Serie"));
		return "lista-series";
	}

}

package br.com.security.estudo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.security.estudo.model.Contato;

@Controller
@RequestMapping("/")
public class ContatosController {  
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/contatos")
	public String contatos(Model model) { 
		model.addAttribute("lista", Arrays.asList(new Contato("Fernando","011-1111-1111"), new Contato("Claudia", "011-2222-2222"), new Contato("Maria", "011-3333-3333")));
		return "contatos";
	}
	
	@GetMapping("/pesquisa")
	public String pesquisa() {
		return "pesquisa";
	}
}

package org.generation.blogPessoal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog-pessoal")
public class BlogPessoalController {
	
	@GetMapping
	public String rodandoNa8080() {
		return "Rodando na porta 8080!";
	}
}

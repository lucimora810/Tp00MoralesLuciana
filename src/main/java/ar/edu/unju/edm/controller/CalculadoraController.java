package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculadoraController {
	
	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		return "index";
	}

}

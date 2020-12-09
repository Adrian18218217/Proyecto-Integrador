package com.integrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}

	@GetMapping("/crear_cuenta")
	public String crearCuenta() {
		return "crear_cuenta";
	}

	@GetMapping("/empresa")
	public String empresa() {
		return "empresa";
	}

	@GetMapping("/productos")
	public String productos() {
		return "productos";
	}

	@GetMapping("/servicios")
	public String servicios() {
		return "servicios";
	}

}

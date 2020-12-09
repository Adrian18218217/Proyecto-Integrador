package com.integrador.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrador.model.Cliente;
import com.integrador.service.ClienteService;
import com.integrador.service.ClienteServiceImpl;

@Controller
public class ClienteController {

	@Autowired
	ClienteService _clienteService;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "login";
	}
	
	@PostMapping("/login")
	public String validar(@ModelAttribute Cliente cliente) {
		
	    
	    
		if (cliente!=null && cliente.getUsuario()!=null &&cliente.getPassword()!=null) {
				Cliente cliente2=_clienteService.findByUsuario(cliente.getUsuario());
				if (cliente2!=null&& cliente2.getPassword().equals(cliente.getPassword())) {
					//AQUI QUIERO ENVIAR EL USUARIO A LA PAGINA BIENVENIDO
					return "bienvenido";
				}else {
					return "index";
				}
		}else {
			return "index";
		}
	}
	

	
}

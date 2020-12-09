package com.integrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.integrador.model.*;
import com.integrador.repository.ClienteRepository;

public interface ClienteService {

	
	public Cliente findByUsuario(String usuario);


}

package com.integrador.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.model.Cliente;
import com.integrador.repository.ClienteRepository;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public Cliente findByUsuario(String usuario) {
		return repository.findByUsuario(usuario);
	}
	
	
}

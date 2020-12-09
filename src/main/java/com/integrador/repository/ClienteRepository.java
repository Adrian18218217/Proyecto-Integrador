package com.integrador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.integrador.model.*;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	public Cliente findByUsuario(String usuario); 
	
}

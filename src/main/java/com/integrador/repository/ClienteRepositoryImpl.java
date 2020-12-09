package com.integrador.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.integrador.model.Cliente;

@Repository
@Transactional
public class ClienteRepositoryImpl  {

	/*public Cliente findByUsuario(String usuario) {
		
		return (Cliente) getSession().createQuery(
				"from Cliente where usuario = :usuario")
				.setParameter("usuario", usuario).uniqueResult();
	}*/

}

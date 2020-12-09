package com.integrador.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name="usuario")
	private String usuario;
	@Column(name="tipo_documento")
	private String tipo_documento;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="password")
	private String password;
	@Transient
	private String password_confirm;
	@Column(name="prioridad")
	private int prioridad;
	@Column(name="imagen")
	private String imagen;
	@Column(name="genero")
	private String genero;
	
	public Cliente() {
		
	}

	public Cliente(String usuario, String tipo_documento, String nombres, String apellidos, String telefono,
			String correo, String password, String password_confirm, int prioridad, String imagen, String genero) {
		this.usuario = usuario;
		this.tipo_documento = tipo_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.password_confirm = password_confirm;
		this.prioridad = prioridad;
		this.imagen = imagen;
		this.genero = genero;
	}
	
	public Cliente(String usuario, String password) {
		this.usuario=usuario;
		this.password=password;
	}
	
	
	
}

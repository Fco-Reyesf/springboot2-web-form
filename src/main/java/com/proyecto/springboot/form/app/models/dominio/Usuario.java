package com.proyecto.springboot.form.app.models.dominio;

import javax.validation.constraints.NotEmpty;

public class Usuario {
	
	private String id;
	
	@NotEmpty
	private String nombreDefecto;
	
	@NotEmpty
	private String apellidoDefecto;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String pass;
	
	@NotEmpty
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreDefecto() {
		return nombreDefecto;
	}

	public void setNombreDefecto(String nombreDefecto) {
		this.nombreDefecto = nombreDefecto;
	}

	public String getApellidoDefecto() {
		return apellidoDefecto;
	}

	public void setApellidoDefecto(String apellidoDefecto) {
		this.apellidoDefecto = apellidoDefecto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

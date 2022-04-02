package com.proyecto.springboot.form.app.models.dominio;

import javax.validation.constraints.NotEmpty;

public class Usuario {
	
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

}

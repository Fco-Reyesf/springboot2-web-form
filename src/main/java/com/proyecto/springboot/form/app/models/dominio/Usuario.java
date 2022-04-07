package com.proyecto.springboot.form.app.models.dominio;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	//@Pattern(regexp="[0-9]{1}")
	private String id;
	
	//@NotEmpty
	private String nombreDefecto;
	
	@NotEmpty
	private String apellidoDefecto;
	
	@NotBlank
	@Size(min=3 , max=8)	
	private String username;
	
	@NotEmpty
	private String pass;
	
	@NotEmpty
	@Email
	private String email;

	@NotNull
	@Min(5)
	@Max(10)
	private Integer cuenta; 
	
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

	public Integer getCuenta() {
		return cuenta;
	}

	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	
	

}

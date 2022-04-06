package com.proyecto.springboot.form.app.validadores;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.proyecto.springboot.form.app.models.dominio.Usuario;

@Component
public class usuarioValidador implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Usuario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Usuario usuario = (Usuario)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombreDefecto", "NotEmpty.usuario.nombreDefecto");
		
		if(!usuario.getId().matches("[0-9]{1}"))
			errors.rejectValue("id", "pattern.usuario.id");
	}

}

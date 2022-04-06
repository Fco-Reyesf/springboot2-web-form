package com.proyecto.springboot.form.app.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.springboot.form.app.models.dominio.Usuario;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("titulo", "Formulario...");
		modelo.addAttribute("usuario", usuario);
		return "form";
	}
	
	/*
	 * @requestparam para capturar los datos de la vista.
	 * si la vista tiene los mismos nombres de atributos de la clase (en este caso form contiene los mismos nombres de atributo que la clase usuario)
	 * se puede inyectar los datos por parametros como se muestra en enviarForm
	 */
	
	@PostMapping("/form")
	public String enviarForm(@Validated Usuario usuario, BindingResult resultado, Model modelo) {
		
		if (resultado.hasErrors()) {
			
			return "form";
		}
		
		/*
		// metodo para recepcion de errores (opcional)
		if (resultado.hasErrors()) {
			Map<String, String> errores = new HashMap<>();
			resultado.getFieldErrors().forEach(error ->{
				errores.put(error.getField(), "El campo ".concat(error.getField()).concat(" esta vacio"));
			});;
			modelo.addAttribute("errores", errores);
 			return "form";
		}
		
	*/
		
		// para mandar los datos a la vista resultado.
		modelo.addAttribute("titulo", "Resultado de los datos form");
		modelo.addAttribute("usuario", usuario);
		return "resultado";
	}
}

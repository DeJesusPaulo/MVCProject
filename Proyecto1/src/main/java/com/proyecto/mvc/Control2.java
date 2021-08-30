package com.proyecto.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/usuario")
public class Control2 {
	
	@InitBinder
	public void metodoBinder(WebDataBinder binder) {
		
		StringTrimmerEditor recorte = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, recorte);
	}

	@RequestMapping("/formulario")
	public String mustraFormulario(Model Modelo) {
		
		Usuario usuario = new Usuario();
		
		Modelo.addAttribute("usuario1", usuario);
			
		return "formularioUsuario";
	}
	
	@RequestMapping("/respuesta")      
	public String registroUsuario(@Valid @ModelAttribute("usuario1") Usuario usuario,
			BindingResult validacion) { 
		
		if (validacion.hasErrors()) {         //Para la validacion se utiliza un IF, si el objeto validacion
			return "formularioUsuario";      // junto al metodo HASERRORS es verdadera(TIENE errores), devuelve 	                               
		} else {                            // el formulario de registro; si es falsa(NO tiene errores), 
			return "registroConfirmado";   //devuelve la confirmacion del registro 
		}
		
	}
}

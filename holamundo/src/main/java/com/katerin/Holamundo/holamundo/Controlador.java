package com.katerin.Holamundo.holamundo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.katerin.Holamundo.Model.Persona;


@Controller
public class Controlador {
	@GetMapping("/")
	
	public String Inicio(Model modelo) {
		Persona person = new Persona();
		person.setNombre("Katerin");
		person.setApellido("Alarcon");
		person.setTelefono("78906547");
		person.setEmail("katyalarcon7006@gmail.com");
		
		Persona person2 = new Persona();
		person2.setNombre("Katy");
		person2.setApellido("Alarcon");
		person2.setTelefono("7890654799");
		person2.setEmail("katyalarcon90@gmail.com");
		
		List personitas = Arrays.asList(person,person2);
		
		
		
		
		
		String mensaje = "HOLA DESDE EL CONTROLADOR";
		modelo.addAttribute("saludo", mensaje);
		//modelo.addAttribute("persona",person);
		modelo.addAttribute("persona",personitas);
		
		return "index";
			
	}
	

}

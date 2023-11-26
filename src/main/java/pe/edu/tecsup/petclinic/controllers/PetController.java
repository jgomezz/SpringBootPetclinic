package pe.edu.tecsup.petclinic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@GetMapping("/")
	String index() {
		
		return "Hola Mundo";
	}
	
}

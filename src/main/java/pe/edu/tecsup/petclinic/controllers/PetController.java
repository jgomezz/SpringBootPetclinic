package pe.edu.tecsup.petclinic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {

	@GetMapping("/")
	String index() {
		
		return "Hola Mundo";
	}
	
	
	@GetMapping("/welcome") 
	String welcome() {
		return "Welcome to Tecsup";
	}
	
}

/*

Crear la clase controlador VisitController
y crear 2 metodo que respondan a la siguienets
peticiones

http://localhost:8080/visit   ---> Pagina principal de visitantes
http://localhost:8080/visit/date   ---> Solicitud de cita

*/





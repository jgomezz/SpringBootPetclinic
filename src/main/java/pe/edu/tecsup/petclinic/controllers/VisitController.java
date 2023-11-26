package pe.edu.tecsup.petclinic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visit")
public class VisitController {

	

	@GetMapping()
	String index() {
		
		return "Pagina principal de visitantes";
	}
	
	
	@GetMapping("/date") 
	String date() {
		return "Solicitud de cita";
	}
	
}

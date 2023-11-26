package pe.edu.tecsup.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OwnerController {

	
	@GetMapping("/message")
	String message(Model model) {
		
		return "nuevo"; // resoures/templates/nuevo.html
	}
	
}

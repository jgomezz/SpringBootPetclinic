package pe.edu.tecsup.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//  M V C 

@Controller
public class OwnerController {

	
	@GetMapping("/message")
	String message(Model model) {
		
		model.addAttribute("msg", "Message from Tecsup");
		
		model.addAttribute("name", "Jaime");
		
		
		return "message"; // resources/templates/message.html
	}
	
}

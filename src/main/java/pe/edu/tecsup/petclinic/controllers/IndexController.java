package pe.edu.tecsup.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping()
	String index(Model model) {
		model.addAttribute("title", "PetClinic");
		return "index";
	}
	
}

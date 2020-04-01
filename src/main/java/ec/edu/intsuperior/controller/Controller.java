package ec.edu.intsuperior.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.edu.intsuperior.model.Persona;
import ec.edu.intsuperior.repo.IPersonaRepo;

@org.springframework.stereotype.Controller
public class Controller {
	/*vamos a hacer una inyeccion con esto creamos una instancia de esta interfas*/
	@Autowired
	private IPersonaRepo repos;
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		/*creamos una persona*/
		Persona personas = new Persona();
		personas.setIdPersona(2);
		personas.setNombre("Milton Felipe");
		/*con esto vamos a poder guardar*/
		repos.save(personas);
		model.addAttribute("name", name);
		return "index";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		/*creamos una persona*/
		/*con esto vamos a poder guardar*/
		model.addAttribute("personas", repos.findAll());
		return "index";
	}
}

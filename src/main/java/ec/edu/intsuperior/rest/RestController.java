package ec.edu.intsuperior.rest;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.intsuperior.model.Persona;
import ec.edu.intsuperior.repo.IPersonaRepo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/personas")
public class RestController {
	/*inyeccion de dependencia de repositorio*/
	@Autowired
	private IPersonaRepo repo;
	/*nos sirve para listar*/
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona per){
		repo.save(per);
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}
}

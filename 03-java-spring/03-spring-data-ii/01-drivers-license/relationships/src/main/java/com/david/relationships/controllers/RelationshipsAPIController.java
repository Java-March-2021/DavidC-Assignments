package com.david.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.david.relationships.models.Person;
import com.david.relationships.services.PersonService;

@RestController
@RequestMapping("/api")
public class RelationshipsAPIController {

	private PersonService personService;
	public RelationshipsAPIController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/")
	public List<Person> index(){
		return this.personService.allPeople();
	}
	
	@RequestMapping("/showPerson/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return this.personService.getOnePerson(id);
	}
	
	@GetMapping("/license/new")
	public String addLicense(Model model) {
		return "newLicense.jsp";
	
	
//	@RequestMapping(value="/person/new", method=RequestMethod.POST)
//	public Person createPerson(Person newPerson) {
//		return this.personService.createNewPerson(newPerson);
//	}
	
	
//	@GetMapping("/")
//	public String index(Model model) {
//		List<Person> people = personService.allPeople();
//		model.addAttribute("people", people);
//		return "index.jsp";
//	}
//	@GetMapping("/person/new")
//	public String 
//	
	
//	@PostMapping("/person/new")
//	public String addPerson(@RequestParam("firstName" String firstName, @RequestParam "lastName" String lastName))
//}
}
}

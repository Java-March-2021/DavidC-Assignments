package com.david.relationships.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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


import com.david.relationships.models.License;
import com.david.relationships.models.Person;
import com.david.relationships.services.LicenseService;
import com.david.relationships.services.PersonService;

@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
	private LicenseService licenseService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Person> persons = this.personService.allPeople();
		viewModel.addAttribute("allPersons", persons);
		return "index.jsp";
	}
	
	@GetMapping("/person/{id}")
	public String showPerson(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("person", this.personService.getOnePerson(id));
		return "showPerson.jsp";
	}
	@GetMapping("/person/new")
	public String newPerson() {
		return "newPerson.jsp";
	}
	@PostMapping("/person/new")
		public String addPerson(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Date createdAt, Date updatedAt) {
//			ArrayList<String> errors = new ArrayList<String>();
//			if(firstName.equals("")) {
//				errors.add("Please input a First Name for this Person.");
//			}
//			if(errors.size() > 0) {
//				for (String e: errors) {
//					redirectAttr.addFlashAttribute("errors", e);
//				}
//				return "redirect:/person/new";
//				}
			this.personService.createNewPerson(firstName, lastName, createdAt, updatedAt);
			return "redirect:/";
	}
//	@GetMapping("/license/new")
//	public String newLicense() {
//		return "newLicense.jsp";
//	}
//	@RequestMapping("/license/new")
//	public String newLicense(@ModelAttribute("license") License license, Model model) {
//		List<Person> unlicensed = licenseService.getUnlicensedPeople();
//		model.addAttribute("persons", unlicensed);
//		return "newLicense.jsp";
//	}
	
	@GetMapping("/license/new")
	public String showLicense(@PathVariable("license") License license, Model viewModel){
		List<Person> unlicensed = licenseService.getUnlicensedPeople();
		viewModel.addAttribute("persons", unlicensed);
		return "newLicense.jsp";
	}
	
	@RequestMapping(value = "/license/new", method=RequestMethod.POST)
	public String addLicense(@Valid @ModelAttribute("license") License newLicense, BindingResult result) {
		if(result.hasErrors())
			return "/license/new.jsp";
		licenseService.createLicense(newLicense);
		return "redirect:/";
}
//	@RequestMapping(value = "/license/new", method=RequestMethod.POST)
//	public String addLicense(@RequestParam("number") Integer number, @RequestParam("expirationDate") Date expirationDate, @RequestParam("state") String state) {
//		this.licenseService.createNewLicense(number, expirationDate, state);
//		return "redirect:/";
}

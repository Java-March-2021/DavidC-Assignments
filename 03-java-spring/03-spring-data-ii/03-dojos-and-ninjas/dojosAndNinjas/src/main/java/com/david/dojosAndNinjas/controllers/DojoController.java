package com.david.dojosAndNinjas.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.david.dojosAndNinjas.models.Dojo;
import com.david.dojosAndNinjas.models.Ninja;
import com.david.dojosAndNinjas.services.DojoService;
import com.david.dojosAndNinjas.services.NinjaService;



@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Dojo> dojos = this.dojoService.allDojos();
		viewModel.addAttribute("allDojos", dojos);
		return "index.jsp";
		
	}
	
	@GetMapping("/dojo/{id}")
	public String showDojo(@PathVariable("id") Long id, Model viewModel){
		viewModel.addAttribute("dojo", this.dojoService.getOneDojo(id));
		return "showDojo.jsp";
	}
	@GetMapping("dojo/new")
	public String newDojo() {
		return "newDojo.jsp";
	}
	@PostMapping("dojo/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model viewModel)  {
		if(result.hasErrors()) {
			viewModel.addAttribute("allDojos", this.dojoService.allDojos());
		}
		this.dojoService.create(dojo);
		return "redirect:/";
	}
	
	@GetMapping("ninja/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model viewModel) {
		viewModel.addAttribute("allDojos", this.dojoService.allDojos());
		return "newNinja.jsp";
	}
	@PostMapping("ninja/new")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allDojos", this.dojoService.allDojos()); 
		}
		this.ninjaService.create(ninja);
		return "redirect:/";
	}

}

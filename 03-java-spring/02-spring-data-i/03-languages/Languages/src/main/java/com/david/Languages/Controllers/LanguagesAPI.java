package com.david.Languages.Controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.david.Languages.models.Lang;
import com.david.Languages.services.LanguagesService;

@RestController
@RequestMapping("/api")
public class LanguagesAPI {
private final LanguagesService languagesService;
	
	public LanguagesAPI(LanguagesService service) {
		this.languagesService = service;
	}
	

@RequestMapping("/langs")
public List<Lang> index() {
	return languagesService.allLanguages();
	}
@RequestMapping("/langs/{id}")
public Lang showLang(@PathVariable Long id) {
	Lang lang = languagesService.findLang(id);
	return lang;
	}
@RequestMapping(value="/langs/add", method=RequestMethod.POST)
public Lang createLang(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="version") int version) {
    Lang lang = new Lang(name, creator, version);
    return languagesService.createLang(lang);

}
}

package com.david.Languages.Controllers;

import java.util.ArrayList;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.david.Languages.models.Lang;
import com.david.Languages.services.LanguagesService;

@Controller
public class HomeController {
	private LanguagesService languagesService;
	public HomeController(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}

	@GetMapping("/langs")
	public String index(Model model) {
		List<Lang> langs = languagesService.allLanguages();
		model.addAttribute("langs", langs);
		return"index.jsp";
	}
	
	@GetMapping("/langs/add")
	public String add(Model model) {
		return "add.jsp";
	}
	@PostMapping("/langs/add")
	public String newBook(@RequestParam("name") String name, @RequestParam("creator") String creator,  @RequestParam("version") int version, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("Oops!, You forgot a Name!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/langs/add";
		}
		if(creator.equals("")) {
			errors.add("Oops!, You forgot the Creator!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/langs/add";
		}

		this.languagesService.createNewLanguage(name, creator, version);
		return "redirect:/books";
	}
	
	@GetMapping("langs/[id]")
	public String showLang(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("name", this.languagesService.getOneName(id));
		return "langs.jsp";
	}
	
	@RequestMapping("langs/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Lang lang = languagesService.getOneName(id);
		if(lang != null) {
			model.addAttribute("lang", lang);
			return "edit.jsp";
		}else {
			return "redirect:/langs";
		}
	}
	
	@PostMapping("/langs/edit/{id}")
	public String updateLang(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") int version, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("Oops!, You forgot a Name!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/lang/add";
		}
		if(creator.equals("")) {
			errors.add("Oops!, You forgot the creator!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
		}
		return "redirect:/books/add";
	}
	
//		this.bookService.set(title, description, language, numberOfPages);
//		return "redirect:/books";
//	}
	@RequestMapping(value="/langs/delete/{id}")
		public String destroyLang(@PathVariable("id") Long id, Lang lang) {
			languagesService.deleteById(id, lang);
			return "redirect:/langs";

}
}

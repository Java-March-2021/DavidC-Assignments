package com.david.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
	@RequestMapping(value="/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name) {
		model.addAttribute("name", name);
		return "index.jsp";
	}
//		if(userName != null) {
//			System.out.println("Hello Human!");
//		}
//		else {System.out.println("Hello" + userName);
//		}
//		return "index.jsp";
//	}
	
//	@RequestMapping(value="/")
//	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
//		model.addAttribute("search", searchQuery);
//		return "index.jsp";
//	}
//	@RequestMapping("/users/{name]")
//	public String showName(@PathVariable("name")String userName) {
//		System.out.println(userName);
//		return "index.jsp";
//	}
	
}

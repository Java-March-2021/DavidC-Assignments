package com.david.secondproject.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}

	
	@RequestMapping("/random")
	public String edgar() {
		return "Spring Boot is great!  So easy to just respond with strings!";
	}
}

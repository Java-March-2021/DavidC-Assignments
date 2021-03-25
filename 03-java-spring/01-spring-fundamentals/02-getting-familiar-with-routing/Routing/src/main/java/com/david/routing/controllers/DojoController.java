package com.david.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/dojo{dojoAwesome}")
	public String dojoAwesome(@PathVariable("dojoAwesome") String dojoAwesome) {
		String dojo = "The Dojo is awesome!";
		System.out.println(dojoAwesome);
		return dojo;
	}
	
	@RequestMapping("/dojo/burbank{dojoBurbank}")
	public String dojoBurbank(@PathVariable("dojoBurbank") String dojoBurbank) {
		String burbank = "Burbank Dojo is located in Southern California.";
		System.out.println(dojoBurbank);
		return burbank;
	}
	@RequestMapping("/dojo/sj{dojoSj}")
	public String dojoSj(@PathVariable("dojoSj") String dojoSj) {
		String sj = "SJ dojo is the headquarters.";
		System.out.println(dojoSj);
		return sj;
	}
}

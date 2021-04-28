package com.david.dojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	
	@GetMapping("/")
	public String getInfo(HttpSession session){
		return "index.jsp";
	}
	
	@GetMapping("/result")
	public String result(HttpSession session, Model model){
		return "result.jsp";
	}
	@RequestMapping(path="name", method=RequestMethod.POST)
	public String name(@RequestParam(value="name") String name) {
		return "result.jsp";
	}
	@RequestMapping(path="location", method=RequestMethod.POST)
		public String location(@RequestParam(value="seattle") String seattle, @RequestParam(value="sanjose") String SanJose, @RequestParam(value="burbank") String Burbank, @RequestParam(value="chicago") String Chicago) {
		return "result.jsp";
	}
	@RequestMapping(path="language", method=RequestMethod.POST)
	public String language(@RequestParam(value="java") String java, @RequestParam(value="python") String python, @RequestParam(value="english") String english, @RequestParam(value="language") String language) {
		return "result.jsp";
	}
	@RequestMapping(path="comment", method=RequestMethod.POST)
	public String comment(@RequestParam(value="comment") String comment){
			return "result.jsp";
	}
}

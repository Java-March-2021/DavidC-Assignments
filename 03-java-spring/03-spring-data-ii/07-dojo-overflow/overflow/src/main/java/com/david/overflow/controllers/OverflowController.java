package com.david.overflow.controllers;

import java.util.List;


import javax.validation.Valid;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.david.overflow.models.Questions;
import com.david.overflow.models.Tagg;
import com.david.overflow.models.Answers;
import com.david.overflow.services.AnswersService;
import com.david.overflow.services.QuestionsService;
import com.david.overflow.services.TaggService;


@Controller
public class OverflowController {
	@Autowired
	private QuestionsService qService;
	@Autowired
	private AnswersService aService;
	@Autowired
	private TaggService tService;
	
	
	
	@GetMapping("/questions")
	public String dashboard(Model viewModel) {
		List<Questions> questions = this.qService.allQuestions();
		viewModel.addAttribute("allQuestions", questions);
		return "questions.jsp";
	}
	
	@GetMapping("/question/new")
	public String askQuestion(Model viewModel) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/question/new")
	public String newQuestion(@Valid @ModelAttribute("question") Questions question, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}else {
			this.qService.createQuestion(question);
			return "redirect:/questions";
		}
	}
	
	@GetMapping("/question/{id}")
	public String showQuestion(@PathVariable("id") Long id, @ModelAttribute("answer")Answers answer, Model model) {
		model.addAttribute("question", this.qService.find(id));
		model.addAttribute("tagg", this.tService.find(id));
		return "showQuestion.jsp";
	}
	
	@PostMapping("/answers")
//	public String answerQuestion(@RequestParam("answer") String answer, Model model) {
	public String answerQuestion(@Valid @ModelAttribute("answer") Answers answer, BindingResult result, Model viewModel, Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("answer", this.aService.find(id));
		}
		Answers newAnswer = this.aService.addAnswer(answer);
		return "redirect:/questions" + newAnswer.getQuestion().getId();
	}
			
}








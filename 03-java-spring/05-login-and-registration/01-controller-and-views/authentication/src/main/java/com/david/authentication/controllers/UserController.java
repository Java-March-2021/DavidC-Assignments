package com.david.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.david.authentication.models.User;
import com.david.authentication.services.UserService;
import com.david.authentication.validators.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		Long user_id = (Long)session.getAttribute("user_id");
		User user = uService.findUserById(user_id);
		model.addAttribute("user", user);
		return "dashboard.jsp";
	}
	
	public UserService getuService() {
		return uService;
	}

	public void setuService(UserService uService) {
		this.uService = uService;
	}

	public UserValidator getValidator() {
		return validator;
	}

	public void setValidator(UserValidator validator) {
		this.validator = validator;
	}

	@GetMapping("/")
		public String index(@ModelAttribute("user")User user) {
		return "login.jsp";
	}
	
	@PostMapping("register")
		public String registerUser(@Valid @ModelAttribute("user")User user, BindingResult result, HttpSession session) {
			validator.validate(user, result);
			if(result.hasErrors()) {
				return "login.jsp";
			}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/dashboard";
	}
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword")String password, RedirectAttributes redirectAttr, HttpSession session) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
			User user = this.uService.findByEmail(email);
			session.setAttribute("user_id", user.getId());
			return "redirect:/dashboard";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
		
//	@PostMapping("/login")
//	public String login(HttpSession session, @RequestParam("userToBeLoggedIn") Long id) {
//		if(session.getAttribute("user_id") == null)  {
//			session.setAttribute("user_id", id);
//		}
//		return "redirect:/dashboard";
//}
}

package com.david.authentication.validators;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.david.authentication.models.User;
import com.david.authentication.repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
}
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		if(!user.getPassword().equals(user.getConfirmPassword())){
			errors.rejectValue("password", "Match", "Passwords do not match!!!");
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Sorry, this email is already taken");
		}
//		if(user.getFirstName().equals("Matt")) {
//			errors.rejectValue("firstName", "noMattsAllowed", "sorry, we're not accepting Matts at this time.");
//		}
		
	}
	public UserRepository getuRepo() {
		return uRepo;
	}
	public void setuRepo(UserRepository uRepo) {
		this.uRepo = uRepo;
	}
	
}

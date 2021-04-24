package com.david.authentication.services;


import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.david.authentication.models.User;
import com.david.authentication.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
//	create List<User> in model as part of Many to Many table!!!
//	public List<User> allUsers() {
//		return this.userRepository.findAll();
//	}
	

	
	//register User and hash their password
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return userRepository.save(user);
	}
	//find user by email
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	//find user by id
	public User findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
	//authenticate user
	
public boolean authenticateUser(String email, String password) {
	//first find user by email
	User user = userRepository.findByEmail(email);
	//if we can't find it by email, return false
	if(user == null) {
		return false;
	} else {
	//if the passwords match, return true, else, return false
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}



public UserRepository getUserRepository() {
	return userRepository;
}



public void setUserRepository(UserRepository userRepository) {
	this.userRepository = userRepository;
}	
	
//	public UserRepository getUserRepository() {
//		return userRepository;
//	}
	
	
}

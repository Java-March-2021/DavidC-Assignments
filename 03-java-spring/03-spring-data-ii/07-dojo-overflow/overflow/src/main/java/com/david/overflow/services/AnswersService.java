package com.david.overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.overflow.models.Answers;
import com.david.overflow.repositories.AnswersRepository;

@Service
public class AnswersService {
	@Autowired
	private AnswersRepository aRepo;
	
	public Answers find(Long id) {
		Answers answer = this.aRepo.findById(id).orElse(null);
		return answer;
	}
	
	public List<Answers> allAnswers() {
		return this.aRepo.findAll();
	}
		
	public Answers addAnswer(Answers answer) {
		return this.aRepo.save(answer);
	}
	

	

		
		
	}

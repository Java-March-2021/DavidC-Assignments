package com.david.overflow.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.overflow.models.Answers;
import com.david.overflow.models.Questions;
import com.david.overflow.models.Tagg;
import com.david.overflow.repositories.QuestionsRepository;
import com.david.overflow.repositories.TaggRepository;

@Service
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository qRepo;

	@Autowired 
	TaggService tService;
	
	public Questions getQuestion(Long id) {
		Questions question = this.qRepo.findById(id).orElse(null);
		return question;
	}
	
	public List<Questions> allQuestions() {
		return this.qRepo.findAll();
	}
	
	public Questions createQuestion(Questions question) {
		return this.qRepo.save(question);
	}
	//Add a Tag
//	public void addTagg(Tagg tagg, Questions question) {
//		List<Tagg> taggs = question.getTaggs();
//		taggs.add(question);
//		this.qRepo.save(question);
//	}
	
	public void deleteById(Long id, Questions question) {
		qRepo.deleteById(id);
	}
	
	public Questions updateQuestion(Long id, Questions updatedQuestion) {
		return this.qRepo.save(updatedQuestion);
	}
}

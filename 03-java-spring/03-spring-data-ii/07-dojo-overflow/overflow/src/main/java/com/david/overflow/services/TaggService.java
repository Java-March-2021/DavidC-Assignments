package com.david.overflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.david.overflow.models.Tagg;
import com.david.overflow.repositories.QuestionsRepository;
import com.david.overflow.repositories.TaggRepository;
import com.david.overflow.models.Questions;

@Service
public class TaggService {
	@Autowired
	private QuestionsService qService;
	@Autowired 
	private AnswersService aService;
	@Autowired
	private TaggRepository tRepo;
	@Autowired
	private QuestionsRepository qRepo;
	
	public Tagg find(Long id) {
		Tagg tagg = this.tRepo.findById(id).orElse(null);
		return tagg;
	}
	
	public Tagg createTagg(Tagg newTagg){
		return this.tRepo.save(newTagg);
	}
	
	//Add A Tagg
	public void addTagg(Questions question, Tagg tagg) {
		List<Tagg> taggs = question.getTaggs();
		taggs.add(tagg);
		this.qRepo.save(question);
	}
}

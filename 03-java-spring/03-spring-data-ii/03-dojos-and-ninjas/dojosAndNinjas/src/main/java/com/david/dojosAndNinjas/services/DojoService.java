package com.david.dojosAndNinjas.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.david.dojosAndNinjas.models.Dojo;
import com.david.dojosAndNinjas.models.Ninja;
import com.david.dojosAndNinjas.repositories.DojoRepo;
import com.david.dojosAndNinjas.repositories.NinjaRepo;

@Service
public class DojoService {
	
	private final DojoRepo dojoRepo;
	private final NinjaRepo ninjaRepo;
	
	public DojoService(DojoRepo dojoRepo, NinjaRepo ninjaRepo, DojoRepo dojoRepo2) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	public List<Dojo> allDojos(){
		return this.dojoRepo.findAll();
		
	}
	public Dojo create(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
		public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	public Dojo createDojo(Dojo newDojo, String name, Date createdAt, Date updatedAt) { 
		return this.dojoRepo.save(newDojo);
	}
	public Dojo createNewDojo(String name, Date createdAt, Date updatedAt) {
		Dojo newDojo = new Dojo();
		return this.dojoRepo.save(newDojo);
	}
}

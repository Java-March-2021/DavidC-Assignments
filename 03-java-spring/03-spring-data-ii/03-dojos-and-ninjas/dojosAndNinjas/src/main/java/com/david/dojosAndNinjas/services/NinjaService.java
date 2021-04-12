package com.david.dojosAndNinjas.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.dojosAndNinjas.models.Ninja;
import com.david.dojosAndNinjas.repositories.DojoRepo;
import com.david.dojosAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {

		@Autowired
		private final DojoRepo dojoRepo;
		
		private final NinjaRepo ninjaRepo;
		
		public Ninja create(Ninja ninja) {
			return this.ninjaRepo.save(ninja);
		}
		public NinjaService(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
			this.dojoRepo = dojoRepo;
			this.ninjaRepo = ninjaRepo;
		}
		public Ninja createNewNinja(String firstName, String lastName, int age, Date createdAt, Date updatedAt) { 
			Ninja newNinja = new Ninja(firstName, lastName, age, createdAt, updatedAt);
			return this.ninjaRepo.save(newNinja);
		}
		public Ninja getOneNinja(Long id) {
			return this.ninjaRepo.findById(id).orElse(null);
		}
}

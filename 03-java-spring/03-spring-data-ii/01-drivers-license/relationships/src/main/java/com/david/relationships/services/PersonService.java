package com.david.relationships.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


import com.david.relationships.models.Person;
import com.david.relationships.repositories.LicenseRepository;
import com.david.relationships.repositories.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository personRepository;
	private final LicenseRepository licenseRepository;
	
	public PersonService(PersonRepository personRepository, LicenseRepository licenseRepository) {
		this.personRepository = personRepository;
		this.licenseRepository = licenseRepository;
	}

	
//	public PersonService() {
//		this.personRepository = null;
//		this.licenseRepository = null;
//	}


	public Person getOnePerson(Long id) {
		return this.personRepository.findById(id).orElse(null);
	}
	
//	private PersonRepository getPersonRepository() {
//		return personRepository;
//	}
//
//	private LicenseRepository getLicenseRepository() {
//		return licenseRepository;
//	}

	public Person createPerson(Person newPerson, Date createdAt, Date updatedAt) {
		return this.personRepository.save(newPerson);
	}
	
		public Person createNewPerson(String firstName, String lastName, Date createdAt, Date updatedAt) {
		Person newPerson = new Person(firstName, lastName, createdAt, updatedAt);
		return this.personRepository.save(newPerson);
	}
	public List<Person> allPeople(){
		return this.personRepository.findAll();
	}
}

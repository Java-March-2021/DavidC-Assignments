package com.david.relationships.services;

import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import com.david.relationships.models.License;
import com.david.relationships.models.Person;
import com.david.relationships.repositories.LicenseRepository;
import com.david.relationships.repositories.PersonRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	private final PersonRepository personRepository;
	
	public LicenseService(LicenseRepository licenseRepository, PersonRepository personRepository) {
		this.licenseRepository = licenseRepository;
		this.personRepository = personRepository;
	}
	public License getOneLicense(Long id) {
		return this.licenseRepository.findById(id).orElse(null);
	}
	
	public License createLicense(License newLicense) {
		newLicense.setNumber(this.generateLicenseNumber());
		return licenseRepository.save(newLicense);
	}
	public int generateLicenseNumber() {
		License newLicense = licenseRepository.findTopByOrderByNumberDesc();
		if(newLicense == null) 
			return 1;
		int largestNumber = newLicense.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
	public License createNewLicense(Integer number, Date expirationDate, String state) {
		License newLicense = new License(number, expirationDate, state);
		return this.licenseRepository.save(newLicense);
	}

	public List<Person> getUnlicensedPeople() {
		return personRepository.findByLicenseIsNull();
	}
}

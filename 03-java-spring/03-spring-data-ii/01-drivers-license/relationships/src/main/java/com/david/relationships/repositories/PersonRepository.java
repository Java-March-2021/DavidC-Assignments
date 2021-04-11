package com.david.relationships.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.relationships.models.License;
import com.david.relationships.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	
	List<Person> findAll();
	
	List<Person> findByLicenseIsNull();
	
//	List<Person> findByDescriptionContaining(String search);
	
//	Long countBylastNameContaining(String search);
//	
//	Long deleteBylastNameStartingWith(String search);
}

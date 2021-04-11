package com.david.relationships.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.relationships.models.License;



@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findAll();
	
	public License findTopByOrderByNumberDesc();
	
//	List<License> findByDescriptionContaining(String search);
	
//	Long countBylastNameContaining(String search);
//	
//	Long deleteBylastNameStartingWith(String search);

}

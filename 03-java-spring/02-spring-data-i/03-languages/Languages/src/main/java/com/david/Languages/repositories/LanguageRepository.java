package com.david.Languages.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.Languages.models.Lang;

@Repository
public interface LanguageRepository extends CrudRepository<Lang, Long> {
	
	List<Lang> findAll();
	
	List<Lang> findByVersionContaining(String search);
	
	List<Lang> findByNameContaining(String search);
	
	List<Lang> findByCreatorContaining(String search);
	
	Long countbyNameContaining(String search);
	
	Long deleteByNameStartingWith(String search);

}

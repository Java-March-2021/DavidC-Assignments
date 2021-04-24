package com.david.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.overflow.models.Questions;
@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Long>{
	List<Questions> findAll();

}

package com.david.overflow.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.overflow.models.Answers;
@Repository
public interface AnswersRepository extends CrudRepository<Answers, Long> {
	List<Answers> findAll();


}

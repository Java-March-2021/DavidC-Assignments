package com.david.overflow.repositories;

import java.util.List;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.overflow.models.Questions;
import com.david.overflow.models.Tagg;
@Repository
public interface TaggRepository extends CrudRepository<Tagg, Long> {
	List<Tagg> findAll();
	
	public List<Tagg> findByQuestionsNotContains(Questions questions);


}

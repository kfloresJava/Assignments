package com.flores.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.DojoOverflow.models.Questions;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Long>{

	List <Questions> findAll();

}

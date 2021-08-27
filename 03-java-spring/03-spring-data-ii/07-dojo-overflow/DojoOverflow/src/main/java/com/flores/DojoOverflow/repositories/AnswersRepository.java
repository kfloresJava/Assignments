package com.flores.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.DojoOverflow.models.Answers;

@Repository
public interface AnswersRepository extends CrudRepository<Answers, Long> {
	List <Answers> findAll();
}

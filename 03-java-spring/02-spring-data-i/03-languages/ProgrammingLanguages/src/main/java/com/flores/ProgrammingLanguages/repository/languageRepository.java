package com.flores.ProgrammingLanguages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.ProgrammingLanguages.models.programmingLanguages;

@Repository
public interface languageRepository extends CrudRepository<programmingLanguages, Long>{
	List<programmingLanguages> findAll();
}

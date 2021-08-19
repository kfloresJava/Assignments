package com.flores.OurDojos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.OurDojos.models.Dojo;


@Repository
public interface dojoRepository extends CrudRepository<Dojo, Long>{
		
	List<Dojo> findAll();
}

package com.flores.OurDojos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.OurDojos.models.Ninja;


@Repository
public interface ninjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}

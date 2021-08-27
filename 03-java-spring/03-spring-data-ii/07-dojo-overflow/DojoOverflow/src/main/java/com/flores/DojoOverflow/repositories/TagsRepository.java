package com.flores.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.flores.DojoOverflow.models.Tags;

public interface TagsRepository extends CrudRepository<Tags, Long>{
	List<Tags> findAll();
	boolean existsBytDesc(String tDesc);
	Tags findBytDesc(String title);
	Tags findBytDescContaining(String title);
}

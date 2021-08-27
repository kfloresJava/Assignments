package com.flores.ControlsWithViews.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.ControlsWithViews.models.Users;


@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

	List<Users> findAll();
	boolean existsByuEmail(String uEmail);
	Users findByuEmail(String uEmail);
}

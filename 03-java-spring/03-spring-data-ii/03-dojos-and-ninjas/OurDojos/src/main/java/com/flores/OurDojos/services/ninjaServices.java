package com.flores.OurDojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flores.OurDojos.models.Ninja;
import com.flores.OurDojos.repository.ninjaRepository;

@Service
public class ninjaServices {
	@Autowired
	private ninjaRepository nRepo;
	
	public ninjaServices(ninjaRepository nRepo)
	{
		this.nRepo = nRepo;
	}
	
	public List<Ninja> getAll()
	{
		return this.nRepo.findAll();
	}
	
	public Ninja create(Ninja nin)
	{
		return this.nRepo.save(nin);
	}
	
	public void deleteById(Long id)
	{
		this.nRepo.deleteById(id);
	}
	
	public Ninja update(Ninja nin)
	{
		return this.nRepo.save(nin);
	}
	
	public Ninja getOne(long id)
	{
		return this.nRepo.findById(id).orElse(null);
	}
	

}

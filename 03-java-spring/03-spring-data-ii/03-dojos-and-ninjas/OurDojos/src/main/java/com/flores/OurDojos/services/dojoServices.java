package com.flores.OurDojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.OurDojos.models.Dojo;
import com.flores.OurDojos.repository.dojoRepository;

@Service
public class dojoServices {
	@Autowired
	private dojoRepository dRepo;
	
	public dojoServices(dojoRepository dRepo)
	{
		this.dRepo = dRepo;
	}
	
	
	public List<Dojo> getAll()
	{
		return this.dRepo.findAll();
	}
	
	public Dojo create(Dojo dj)
	{
		return this.dRepo.save(dj);
	}
	
	public void deleteById(Long id)
	{
		this.dRepo.deleteById(id);
	}
	
	public Dojo update(Dojo dj)
	{
		return this.dRepo.save(dj);
	}
	
	public Dojo getOne(long id)
	{
		return this.dRepo.findById(id).orElse(null);
	}
	
	
}

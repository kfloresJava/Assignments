package com.flores.ProgrammingLanguages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flores.ProgrammingLanguages.models.programmingLanguages;
import com.flores.ProgrammingLanguages.repository.languageRepository;

@Service
public class languageServices {
	private languageRepository lRepo;
	
	public languageServices(languageRepository lRepo)
	{
		this.lRepo=lRepo;
	}
	
	public List<programmingLanguages> getAll()
	{
		return this.lRepo.findAll();
	}
	public programmingLanguages getOne(Long id)
	{
		return this.lRepo.findById(id).orElse(null);
	}
	
	public programmingLanguages create(programmingLanguages plx)
	{
		return this.lRepo.save(plx);
	}
	public void deleteById(Long id)
	{
		this.lRepo.deleteById(id);
	}
	public programmingLanguages update(programmingLanguages plx)
	{
		return this.lRepo.save(plx);
	}
	
}

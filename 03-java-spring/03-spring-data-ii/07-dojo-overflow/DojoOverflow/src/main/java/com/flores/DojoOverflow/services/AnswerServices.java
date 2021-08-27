package com.flores.DojoOverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flores.DojoOverflow.models.Answers;

import com.flores.DojoOverflow.repositories.AnswersRepository;



@Service
public class AnswerServices {
	
	private AnswersRepository aRepo;
	
	public AnswerServices(AnswersRepository Arepo)
	{
		
		this.aRepo=Arepo;
	}

	public List<Answers> getAllIdeas()
	{
		return this.aRepo.findAll();
	}
	
	public Answers getOne(Long id)
	{
		return this.aRepo.findById(id).orElse(null);
	}
	
	public Answers save(Answers ans)
	{
		return this.aRepo.save(ans);
	}
	
	
}

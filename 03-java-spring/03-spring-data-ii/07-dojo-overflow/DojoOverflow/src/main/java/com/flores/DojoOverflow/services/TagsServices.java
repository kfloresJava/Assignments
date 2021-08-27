package com.flores.DojoOverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.DojoOverflow.models.Tags;
import com.flores.DojoOverflow.repositories.TagsRepository;


@Service
public class TagsServices {
	@Autowired
	private TagsRepository tRepo;
	
	
	public List<Tags> getAllTags()
	{
		return this.tRepo.findAll();
	}
	
	public Tags getOne(Long id)
	{
		return this.tRepo.findById(id).orElse(null);
	}
	
	public Tags getBytDesc(String val)
	{
		return this.tRepo.findBytDesc(val);
	}
	
	public Tags create(Tags gx)
	{
		return this.tRepo.save(gx);
		
	}
}

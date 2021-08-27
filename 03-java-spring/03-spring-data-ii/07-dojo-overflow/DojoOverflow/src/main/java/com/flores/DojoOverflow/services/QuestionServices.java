package com.flores.DojoOverflow.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.DojoOverflow.models.Answers;
import com.flores.DojoOverflow.models.Questions;
import com.flores.DojoOverflow.models.Tags;
import com.flores.DojoOverflow.repositories.QuestionsRepository;
import com.flores.DojoOverflow.repositories.TagsRepository;



@Service
public class QuestionServices {
	@Autowired
	private QuestionsRepository qRepo;
	@Autowired
	private TagsRepository tRepo;
	@Autowired
	private TagsServices tServices;
	
	public QuestionServices(QuestionsRepository qRepo)
	{
		this.qRepo=qRepo;
	}
	
	
	public List<Questions> getAllQuestions(){
		return this.qRepo.findAll();
	}
	
	
	
	public Questions newQuestion(Questions qs, String valg)
	{
		
		String mgx[] = splitTag(valg);
		List<Tags> allTags= tRepo.findAll();
		ArrayList<Tags> slx = new ArrayList<Tags>();
		int checker=0;
		String val="";
		long mval=0;
		
		for(int i=0;i<mgx.length;i++)
		{
			
			if(tServices.getBytDesc(mgx[i])==null)
			{
				Tags ntag = new Tags(mgx[i]);
				tRepo.save(ntag);
				slx.add(ntag);
			}
			else
			{
				slx.add(tServices.getBytDesc(mgx[i]));
			}
		}
		qs.setTags(slx);
		return this.qRepo.save(qs);
	}
	
	public Questions findQuestion(Long id)
	{
		return this.qRepo.findById(id).orElse(null);
	}
	
	public Questions setAnswers(Answers ans, Questions que)
	{
		que.getAnswers().add(ans);
		return this.qRepo.save(que);
	}
	
	public Questions setTags(Questions qs, List <Tags> tgs)
	{
		qs.setTags(tgs);
		return qRepo.save(qs);
	}
	
	public String[] splitTag(String gx)
	{
		return gx.split("\\s*,\\s*");
	}
	
}

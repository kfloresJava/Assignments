package com.flores.DojoOverflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flores.DojoOverflow.models.Answers;
import com.flores.DojoOverflow.models.Questions;
import com.flores.DojoOverflow.services.AnswerServices;
import com.flores.DojoOverflow.services.QuestionServices;



@Controller
public class HomeController {

	@Autowired
	private QuestionServices qServices;

	@Autowired
	private AnswerServices aServices;
	
	
	@GetMapping("/questions")
	public String newQu(Model vm)
	{
		vm.addAttribute("allVals",this.qServices.getAllQuestions());
		return "index.jsp";
	}
	
	@GetMapping("/questions/{id}")
	public String newQu(@PathVariable Long id,Model vm)
	{
		vm.addAttribute("allVals",this.qServices.findQuestion(id));
		
		return "showQuestion.jsp";
	}
	
	@GetMapping("/questions/new")
	public String newQ()
	{
	
		return "newQuestion.jsp";
	}
	
	
	@PostMapping("/questions/new")
	public String addQ(@RequestParam("qdesc") String qdesc, @RequestParam("tgs") String tgs)
	{
		Questions ngs=new Questions(qdesc);
		
		qServices.newQuestion(ngs, tgs);
		
		
		return "newQuestion.jsp";
	}
	
	@PostMapping("/questions/newAns")
	public String newAns(@RequestParam("adesc") String adesc, @RequestParam("qid") Long qid)
	{
		Questions ngs=qServices.findQuestion(qid);
		Answers ansv= new Answers(adesc);
		ansv.setQuestion(ngs);
		this.aServices.save(ansv);
		
		return "redirect:/questions/"+qid;
	}
}

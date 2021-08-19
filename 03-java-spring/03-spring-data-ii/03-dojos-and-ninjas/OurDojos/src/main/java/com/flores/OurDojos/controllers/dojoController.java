package com.flores.OurDojos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flores.OurDojos.models.Dojo;
import com.flores.OurDojos.services.dojoServices;
import com.flores.OurDojos.services.ninjaServices;

@Controller
public class dojoController {
	@Autowired
	private ninjaServices nServices;
	@Autowired
	private dojoServices dServices;
	
	@RequestMapping("dojos/new")
	public String newDojo( @ModelAttribute("dojox") Dojo dojox)
	{
		
		return "newDojo.jsp";
	}
	
	@GetMapping("dojos/{id}")
	public String show(@PathVariable("id") Long id, @ModelAttribute("dojox") Dojo dojox, Model vm)
	{
		Dojo ourDojo = this.dServices.getOne(id);
		vm.addAttribute("sDojo",ourDojo);
		return "showDojo.jsp";
	}
	
	@PostMapping("dojos/new")
	public String addDojo(Model vm, @ModelAttribute("dojox") Dojo dojox, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "newDojo.jsp";
		}
		this.dServices.create(dojox);
		return "redirect:/dojo/new";
	}
	
}

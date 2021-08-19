package com.flores.OurDojos.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flores.OurDojos.models.Dojo;
import com.flores.OurDojos.models.Ninja;
import com.flores.OurDojos.services.dojoServices;
import com.flores.OurDojos.services.ninjaServices;

@Controller

public class ninjaController {
	@Autowired
	private ninjaServices nServices;
	@Autowired
	private dojoServices dServices;
	
	
	@RequestMapping("ninja/new")
	public String newNinja(Model vm, @ModelAttribute("nins") Ninja nins )
	{
		List<Dojo> allDojo = this.dServices.getAll();
		vm.addAttribute("allDojo",allDojo);
		return "newNinja.jsp";
	}
	
	@PostMapping("ninja/Addnew")
	public String addNinja(Model vm, @ModelAttribute("nins") Ninja nins, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "newNinja.jsp";
		}
		this.nServices.create(nins);
		long mid= nins.getmDojo().getdID();
		return "redirect:/dojos/"+mid;
	}
	
	
}

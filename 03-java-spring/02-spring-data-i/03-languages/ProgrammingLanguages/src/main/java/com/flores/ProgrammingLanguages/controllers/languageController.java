package com.flores.ProgrammingLanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flores.ProgrammingLanguages.models.programmingLanguages;
import com.flores.ProgrammingLanguages.services.languageServices;


@Controller
public class languageController {
	@Autowired
	private languageServices myServices;
	
	@RequestMapping("languages")
	public String index(Model nx)
	{	
		List<programmingLanguages> allLanguage = this.myServices.getAll();
		nx.addAttribute("allL",allLanguage);
		return "index.jsp";
	}
	
	@PostMapping("/new")
	public String createNew(@RequestParam String languageName, @RequestParam String languageCreator, @RequestParam String version )
	{
		programmingLanguages mypl = new programmingLanguages(languageName,languageCreator,version);
		myServices.create(mypl);
		System.out.println("wewew");
		return "redirect:/languages";
	}
	
	
	@GetMapping("/{pID}")
    public String show(@PathVariable("pID") Long pID,@ModelAttribute("pls") programmingLanguages pls, Model vm) {
		System.out.println(pID);
		vm.addAttribute("pls", this.myServices.getOne(pID));
        return "show.jsp";
    }
	
	@GetMapping("/{pID}/edit")
    public String edit(@PathVariable("pID") Long pID,@ModelAttribute("pls") programmingLanguages pls, Model vm) {
		System.out.println(pID);
		vm.addAttribute("pls", this.myServices.getOne(pID));
        return "edit.jsp";
    }

	
	@PostMapping("/{pID}/edit")
    public String processEdit(@PathVariable("pID") Long pID,@Valid @ModelAttribute("pls") programmingLanguages pls, BindingResult result, Model vm) {
		if(result.hasErrors())
		{
			vm.addAttribute("pls", this.myServices.getOne(pID));
			return "edit.jsp";
		}
		this.myServices.update(pls);
        return "redirect:/languages";
    }
	
	@GetMapping("/{pID}/delete")
    public String delete(@PathVariable("pID") Long pID,@ModelAttribute("pls") programmingLanguages pls, Model vm) {
		myServices.deleteById(pID);
		return "redirect:/languages";
    }
	
	
	
	/*@GetMapping("/{id}/edit")
	public String update(@PathVariable("id") Long id, Model nx)
	{
		programmingLanguages edL = myServices.getOne(id);
		nx.addAttribute("contents",edL);
		return "edit.jsp";
	}*/

}

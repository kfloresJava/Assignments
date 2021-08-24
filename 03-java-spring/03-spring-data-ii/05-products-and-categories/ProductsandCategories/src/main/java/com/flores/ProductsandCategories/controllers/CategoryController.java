package com.flores.ProductsandCategories.controllers;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flores.ProductsandCategories.models.Categories;
import com.flores.ProductsandCategories.models.Product;

import com.flores.ProductsandCategories.services.CategoryServices;
import com.flores.ProductsandCategories.services.ProductServices;

@Controller
public class CategoryController {
	@Autowired
	private CategoryServices cServices;
	@Autowired
	private ProductServices pServices;
	
	@GetMapping("categories/new")
	public String createProduct(@ModelAttribute("cats") Categories cats)
	{
		return "categories/newCategory.jsp";
	}
	
	
	@GetMapping("categories/{id}")
	public String showCategory(@PathVariable Long id, @ModelAttribute("category") Product category, @ModelAttribute("cCats") Categories cCats , Model vm)
	{
		Categories cPr=cServices.getOne(id);
		List<Product> sde = pServices.getAll();	
		vm.addAttribute("cats",cPr);
		vm.addAttribute("prods",sde);
		return "categories/show.jsp";
	}
	
	
	@PostMapping("categories/new")
	public String newProduct(Model vm, @ModelAttribute("cats") Categories cats, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "categories/new";
		}
		this.cServices.create(cats);
		Long ids= cats.getcID();
		return "redirect:/categories/"+ids;
	}
	
	@PostMapping("categories/addCat")
	public String addCat(@RequestParam("prods") Long prodid,@RequestParam("cID") Long cid)
	{
		Product cProduct = this.pServices.getOne(prodid);
		Categories cCat= this.cServices.getOne(cid);
		this.cServices.addProd(cCat, cProduct);
		return "redirect:/categories/"+cid;
	}

}

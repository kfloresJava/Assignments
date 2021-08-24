package com.flores.ProductsandCategories.controllers;

import java.util.List;

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
public class ProductController {
	@Autowired
	private ProductServices pServices;
	@Autowired
	private CategoryServices cServices;
	
	
	@GetMapping("products/new")
	public String createProduct(@ModelAttribute("prods") Product prods)
	{
		return "products/newProduct.jsp";
	}
	
	@GetMapping("products/{id}")
	public String showProduct(@PathVariable Long id, @ModelAttribute("prods") Product prods, @ModelAttribute("cCats") Categories cCats , Model vm)
	{
		Product aProd=pServices.getOne(id);
		List<Categories> cCat = cServices.getAll();	
		vm.addAttribute("cPrd",aProd);
		vm.addAttribute("ccs",cCat);
		return "products/show.jsp";
	}
	
	@PostMapping("products/new")
	public String newProduct(Model vm, @ModelAttribute("prods") Product prods, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "products/new";
		}
		this.pServices.create(prods);
		Long ids= prods.getpID();
		return "redirect:/products/"+ids;
	}
	@PostMapping("products/addCat")
	public String addCat(@RequestParam("cats") Long id,@RequestParam("pID") Long idx)
	{
		Product cProduct = this.pServices.getOne(idx);
		Categories cCat= this.cServices.getOne(id);
		this.pServices.addCat(cCat, cProduct);
		return "redirect:/products/"+idx;
	}
}

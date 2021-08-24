package com.flores.ProductsandCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.ProductsandCategories.models.Categories;
import com.flores.ProductsandCategories.models.Product;
import com.flores.ProductsandCategories.repositories.CategoryRepository;
import com.flores.ProductsandCategories.repositories.ProductRepository;

@Service
public class CategoryServices {
	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	public CategoryServices(CategoryRepository crepo) {  
		this.cRepo = crepo;
	}
	
	public List<Categories> getAll()
	{
		return this.cRepo.findAll();
	}
	
	
	public void addProd(Categories cat, Product ml)
	{
		cat.getproducts().add(ml);
		this.cRepo.save(cat);
	}
	
	public Categories create(Categories cate)
	{
		return this.cRepo.save(cate);
	}

	
	public void deleteById(Long id)
	{
		this.cRepo.deleteById(id);
	}
	
	public Categories update(Categories cate)
	{
		return this.cRepo.save(cate);
	}
	
	public Categories getOne(long id)
	{
		return this.cRepo.findById(id).orElse(null);
	}
}

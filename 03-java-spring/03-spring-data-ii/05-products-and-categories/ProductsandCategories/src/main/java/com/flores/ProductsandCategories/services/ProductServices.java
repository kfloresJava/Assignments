package com.flores.ProductsandCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.ProductsandCategories.models.Categories;
import com.flores.ProductsandCategories.models.Product;
import com.flores.ProductsandCategories.repositories.CategoryRepository;
import com.flores.ProductsandCategories.repositories.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	public ProductServices(ProductRepository prepo) {  
		this.pRepo = prepo;
	}
	
	
	public List<Product> getAll()
	{
		return this.pRepo.findAll();
	}
	
	public Product create(Product prod)
	{
		return this.pRepo.save(prod);
	}
	
	public void addCat(Categories cat, Product ml)
	{
		ml.getcategories().add(cat);
		this.pRepo.save(ml);
	}
	
	public void deleteById(Long id)
	{
		this.pRepo.deleteById(id);
	}
	
	public Product update(Product prod)
	{
		return this.pRepo.save(prod);
	}
	
	public Product getOne(long id)
	{
		return this.pRepo.findById(id).orElse(null);
	}
	
}

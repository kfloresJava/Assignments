package com.flores.ProductsandCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.ProductsandCategories.models.Categories;
import com.flores.ProductsandCategories.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findAll();
	

}

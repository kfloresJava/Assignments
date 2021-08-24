package com.flores.ProductsandCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.ProductsandCategories.models.Categories;
import com.flores.ProductsandCategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Categories, Long>{
    
	List<Categories> findAll();

}

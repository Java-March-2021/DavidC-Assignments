package com.david.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.products.models.Category;
import com.david.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();

	public List<Product> findByCategoriesNotContains(Category category);
}

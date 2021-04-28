package com.david.products.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.products.models.Category;
import com.david.products.models.Product;
import com.david.products.repositories.ProductRepository;
import com.david.products.service.CategoryService;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryService cService;
	
	public Product find(Long id){ 
		Product product = this.pRepo.findById(id).orElse(null);
		return product;
	}
	
	
	public Product createProduct(Product newProduct) {
		return this.pRepo.save(newProduct);
	}


	
//	Add A Product
	public void addProduct(Category category, Product product) {
		List<Category> categories = product.getCategories();
		categories.add(category);
		this.pRepo.save(product);
	}
	//Remove a Category
	public void removeProduct(Category category, Product product) {
		List<Category> categories = product.getCategories();
		categories.remove(category);
		this.pRepo.save(product);
	}
	
	
	public List<Product> allProducts() {
		return this.pRepo.findAll();
	}
	public void deleteById(Long id) {
		this.pRepo.deleteById(id);
	}
	
	public Product editProduct(Long id, String name, String description, float price, Long category_id) {
		Product updatedProduct = this.find(id);
		List<Category> linkedCategories = updatedProduct.getCategories();
		updatedProduct.setName(name);
		updatedProduct.setDescription(description);
		updatedProduct.setPrice(price);
		Category category = this.cService.find(category_id);
			if(!linkedCategories.contains(category)) {
				linkedCategories.add(category);
			}
			updatedProduct.setCategories(linkedCategories);
		return this.pRepo.save(updatedProduct);
	}
//	public Product updateProduct(Long id, Product updatedProduct) {
//		return this.pRepo.save(updatedProduct);
//	}
}



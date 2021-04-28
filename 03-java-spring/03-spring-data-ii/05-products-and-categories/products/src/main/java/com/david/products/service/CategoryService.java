package com.david.products.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.products.models.Category;
import com.david.products.models.Product;
import com.david.products.repositories.CategoryRepository;
import com.david.products.service.ProductService;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	ProductService pService;
	
	public Category find(Long id) {
		Category category = this.cRepo.findById(id).orElse(null);
		return category;
	}
	
	public List<Category> allCategories() {
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category newCategory) {
		return this.cRepo.save(newCategory);
	}
//	Add A Product
	public void addProduct(Product product, Category category) {
		List<Product> products = category.getProducts();
		products.add(product);
		this.cRepo.save(category);
	}
//	Remove a Product
	public void removeProduct(Product product, Category category) {
		List<Product> products = category.getProducts();
		products.remove(product);
		this.cRepo.save(category);
	}
	
	
	//Create Category HTML Forms way
	public Category newCategory(String name) {
		Category newCategory = new Category(name);
		return this.cRepo.save(newCategory);
	}
	
	public void deleteById(Long id) {
		cRepo.deleteById(id);
	}
//	public Category editCategory(String name) {
//		Category editCategory = new Category(name);
//		return this.cRepo.save(editCategory);
//	}
	public Category editCategory(Long id, String name, Long product_id)  {
		Category updatedCategory = this.find(id);
		List<Product> linkedProduct = updatedCategory.getProducts();
		updatedCategory.setName(name);
		Product product = this.pService.find(product_id);
			if(!linkedProduct.contains(product)) {
				linkedProduct.add(product);
			}
		updatedCategory.setProducts(linkedProduct);
		return this.cRepo.save(updatedCategory);
	}
}








//package com.david.products.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.david.products.models.Category;
//import com.david.products.models.Product;
//import com.david.products.service.CategoryService;
//import com.david.products.service.ProductService;
//
//@RestController
//@RequestMapping("api")
//public class APIController {
//	@Autowired
//	private CategoryService cService;
//	@Autowired
//	private ProductService pService;
//	
//
//	
//	@GetMapping("/category/{id}")
//	public String showCategory() {
//		return "showCategory.jsp";
//	}
//	@GetMapping("/product/{id}")
//	public String showProduct() { 
//	return "showProduct.jsp";
//	}
//	@GetMapping("/category/new")
//		public String newCategory() {
//		return "newCategory.jsp";
//	}
//	@PostMapping("/category/new")
//	public Category createCategory(Category category) {
//		return this.cService.createCategory(category);
//	}
//	
//	@GetMapping("/product/new")
//	public String newProduct() {
//		return "newProduct.jsp";
//	}
//	@PostMapping("/product/new")
//	public Product createProduct(Product product) {
//		return this.pService.createProduct(product);
//	}
//}

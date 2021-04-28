package com.david.products.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.david.products.models.Category;
import com.david.products.models.Product;
import com.david.products.service.CategoryService;
import com.david.products.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CategoryService cService;
	@Autowired
	private ProductService pService;
	

	@GetMapping("/")
	public String index(Model viewModel){
		List<Category> categories = this.cService.allCategories();
		viewModel.addAttribute("allCategories", categories);
		return "index.jsp";
	}
	@GetMapping("/products")
	public String productIndex(Model viewModel){
		List<Product> products = this.pService.allProducts();
		viewModel.addAttribute("allProducts", products);
		return "productIndex.jsp";
	}
	
	@GetMapping("category/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("category", this.cService.find(id));
		return "showCategory.jsp";
	}

	@GetMapping("product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("product", this.pService.find(id));
	return "showProduct.jsp";
	}
	@GetMapping("category/new")
		public String addCategory(@ModelAttribute("category") Category category, Model viewModel) {
		viewModel.addAttribute("allProducts", this.pService.allProducts());
		return "newCategory.jsp";
	}
	@PostMapping("/category/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model viewModel) {	
		if(result.hasErrors()) {
			viewModel.addAttribute("allProducts", this.pService.allProducts());
			return "newCategory.jsp";
		}else {
			this.cService.createCategory(category);
			return "redirect:/";
		}
	}
	
	@GetMapping("product/new")
		public String addProduct(@ModelAttribute("product") Product product, Model viewModel) {
		viewModel.addAttribute("allCategories", this.cService.allCategories());
		return "newProduct.jsp";
	}
	
	@PostMapping("/product/new")
	public String newProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("product", product);
			viewModel.addAttribute("allCategories", this.cService.allCategories());
			return "newProduct.jsp";	
		} else {
			this.pService.createProduct(product);
			return "redirect:/products";
	}
	}
	

	@RequestMapping(value="/category/delete/{id}")
	public String destroyCategory(@PathVariable("id") Long id) {
		cService.deleteById(id);
		return "redirect:/";
}
	@RequestMapping(value="/product/delete/{id}")
	public String destroyProduct(@PathVariable("id") Long id) {
		pService.deleteById(id);
		return "redirect:/";
}
	@GetMapping("/product/edit/{id}")
	public String edit(@ModelAttribute("product") Product product, Model viewModel, @PathVariable("id") Long id) {
	viewModel.addAttribute("product", this.pService.find(id));
	viewModel.addAttribute("allCategories", this.cService.allCategories());
	return "editProduct.jsp";
	}
	
	@PostMapping("/product/edit/{id}")
	public String editProduct(@RequestParam("name") String name, @RequestParam("description") String description, 
		@RequestParam("price") float price, @RequestParam("category_id")Long category_id, @PathVariable("id")Long id, 
		Model viewModel) {
			this.pService.editProduct(id, name, description, price, category_id);
			return "redirect:/products";
		}
	
		
	@GetMapping("/category/edit/{id}")
	public String edit(@ModelAttribute("category") Category category, Model viewModel, @PathVariable("id") Long id) {
	viewModel.addAttribute("category", this.cService.find(id));
	viewModel.addAttribute("allProducts", this.pService.allProducts());
	return "editCategory.jsp";
		}
		
	@PostMapping("/category/edit/{id}")
		public String editCategory(@RequestParam("name") String name, @RequestParam("product_id")Long product_id, 
				@PathVariable("id") Long id, Model viewModel) {
		this.cService.editCategory(id, name, product_id);
				return "redirect:/";
			}
	
	
	}
	
	


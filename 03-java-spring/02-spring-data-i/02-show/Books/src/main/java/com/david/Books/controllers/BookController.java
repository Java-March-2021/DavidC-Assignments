package com.david.Books.controllers;

import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.david.Books.models.Book;
import com.david.Books.services.BookService;

@Controller
public class BookController {
	
	private BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return"index.jsp";
	}
	
	@GetMapping("/books/add")
	public String add(Model model) {
		
		return "add.jsp";
	}
	@PostMapping("/books/add")
	public String newBook(@RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("language") String language, @RequestParam("pages") int numberOfPages, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(title.equals("")) {
			errors.add("Oops!, You forgot a Title!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/books/add";
		}
		if(description.equals("")) {
			errors.add("Oops!, You forgot a description!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/books/add";
		}
		if(language.equals("")) {
			errors.add("Oops!, You forgot a language!!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/books/add";
		}
		this.bookService.createNewBook(title, description, language, numberOfPages);
		return "redirect:/books";
	}
	
	@GetMapping("books/[id]")
	public String showBook(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("book", this.bookService.getOneBook(id));
		return "book.jsp";
	}
	
	@RequestMapping("books/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.getOneBook(id);
		if(book != null) {
			model.addAttribute("book", book);
			return "edit.jsp";
		}else {
			return "redirect:/books";
		}
	}
	
	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id") Long id, @RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("language") String language, @RequestParam("pages") int numberOfPages, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(title.equals("")) {
			errors.add("Oops!, You forgot a Title!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/books/add";
		}
		if(description.equals("")) {
			errors.add("Oops!, You forgot a description!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/books/add";
		}
		if(language.equals("")) {
			errors.add("Oops!, You forgot a language!!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
		}
			return "redirect:/books/add";
		}
	
//		this.bookService.set(title, description, language, numberOfPages);
//		return "redirect:/books";
//	}
	@RequestMapping(value="/books/delete/{id}")
		public String destroyBook(@PathVariable("id") Long id, Book book) {
			bookService.deleteById(id, book);
			return "redirect:/books";
}
}
	
//	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//	public Book edit(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="pages"), int numberOfPages) {)
//		Book book = bookService.updateBook
//	}
//}

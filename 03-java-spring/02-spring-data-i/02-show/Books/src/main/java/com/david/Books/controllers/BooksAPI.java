package com.david.Books.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.david.Books.models.Book;
import com.david.Books.services.BookService;

@RestController
@RequestMapping("/api")
public class BooksAPI {

	private final BookService bookService;
	
	public BooksAPI(BookService service) {
		this.bookService = service;
	}
	

@RequestMapping("/books")
public List<Book> index() {
	return bookService.allBooks();
	}
@RequestMapping("/books/{id}")
public Book showBook(@PathVariable Long id) {
	Book book = bookService.findBook(id);
	return book;
	}

//
//@PostMapping("books/add")
//public Book createBook(Book book) {
//	return this.bookService.createBook(book);
//}
@RequestMapping(value="/books/add", method=RequestMethod.POST)
public Book createBook(@RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String language, @RequestParam(value="pages") Integer numOfPages) {
    Book book = new Book(title, description, language, numOfPages);
    return bookService.createBook(book);

}

//@RequestMapping("/books/{id}")
//public Book showBook(@PathVariable("id") Long id) {
//    Book book = bookService.findBook(id);
//    return book;
//}

//@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
//public void delete(@PathVariable("id") Long id ) {
//	bookService.deleteBook(id);
//}

}


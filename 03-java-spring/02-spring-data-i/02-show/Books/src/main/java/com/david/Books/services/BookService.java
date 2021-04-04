package com.david.Books.services;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.persistence.Table;
import org.springframework.stereotype.Service;
import com.david.Books.models.Book;
import com.david.Books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public Book getOneBook(Long id) {
		return this.bookRepository.findById(id).orElse(null);
}
	public Book createNewBook(String title, String description, String language, int numberOfPages) {
		Book newBook = new Book(title, description, language, numberOfPages);
		return this.bookRepository.save(newBook);
	}
	public Book createBook(Book newBook) {
		return this.bookRepository.save(newBook);
	}
	public List<Book> allBooks(){
		return this.bookRepository.findAll();
	}
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}

//    public void updateBook(Long id, Book book) {
////    	Optional<Book> updateBook = this.bookRepository.findById(id);
//    	if(id < book.size()) {
//    		book.set(id, book);
//    	}
//    }
    public void deleteById(Long id, Book book) {
    	bookRepository.deleteById(id);
    }
}
    
//    public Book deleteBook(Long id) {
//    	if (id < Book.size()) {
//    		Book.remove(id);
//    	}
//    }
//    @SuppressWarnings("unchecked")
//	private List<Book> books = new ArrayList(Arrays.asList(
//            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
//            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
//            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
//            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
//            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
//            ));
    
//    public List<Book> allBooks() {
//        return Book;
//    }
//    
//}
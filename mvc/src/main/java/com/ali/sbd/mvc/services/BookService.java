package com.ali.sbd.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ali.sbd.mvc.models.Book;
import com.ali.sbd.mvc.repositories.BookRepository;

@Service
public class BookService {
	
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
   
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book updateBook(Long id, String title, String description, String language, Integer numOfPages) {
    	Optional <Book> update = bookRepository.findById(id);
    	if(update != null && update.isPresent()) {
    		update.get().setTitle(title);
    		update.get().setDescription(description);
    		update.get().setNumberOfPages(numOfPages);
    		bookRepository.save(update.get());
    		return update.get();
    	}
    	return null;        
    }
   
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
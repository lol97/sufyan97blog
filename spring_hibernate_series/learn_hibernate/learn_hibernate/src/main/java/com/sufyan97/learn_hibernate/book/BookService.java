package com.sufyan97.learn_hibernate.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book get(Long bookId) {
		return bookRepository.getReferenceById(bookId);
	}
	
	public void store(Book book) {
		if(book.getAuthor() != null) {
			authorRepository.save(book.getAuthor());
		}
		bookRepository.save(book);
	}
}

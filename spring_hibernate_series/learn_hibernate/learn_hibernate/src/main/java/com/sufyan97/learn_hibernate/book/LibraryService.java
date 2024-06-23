package com.sufyan97.learn_hibernate.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book getBook(Long bookId) {
		return bookRepository.findById(bookId).orElse(null);
	}
	
	public Book getBookFetch(Long bookId) {
		return bookRepository.getBookFetch(bookId);
	}
}

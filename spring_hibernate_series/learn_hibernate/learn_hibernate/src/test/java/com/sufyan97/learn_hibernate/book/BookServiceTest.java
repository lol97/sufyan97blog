package com.sufyan97.learn_hibernate.book;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private LibraryService libraryService;
	
	
	
}

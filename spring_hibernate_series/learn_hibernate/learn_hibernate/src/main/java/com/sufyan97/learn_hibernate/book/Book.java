package com.sufyan97.learn_hibernate.book;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ISBN;
	
	private String title;
	
	private Integer totalPage;
	
	private String category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Author author;
}

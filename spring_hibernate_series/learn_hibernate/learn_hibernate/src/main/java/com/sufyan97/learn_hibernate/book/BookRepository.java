package com.sufyan97.learn_hibernate.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	@Query("select b from Book b left join fetch b.author where b.id = :id")
	public Book getBookFetch(Long id);
}

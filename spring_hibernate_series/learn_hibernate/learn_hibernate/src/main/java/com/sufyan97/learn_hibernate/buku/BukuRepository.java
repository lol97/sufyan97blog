package com.sufyan97.learn_hibernate.buku;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BukuRepository extends JpaRepository<Buku, Long>{
	@Query("select b from Buku b left join fetch b.penulis where b.id = :id")
	public Buku getBukuFetch(Long id);
}

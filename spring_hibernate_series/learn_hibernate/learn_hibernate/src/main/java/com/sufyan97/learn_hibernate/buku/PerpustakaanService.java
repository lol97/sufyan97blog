package com.sufyan97.learn_hibernate.buku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerpustakaanService {
	@Autowired
	public BukuRepository bukuRepository;
	
	public Buku getBook(Long bookId) {
		return bukuRepository.findById(bookId).orElse(null);
	}
	
	public Buku getBukuFetch(Long bookId) {
		return bukuRepository.getBukuFetch(bookId);
	}
}

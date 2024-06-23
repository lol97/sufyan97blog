package com.sufyan97.learn_hibernate.buku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BukuService {
	@Autowired
	public BukuRepository bukuRepository;
	
	@Autowired
	public PenulisRepository penulisRepository;
	
	public Buku get(Long bookId) {
		return bukuRepository.getReferenceById(bookId);
	}
	
	public void store(Buku buku) {
		if(buku.getPenulis() != null) {
			penulisRepository.save(buku.getPenulis());
		}
		bukuRepository.save(buku);
	}
}

package com.sufyan97.learn_hibernate.blog;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.Data;

@Service
@Data
public class BlogService {
	private final ArtikelRepository artikelRepository;
	private final PenulisBlogRepository penulisBlogRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Artikel storeArtikel(Artikel artikel) {
		artikelRepository.save(artikel);
		return artikel;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public PenulisBlog storePenulisBlog(PenulisBlog penulisBlog) {
		penulisBlogRepository.save(penulisBlog);
		return penulisBlog;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Artikel addPenulisBlogToArtikel(Long artikelId, Long blogId) {
		Artikel artikel = artikelRepository.findById(artikelId)
				.orElseThrow(() -> new RuntimeException("artikel with id " +artikelId + " not found"));
		PenulisBlog penulisBlog = penulisBlogRepository.findById(blogId)
				.orElseThrow(() -> new RuntimeException("Penulis Blog with id " +artikelId + " not found"));
		 
		
		artikel.getPenulisSet().add(penulisBlog);
		penulisBlog.getArtikels().add(artikel);
		artikelRepository.save(artikel);
		penulisBlogRepository.save(penulisBlog);
		
		return artikel;
	}	
}

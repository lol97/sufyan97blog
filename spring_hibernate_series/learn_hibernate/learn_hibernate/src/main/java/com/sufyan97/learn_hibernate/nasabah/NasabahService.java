package com.sufyan97.learn_hibernate.nasabah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NasabahService {
	@Autowired
	private NasabahRepository nasabahRepository;
	
	@Autowired
	private KartuDebitRepository kartuDebitRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void store(Nasabah nasabah) {
		kartuDebitRepository.save(nasabah.getKartuDebit());
		nasabahRepository.save(nasabah);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void destroy(Nasabah nasabah) {
		nasabahRepository.delete(nasabah);
	}
}

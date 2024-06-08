package com.sufyan97.learn_hibernate.wilayah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WilayahService {
	@Autowired
	private KabupatenRepository kabupatenRepository;
	
	@Autowired
	private ProvinsiRepository provinsiRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveProvinsi(Provinsi provinsi) {
		provinsiRepository.save(provinsi);
	}
}

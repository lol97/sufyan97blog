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
	private TipeWilayahRepository tipeWilayahRepository;
	
	@Autowired
	private ProvinsiRepository provinsiRepository;
	
	@Autowired
	private KecamatanRepository kecamatanRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveProvinsi(Provinsi provinsi) {
		provinsiRepository.save(provinsi);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveTipe(TipeWilayah tipeWilayah) {
		tipeWilayahRepository.save(tipeWilayah);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveKabupaten(Kabupaten kabupaten) {
		kabupatenRepository.save(kabupaten);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveKecamatan(Kecamatan kecamatan) {
		kecamatanRepository.save(kecamatan);
	}
	
	public Kabupaten getKabupaten(String codeKabupaten) {
		return kabupatenRepository.getById(codeKabupaten);
	}
}

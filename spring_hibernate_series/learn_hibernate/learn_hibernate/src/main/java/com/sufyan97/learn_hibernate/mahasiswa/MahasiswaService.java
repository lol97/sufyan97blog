package com.sufyan97.learn_hibernate.mahasiswa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MahasiswaService {
	@Autowired
	private MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	private KartuMahasiswaRepository kartuMahasiswaRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void Store(Mahasiswa mahasiswa) {
		if(mahasiswa != null && mahasiswa.getKartuMahasiswa() != null) {
			KartuMahasiswa kartuMahasiswa = mahasiswa.getKartuMahasiswa();
			kartuMahasiswaRepository.save(kartuMahasiswa);
		}
		
		mahasiswaRepository.save(mahasiswa);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void destroy(Mahasiswa mahasiswa) {
		mahasiswaRepository.delete(mahasiswa);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void removeKartuMahasiswa(Mahasiswa mahasiswa) {
		kartuMahasiswaRepository.delete(mahasiswa.getKartuMahasiswa());
		mahasiswa.setKartuMahasiswa(null);
	}
}

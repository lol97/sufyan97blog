package com.sufyan97.learn_hibernate.barang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BarangService {
	@Autowired
	protected BarangRepository barangRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Barang store(Barang barang) {
		Barang save = barangRepository.save(barang);
		return save;
	}
	
	public Barang read(Long id) throws Exception {
		return barangRepository.findById(id).orElseThrow(() -> new Exception("id barang" + id + " tidak ditemukan"));
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Barang barang) throws Exception{
		barangRepository.save(barang);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void destroy(Long id) throws Exception {
		Barang read = this.read(id);
		barangRepository.delete(read);
	}
}

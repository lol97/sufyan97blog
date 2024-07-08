package com.sufyan97.learn_hibernate.sekolah;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
public class SekolahService {
	private final MapelSiswaRepository mapelSiswaRepository;
	private final SiswaRepository siswaRepository;
	private final MapelRepository mapelRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public MapelSiswa store(MapelSiswa mapelSiswa) {
		if(mapelSiswa.getMapel() != null) {
			mapelRepository.save(mapelSiswa.getMapel());
		}
		if(mapelSiswa.getSiswa() != null) {
			siswaRepository.save(mapelSiswa.getSiswa());
		}
		MapelSiswa save = mapelSiswaRepository.save(mapelSiswa);
		return save;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addSiswa(Mapel mapel, Siswa siswa, Integer nilai) {
		siswaRepository.save(siswa);
		
		MapelSiswa newKelas = new MapelSiswa();
		newKelas.setMapel(mapel);
		newKelas.setSiswa(siswa);
		newKelas.setNilai(nilai);
		mapelSiswaRepository.save(newKelas);
		
		mapel.getMapelSiswaSet().add(newKelas);
	}
}

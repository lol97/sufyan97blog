package com.sufyan97.learn_hibernate.mahasiswa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MahasiswaServiceTest {
	
	@Autowired
	MahasiswaService mahasiswaService;

	@DisplayName("createMahasiswaWithoutKartu")
	@Test
	void createMahasiswaWithoutKartu() {
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama("Robert Dor");
		mahasiswa.setTanggalLahir(new Date(2002, 8, 20));
		mahasiswa.setTempatLahir("Jakarta");
	}

}

package com.sufyan97.learn_hibernate.mahasiswa;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KartuMahasiswaRepository extends JpaRepository<KartuMahasiswa, BigDecimal>{

}

package com.sufyan97.learn_hibernate.sekolah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapelSiswaRepository extends JpaRepository<MapelSiswa, Long>{

}

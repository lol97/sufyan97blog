package com.sufyan97.learn_hibernate.buku;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenulisRepository extends JpaRepository<Penulis, Long>{

}

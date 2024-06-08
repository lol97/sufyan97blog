package com.sufyan97.learn_hibernate.wilayah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KabupatenRepository extends JpaRepository<Kabupaten, String>{

}

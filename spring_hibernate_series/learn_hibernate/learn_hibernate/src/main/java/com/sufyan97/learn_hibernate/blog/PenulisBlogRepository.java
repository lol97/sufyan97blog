package com.sufyan97.learn_hibernate.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenulisBlogRepository extends JpaRepository<PenulisBlog, Long>{

}

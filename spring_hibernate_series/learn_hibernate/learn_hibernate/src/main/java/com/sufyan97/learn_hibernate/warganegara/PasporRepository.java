package com.sufyan97.learn_hibernate.warganegara;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasporRepository extends JpaRepository<Paspor, String>{

}

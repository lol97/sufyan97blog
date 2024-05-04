package com.sufyan97.learn_hibernate.warganegara;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WargaNegaraRepository extends JpaRepository<WargaNegara, BigDecimal>{

}

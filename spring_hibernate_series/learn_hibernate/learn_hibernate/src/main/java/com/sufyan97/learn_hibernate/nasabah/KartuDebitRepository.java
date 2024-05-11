package com.sufyan97.learn_hibernate.nasabah;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KartuDebitRepository extends JpaRepository<KartuDebit, BigDecimal>{

}

package com.sufyan97.learn_hibernate.wilayah;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Kabupaten {
	@Id
	private String codeKabupaten;
	
	private String nama;
	
	@ManyToOne()
	@JoinColumn(name = "codeProvinsi")
	private Provinsi provinsi;
}

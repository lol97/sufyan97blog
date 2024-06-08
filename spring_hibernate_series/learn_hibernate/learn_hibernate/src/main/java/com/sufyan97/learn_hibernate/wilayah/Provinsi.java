package com.sufyan97.learn_hibernate.wilayah;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Provinsi {
	@Id
	@Column(name = "CODE_PROVINSI")
	private String codeProvinsi;
	
	@Column(name = "NAMA")
	private String nama;
	
	@OneToMany(mappedBy = "provinsi", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Kabupaten> kabupatens = new ArrayList<Kabupaten>();
}

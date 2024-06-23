package com.sufyan97.learn_hibernate.kuliah;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MataKuliah {
	@Id
	@Column(name = "KODE_MATKUL")
	private String kodeMatkul;
	
	@Column(name = "NAMA")
	private String nama;
	
	@Column(name = "JUMLAH_SKS")
	private Integer jumlahSKS;
	
	@ManyToMany
	private List<Dosen> listDosen = new ArrayList<Dosen>();
}

package com.sufyan97.learn_hibernate.sekolah;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Mapel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "KODE_MAPEL")
	private Long kodeMapel;
	
	@Column(name = "NAMA", length = 100)
	private String nama;

	@OneToMany(mappedBy = "mapel", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<MapelSiswa> mapelSiswaSet = new HashSet<MapelSiswa>();

}

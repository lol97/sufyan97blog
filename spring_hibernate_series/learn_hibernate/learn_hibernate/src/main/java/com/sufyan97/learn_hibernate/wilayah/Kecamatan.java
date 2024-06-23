package com.sufyan97.learn_hibernate.wilayah;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kecamatan {
	@Id
	@Column(name = "CODE_KECAMATAN")
	private String codeKecamatan;
	
	@Column(name = "NAMA")
	private String nama;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_KABUPATEN")
	private Kabupaten kabupaten;
}

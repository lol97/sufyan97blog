package com.sufyan97.learn_hibernate.mahasiswa;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "MAHASISWA")
public class Mahasiswa {
	@Id
	@Column(name = "NPM")
	private BigDecimal NPM;
	
	@Column(name = "NAMA", length = 150)
	private String nama;
	
	@Column(name = "TEMPAT_LAHIR", length = 50)
	private String tempatLahir;
	
	@Column(name = "TANGGAL_LAHIR")
	private Date tanggalLahir;
	
	@OneToOne(mappedBy = "mahasiswa", cascade = CascadeType.ALL, orphanRemoval = true)
	@PrimaryKeyJoinColumn
	private KartuMahasiswa kartuMahasiswa;

	public Mahasiswa() {
		super();
	}

	public Mahasiswa(BigDecimal nPM, String nama, String tempatLahir, Date tanggalLahir) {
		super();
		NPM = nPM;
		this.nama = nama;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
	}

	public BigDecimal getNPM() {
		return NPM;
	}

	public void setNPM(BigDecimal nPM) {
		NPM = nPM;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	public KartuMahasiswa getKartuMahasiswa() {
		return kartuMahasiswa;
	}

	public void setKartuMahasiswa(KartuMahasiswa kartuMahasiswa) {
		this.kartuMahasiswa = kartuMahasiswa;
	}

	@Override
	public String toString() {
		return "Mahasiswa [NPM=" + NPM + ", nama=" + nama + ", tempatLahir=" + tempatLahir + ", tanggalLahir="
				+ tanggalLahir + ", kartuMahasiswa=" + kartuMahasiswa + "]";
	}
}

package com.sufyan97.learn_hibernate.nasabah;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "NASABAH")
public class Nasabah {
	@Id
	@Column(name = "NO_REKENING")
	private BigDecimal noRekening;
	
	@Column(name = "NAMA", length = 150)
	private String nama;
	
	@Column(name = "TEMPAT_LAHIR", length = 50)
	private String tempatLahir;
	
	@Column(name = "TANGGAL_LAHIR")
	private Date tanggalLahir;
	
	@Column(name = "JENIS_NASABAH", length = 50)
	private String jenisNasabah;
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(
		name = "DEBIT_NASABAH",
		joinColumns = {@JoinColumn(name="NO_REKENING", referencedColumnName = "NO_REKENING")},
		inverseJoinColumns = {@JoinColumn(name="NO_KARTU", referencedColumnName = "NO_KARTU")}
	)
	private KartuDebit kartuDebit;

	public Nasabah() {
		super();
	}

	public BigDecimal getNoRekening() {
		return noRekening;
	}

	public void setNoRekening(BigDecimal noRekening) {
		this.noRekening = noRekening;
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

	public String getJenisNasabah() {
		return jenisNasabah;
	}

	public void setJenisNasabah(String jenisNasabah) {
		this.jenisNasabah = jenisNasabah;
	}

	public KartuDebit getKartuDebit() {
		return kartuDebit;
	}

	public void setKartuDebit(KartuDebit kartuDebit) {
		this.kartuDebit = kartuDebit;
	}

	@Override
	public String toString() {
		return "Nasabah [noRekening=" + noRekening + ", nama=" + nama + ", tempatLahir=" + tempatLahir
				+ ", tanggalLahir=" + tanggalLahir + ", jenisNasabah=" + jenisNasabah + ", kartuDebit=" + kartuDebit
				+ "]";
	}
}

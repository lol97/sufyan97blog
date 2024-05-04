package com.sufyan97.learn_hibernate.warganegara;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "WARGA_NEGARA")
public class WargaNegara {
	@Id
	@Column(name = "NIK", length = 16)
	private BigDecimal NIK;
	
	@Column(name = "NAMA_KTP", length = 150)
	private String namaKTP;
	
	@Column(name = "TEMPAT_LAHIR", length = 150)
	private String tempatLahir;
	
	@Column(name = "TANGGAL_LAHIR")
	private Date tanggalLahir;
	
	@OneToOne(mappedBy = "wargaNegara")
	private Paspor paspor;
	
	public WargaNegara() {
		super();
	}
	
	public WargaNegara(BigDecimal nIK, String namaKTP, String tempatLahir, Date tanggalLahir) {
		super();
		NIK = nIK;
		this.namaKTP = namaKTP;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
	}
	public BigDecimal getNIK() {
		return NIK;
	}
	public void setNIK(BigDecimal NIK) {
		this.NIK = NIK;
	}
	public String getNamaKTP() {
		return namaKTP;
	}
	public void setNamaKTP(String namaKTP) {
		this.namaKTP = namaKTP;
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

	public Paspor getPaspor() {
		return paspor;
	}

	public void setPaspor(Paspor paspor) {
		this.paspor = paspor;
	}
	
	
}

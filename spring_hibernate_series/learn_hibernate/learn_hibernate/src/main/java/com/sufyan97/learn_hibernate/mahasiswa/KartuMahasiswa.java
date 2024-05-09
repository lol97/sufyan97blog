package com.sufyan97.learn_hibernate.mahasiswa;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "KARTU_MAHASISWA")
public class KartuMahasiswa {
	@Id
	@Column(name = "NPM")
	private BigDecimal npm;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "NPM")
	private Mahasiswa mahasiswa;
	
	@Column(name = "MASA_BERLAKU")
	private Date masaBerlaku;
	
	@Column(name = "STATUS", length = 50)
	private String status;
	
	public KartuMahasiswa() {
		super();
	}

	public KartuMahasiswa(BigDecimal npm, Mahasiswa mahasiswa, Date masaBerlaku, String status) {
		super();
		this.npm = npm;
		this.mahasiswa = mahasiswa;
		this.masaBerlaku = masaBerlaku;
		this.status = status;
	}

	public BigDecimal getNpm() {
		return npm;
	}

	public void setNpm(BigDecimal npm) {
		this.npm = npm;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public Date getMasaBerlaku() {
		return masaBerlaku;
	}

	public void setMasaBerlaku(Date masaBerlaku) {
		this.masaBerlaku = masaBerlaku;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "KartuMahasiswa [npm=" + npm + ", masaBerlaku=" + masaBerlaku + ", status=" + status + "]";
	}
}

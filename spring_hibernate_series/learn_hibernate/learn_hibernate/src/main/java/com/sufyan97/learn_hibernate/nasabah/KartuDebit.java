package com.sufyan97.learn_hibernate.nasabah;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "KARTU_DEBIT")
public class KartuDebit {
	@Id
	@Column(name = "NO_KARTU")
	private BigDecimal noKartu;
	
	@Column(name = "JENIS", length = 50)
	private String jenis;
	
	@Column(name = "CCV")
	private Integer CCV;
	
	@Column(name = "MASA_BERLAKU")
	private Date masaBerlaku;
	
	@OneToOne(mappedBy = "kartuDebit", cascade = CascadeType.ALL)
	private Nasabah nasabah;

	public KartuDebit() {
		super();
	}
	
	public KartuDebit(BigDecimal noKartu, String jenis, Integer cCV, Date masaBerlaku, Nasabah nasabah) {
		super();
		this.noKartu = noKartu;
		this.jenis = jenis;
		CCV = cCV;
		this.masaBerlaku = masaBerlaku;
		this.nasabah = nasabah;
	}



	public BigDecimal getNoKartu() {
		return noKartu;
	}

	public void setNoKartu(BigDecimal noKartu) {
		this.noKartu = noKartu;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public Integer getCCV() {
		return CCV;
	}

	public void setCCV(Integer cCV) {
		CCV = cCV;
	}

	public Date getMasaBerlaku() {
		return masaBerlaku;
	}

	public void setMasaBerlaku(Date masaBerlaku) {
		this.masaBerlaku = masaBerlaku;
	}

	public Nasabah getNasabah() {
		return nasabah;
	}

	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}

	@Override
	public String toString() {
		return "KartuDebit [noKartu=" + noKartu + ", jenis=" + jenis + ", CCV=" + CCV + ", masaBerlaku=" + masaBerlaku
				+ "]";
	}
}

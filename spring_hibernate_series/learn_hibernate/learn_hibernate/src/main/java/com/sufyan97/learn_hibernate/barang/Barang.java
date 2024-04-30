package com.sufyan97.learn_hibernate.barang;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Barang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAMA")
	private String nama;
	
	@Column(name = "HARGA_SATUAN")
	private BigDecimal hargaSatuan;
	
	@Column(name = "STOCK")
	private BigDecimal stock;

	public Barang(Long id, String nama, BigDecimal hargaSatuan, BigDecimal stock) {
		super();
		this.id = id;
		this.nama = nama;
		this.hargaSatuan = hargaSatuan;
		this.stock = stock;
	}
	
	public Barang(String nama, BigDecimal hargaSatuan, BigDecimal stock) {
		super();
		this.nama = nama;
		this.hargaSatuan = hargaSatuan;
		this.stock = stock;
	}



	public Barang() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public BigDecimal getHargaSatuan() {
		return hargaSatuan;
	}

	public void setHargaSatuan(BigDecimal hargaSatuan) {
		this.hargaSatuan = hargaSatuan;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Barang [id=" + id + ", nama=" + nama + ", hargaSatuan=" + hargaSatuan + ", stock=" + stock + "]";
	}
}

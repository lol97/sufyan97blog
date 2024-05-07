package com.sufyan97.learn_hibernate.warganegara;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PASPOR")
public class Paspor {
	@Id
	private String noPaspor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NIK", referencedColumnName = "NIK_16")
	private WargaNegara wargaNegara;
	
	private Date masaBerlaku;
	private String status;
	public String getNoPaspor() {
		return noPaspor;
	}
	
	public Paspor() {
		super();
	}

	public Paspor(String noPaspor, WargaNegara wargaNegara, Date masaBerlaku, String status) {
		super();
		this.noPaspor = noPaspor;
		this.wargaNegara = wargaNegara;
		this.masaBerlaku = masaBerlaku;
		this.status = status;
	}

	public void setNoPaspor(String noPaspor) {
		this.noPaspor = noPaspor;
	}
	
	public WargaNegara getWargaNegara() {
		return wargaNegara;
	}
	public void setWargaNegara(WargaNegara wargaNegara) {
		this.wargaNegara = wargaNegara;
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
}

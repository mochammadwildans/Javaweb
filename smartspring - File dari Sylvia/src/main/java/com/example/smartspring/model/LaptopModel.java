package com.example.smartspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_LAPTOP")
public class LaptopModel {

	@Id
	@Column(name="SERIAL_NUMBER")
	private Integer serialNumber;
	
	@Column(name="NAMA_LAPTOP")
	private String namaLaptop;
	
	@Column(name="SERI_LAPTOP")
	private String seriLaptop;
	
	@Column(name="SPESIFIKASI")
	private String spesifikasi;
	
	@Column(name="HARGA")
	private Integer harga;
	
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNamaLaptop() {
		return namaLaptop;
	}
	public void setNamaLaptop(String namaLaptop) {
		this.namaLaptop = namaLaptop;
	}
	public String getSeriLaptop() {
		return seriLaptop;
	}
	public void setSeriLaptop(String seriLaptop) {
		this.seriLaptop = seriLaptop;
	}
	public String getSpesifikasi() {
		return spesifikasi;
	}
	public void setSpesifikasi(String spesifikasi) {
		this.spesifikasi = spesifikasi;
	}
	public Integer getHarga() {
		return harga;
	}
	public void setHarga(Integer harga) {
		this.harga = harga;
	}
	
}

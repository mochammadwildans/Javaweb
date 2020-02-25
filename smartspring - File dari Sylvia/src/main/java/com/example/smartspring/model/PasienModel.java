package com.example.smartspring.model;

import java.util.Date; //ini pake yg import util biar Date nya jalan

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_PASIEN")
public class PasienModel {
	
	@Id
	@Column(name="NOMOR_PASIEN")
	private String nomor;
	
	@Column(name="NAMA_PASIEN")
	private String nama;
	
	@Column(name="GENDER_PASIEN")
	private String gender;
	
	@Column(name="KATEGORI_PASIEN")
	private String kategori;
	
	@Column(name="BIAYA_PASIEN")
	private Integer biaya;
	
	@Column(name="TANGGALLAHIR_PASIEN")
	private Date tanggalLahir;
	
	//cara setter dan getter : blok->klik kanan->Source->Generate Setter and Getter
	
	public String getNomor() {
		return nomor;
	}
	public void setNomor(String nomor) {
		this.nomor = nomor;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public Integer getBiaya() {
		return biaya;
	}
	public void setBiaya(Integer biaya) {
		this.biaya = biaya;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	
}

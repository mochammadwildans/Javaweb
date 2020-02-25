package com.example.smartspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_MAHASISWA")
public class MahasiswaModel {

	@Id
	@Column(name="NOMOR_MAHASISWA")
	private String npm;
	
	@Column(name="NAMA_MAHASISWA")
	private String nama;
	
	@Column(name="KELAS_MAHASISWA")
	private String kelas;
	
	@Column(name="SEMESTER_MAHASISWA")
	private Integer semester;
	
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public Integer getSemester() {
		return semester;
	}
	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	
	
}

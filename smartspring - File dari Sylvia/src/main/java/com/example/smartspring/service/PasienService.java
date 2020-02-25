package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.repository.PasienRepository;

@Service
@Transactional
public class PasienService {

	// Autowired untuk koneksi ke class Repository
	@Autowired
	private PasienRepository pasienRepository;

	// method untuk service create
	public void create(PasienModel pasienModel) {
		this.pasienRepository.save(pasienModel);
	}
	
	//method untuk read data
	public List<PasienModel> read(){
		return this.pasienRepository.repoRead(); //ini kalo mau pake query yg ada di repository nah kalo mau select dg kondisi tertentu 
		// kalo mau bikin untuk menampilakn semua data table bisa pake perintah bawaan
		//return this.pasienRepository.findAll();
		/*
		 * menggunakan list krn menggunakan banyak data, kalau datanya kosong pakainya
		 * void jadi kalo creat, delete, update pakai void sedangakan searc dan read
		 * pakai list
		 * klo pakai list hrs di return
		 */
	}
	
	public List<PasienModel> searchNamaPasien(String namaPasien){
		return this.pasienRepository.searchNamaPasien(namaPasien);
	}

	// pola service
	
	// public outpunya apa, namaMethodenya (Tipe inputnya)

}

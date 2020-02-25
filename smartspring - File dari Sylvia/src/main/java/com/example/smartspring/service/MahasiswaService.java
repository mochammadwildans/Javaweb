package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartspring.model.MahasiswaModel;
import com.example.smartspring.repository.MahasiswaRepository;

@Service
@Transactional
public class MahasiswaService {

	@Autowired
	private MahasiswaRepository mahasiswaRepository;
	
	public void create(MahasiswaModel mahasiswaModel) {

		this.mahasiswaRepository.save(mahasiswaModel); //untuk menyimpan data ke mahasiswaModel
	}
	
	public List<MahasiswaModel> read(){
		return this.mahasiswaRepository.repoRead();
	}
	
	public List<MahasiswaModel> searchNamaMahasiswa(String namaMahasiswa){
		return this.mahasiswaRepository.searchNamaMahasiswa(namaMahasiswa);
	}
	
}

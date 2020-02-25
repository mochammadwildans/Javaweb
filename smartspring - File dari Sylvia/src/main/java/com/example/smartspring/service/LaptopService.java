package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartspring.model.LaptopModel;
import com.example.smartspring.repository.LaptopRepository;

@Service
@Transactional
public class LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;
	
	public void create(LaptopModel laptopModel) {

		this.laptopRepository.save(laptopModel);
	}
	

	public List<LaptopModel> read(){
		return this.laptopRepository.repoRead();
	}

	public List<LaptopModel> searchNamaLaptop(String namaLaptop){
		return this.laptopRepository.searchNamaLaptop(namaLaptop);
	}
	
}

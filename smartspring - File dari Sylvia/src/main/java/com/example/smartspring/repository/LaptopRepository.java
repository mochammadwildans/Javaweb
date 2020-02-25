package com.example.smartspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.smartspring.model.LaptopModel;

public interface LaptopRepository extends JpaRepository<LaptopModel, Integer> {

	@Query("select p from LaptopModel p")
	List<LaptopModel> repoRead();
	
	@Query("select p from LaptopModel p where p.namaLaptop like %?1%")
	List<LaptopModel> searchNamaLaptop(String namaLaptop);
	
}

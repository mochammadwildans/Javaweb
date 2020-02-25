package com.example.smartspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.smartspring.model.MahasiswaModel;

public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, String>{

	@Query("select p from MahasiswaModel p")
	List<MahasiswaModel> repoRead();
	
	//persen %...% menujukan jumlah parameter
	@Query("select p from MahasiswaModel p where p.nama like %?1%")
	List<MahasiswaModel> searchNamaMahasiswa(String namaMahasiswa);
}

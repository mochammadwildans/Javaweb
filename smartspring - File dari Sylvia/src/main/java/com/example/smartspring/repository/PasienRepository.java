package com.example.smartspring.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.smartspring.model.PasienModel;

/*JpaRepository<T, ID> --> T=Tabel, ID=Primary Key Tabel tersebut krn si no bertipe data String maka yg dipanggil String*/
public interface PasienRepository extends JpaRepository<PasienModel, String> {

	@Query("select p from PasienModel p")
	List<PasienModel> repoRead();
	
	@Query("select p from PasienModel p where p.nama like %?1%")
	List<PasienModel> searchNamaPasien(String namaPasien);
	//namaPasien ini cmn digunakan di repository sehingga kalo dirubah gak ngefek kemana2
}

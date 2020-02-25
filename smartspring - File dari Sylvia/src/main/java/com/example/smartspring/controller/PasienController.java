package com.example.smartspring.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.service.PasienService;

@Controller
public class PasienController {

	@Autowired
	private PasienService pasienService;
	
	@RequestMapping("/pasien/create")
	public String pasienCreate(HttpServletRequest request, Model model) throws ParseException { /*
							 * HttpServletRequest request digunakan ketika mau mengambil parameter model
							 * untuk mengembalikan
							 */
		String nomor = request.getParameter("nomor");
		String nama = request.getParameter("nama");
		String gender = request.getParameter("gender");
		String kategori = request.getParameter("kategori");
		int biaya = Integer.parseInt(request.getParameter("biaya"));
		
		//Convert tanggal lahir dari String ke Date
		String tanggalLahir = request.getParameter("tanggalLahir");
		System.out.println("tanggalLahir");
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		Date tanggalLahirDate = formatDate.parse(tanggalLahir);
		System.out.println("tanggalLahirDate");
		
		//simpan masing-masing kolom di PasienModel
		PasienModel pasienModel = new PasienModel(); //instance	
		pasienModel.setNomor(nomor);
		pasienModel.setNama(nama);
		pasienModel.setGender(gender);
		pasienModel.setKategori(kategori);
		pasienModel.setBiaya(biaya);
		pasienModel.setTanggalLahir(tanggalLahirDate);
		
		//simpan ke database
		this.pasienService.create(pasienModel);
		//memanggil methode pasienRean yg dibawah tuh agar jalan
		this.pasienRead(model);
		
		String html = "/pasien/data";
		return html;
	}
	
	//method untuk lempar data
	public void pasienRead(Model model) {
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = pasienService.read();
		model.addAttribute("pasienModelList", pasienModelList);
	}
	
	@RequestMapping(value="/pasien/search/nama")
	public String cariNama(HttpServletRequest request, Model model) {
		
		String namaPasien = request.getParameter("cari");
		
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = pasienService.searchNamaPasien(namaPasien);
		model.addAttribute("pasienModelList", pasienModelList);
		String html = "/pasien/data";
		return html;
	}
}

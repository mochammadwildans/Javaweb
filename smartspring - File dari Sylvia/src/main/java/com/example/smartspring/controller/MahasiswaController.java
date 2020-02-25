package com.example.smartspring.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.model.MahasiswaModel;
import com.example.smartspring.service.MahasiswaService;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaService mahasiswaService;
	
	@RequestMapping("/mahasiswa/create")
	public String mahasiswaCreate(HttpServletRequest request, Model model) throws ParseException {
		String npm = request.getParameter("npm");
		String nama = request.getParameter("nama");
		String kelas = request.getParameter("kelas");
		int semester = Integer.parseInt(request.getParameter("semester"));
	
	
	MahasiswaModel mahasiswaModel = new MahasiswaModel();
	mahasiswaModel.setNpm(npm);
	mahasiswaModel.setNama(nama);
	mahasiswaModel.setKelas(kelas);
	mahasiswaModel.setSemester(semester);
	
	this.mahasiswaService.create(mahasiswaModel); //manggil methode create yang ada di mahasiswaService yg nantinya data kesimpan di mahasiswaModel
	this.mahasiswaRead(model);
	
	String html = "/mahasiswa/datamhs";
	return html;
	}
	
	public void mahasiswaRead(Model model) {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.read();
		model.addAttribute("mahasiswaModelList", mahasiswaModelList);
		
	}
	
	@RequestMapping(value="/mahasiswa/search/nama")
	public String cariNama(HttpServletRequest request, Model model) {
		
		String namaMahasiswa = request.getParameter("cari");
		
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.searchNamaMahasiswa(namaMahasiswa);
		model.addAttribute("mahasiswaModelList", mahasiswaModelList);
		
		String html = "/mahasiswa/datamhs";
		return html;
	}
}
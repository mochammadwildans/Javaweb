package com.example.smartspring.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.model.LaptopModel;
import com.example.smartspring.service.LaptopService;


@Controller
public class LaptopController {

	@Autowired
	private LaptopService laptopService;
	
	@RequestMapping("/laptop/create")
	public String laptopCreate(HttpServletRequest request, Model model) throws ParseException {
		int serialNumber = Integer.parseInt(request.getParameter("serialNumber"));
		String namaLaptop = request.getParameter("namaLaptop");
		String seriLaptop = request.getParameter("seriLaptop");
		String spesifikasi = request.getParameter("spesifikasi");
		int harga = Integer.parseInt(request.getParameter("harga"));
		
		LaptopModel laptopModel = new LaptopModel();
		laptopModel.setSerialNumber(serialNumber);
		laptopModel.setNamaLaptop(namaLaptop);
		laptopModel.setSeriLaptop(seriLaptop);
		laptopModel.setSpesifikasi(spesifikasi);
		laptopModel.setHarga(harga);
		
		this.laptopService.create(laptopModel); //manggil methode create yang ada di mahasiswaService yg nantinya data kesimpan di mahasiswaModel
		this.laptopRead(model);
		
		String html = "/laptop/datalaptop";
		return html;
	}
	
	public void laptopRead(Model model) {
		List<LaptopModel> laptopModelList = new ArrayList<LaptopModel>();
		laptopModelList = laptopService.read();
		model.addAttribute("laptopModelList", laptopModelList);
		
	}
	
	@RequestMapping(value="/laptop/search/nama")
	public String cariNama(HttpServletRequest request, Model model) {
		
		String namaLaptop = request.getParameter("cari");
		
		List<LaptopModel> laptopModelList = new ArrayList<LaptopModel>();
		laptopModelList = laptopService.searchNamaLaptop(namaLaptop);
		model.addAttribute("laptopModelList", laptopModelList);
		
		String html = "/laptop/datalaptop";
		return html;
	}
}

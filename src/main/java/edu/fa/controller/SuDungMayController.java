package edu.fa.controller;

import edu.fa.dto.SuDungMayDTO;
import edu.fa.model.KhachHang;
import edu.fa.model.May;
import edu.fa.model.SuDungMay;
import edu.fa.model.SuDungMayId;
import edu.fa.service.KhachHangService;
import edu.fa.service.MayService;
import edu.fa.service.SuDungMayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/useComputer")
public class SuDungMayController {
	@Autowired
	private KhachHangService khachHangService;

	@Autowired
	private MayService mayService;

	@Autowired
	private SuDungMayService suDungMayService;
	
	@GetMapping("/list")
	private String listSuDungMayForm(ModelMap modelMap) {
		Iterable<SuDungMay> suDungMays = suDungMayService.getAllSuDungMays();
		modelMap.addAttribute("suDungMays", suDungMays);
		
		Iterable<KhachHang> khachHang = khachHangService.getAllKhachHangs();
		modelMap.addAttribute("khachHangs", khachHang);

		return "use-computer";
	}

	@GetMapping("/add")
	private String addSuDungMayForm(ModelMap modelMap) {
		Iterable<KhachHang> khachHangs = khachHangService.getAllKhachHangs();
		Iterable<May> mays = mayService.getAllMays();

		modelMap.addAttribute("khachHangs", khachHangs);
		modelMap.addAttribute("mays", mays);
		modelMap.addAttribute("suDungMay", new SuDungMayDTO());

		return "add-useComputer";
	}

	@PostMapping("/add")
	private String addSuDungMay(@ModelAttribute("addUseComputer") SuDungMayDTO suDungMayDTO) {
		System.out.println(suDungMayDTO.getNgayBatDauSuDung() + " : " + suDungMayDTO.getGioBatDauSuDung());
		SuDungMayId suDungMayId = new SuDungMayId(suDungMayDTO.getMaKH(), suDungMayDTO.getMaMay(),
				suDungMayDTO.getNgayBatDauSuDung(), suDungMayDTO.getGioBatDauSuDung());
		
		Optional<KhachHang> khachHangOptional = khachHangService.getKhachHangById(suDungMayDTO.getMaKH());
		Optional<May> mayOptional = mayService.getMayById(suDungMayDTO.getMaMay());
		
		KhachHang khachHang = khachHangOptional.get();
		May may = mayOptional.get();

		SuDungMay suDungMay = new SuDungMay(suDungMayId, khachHang, may, suDungMayDTO.getThoiGianSuDung());

		suDungMayService.addSuDungMay(suDungMay);

		return "redirect:/useComputer/list";
	}
}

package edu.fa.controller;

import edu.fa.model.KhachHang;
import edu.fa.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/list")
    public String listKhachHangs(ModelMap modelMap){
        Iterable<KhachHang> khachHangs = khachHangService.getAllKhachHangs();
        modelMap.addAttribute("khachHangs",khachHangs);
        return "list-customer";
    }

    @GetMapping("/add")
    public String addKhachHangForm(ModelMap modelMap){
        modelMap.addAttribute("khachHang", new KhachHang());
        return "add-customer";
    }

    @PostMapping("/add")
    public String addKhachHang(@ModelAttribute KhachHang khachHang){
        khachHangService.addKhachHang(khachHang);
        return "redirect:/customer/list";
    }

    @GetMapping("/update")
    public String updateKhachHangForm(@RequestParam int maKH, ModelMap modelMap){
        Optional<KhachHang> khachHang = khachHangService.getKhachHangById(maKH);

        if(!khachHang.isPresent()){
            return "redirect:/customer/list";
        }
        modelMap.addAttribute("khachHang", khachHang.get());
        return "update-customer";
    }

    @PostMapping("/update")
    public String updateKhachHang(@ModelAttribute("khachHang") KhachHang khachHang){
        Optional<KhachHang> existingKhachHang = khachHangService.getKhachHangById(khachHang.getMaKH());

        if(!existingKhachHang.isPresent()){
            return "redirect:/customer/list";
        }
        KhachHang updateKhachHang = existingKhachHang.get();
        updateKhachHang.setMaKH(khachHang.getMaKH());
        updateKhachHang.setTenKH(khachHang.getTenKH());
        updateKhachHang.setDiaChi(khachHang.getDiaChi());
        updateKhachHang.setSoDienThoai(khachHang.getSoDienThoai());
        updateKhachHang.setDiaChiEmail(khachHang.getDiaChiEmail());
        khachHangService.updateKhachHang(updateKhachHang);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String deleteKhachHangForm(@RequestParam int maKH){
        khachHangService.deleteKhachHang(maKH);
        return "redirect:/customer/list";
    }
}

package edu.fa.controller;

import edu.fa.model.DichVu;
import edu.fa.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/service")
public class DichVuController {
    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/list")
    public String listDichVus(ModelMap modelMap){
        Iterable<DichVu> dichVus = dichVuService.getAllDichVus();
        modelMap.addAttribute("dichVus",dichVus);
        return "list-service";
    }

    @GetMapping("/add")
    public String addDichVuForm(ModelMap modelMap){
        modelMap.addAttribute("dichVu", new DichVu());
        return "add-service";
    }

    @PostMapping("/add")
    public String addDichVu(@ModelAttribute DichVu dichVu){
        dichVuService.addDichVu(dichVu);
        return "redirect:/service/list";
    }

    @GetMapping("/update")
    public String updateDichVuForm(@RequestParam int maDV, ModelMap modelMap){
        Optional<DichVu> dichVu = dichVuService.getDichVuById(maDV);

        if(!dichVu.isPresent()){
            return "redirect:/service/list";
        }
        modelMap.addAttribute("dichVu", dichVu.get());
        return "update-service";
    }

    @PostMapping("/update")
    public String updateDichVu(@ModelAttribute("dichVu") DichVu dichVu){
        Optional<DichVu> existingDichVu = dichVuService.getDichVuById(dichVu.getMaDV());

        if(!existingDichVu.isPresent()){
            return "redirect:/service/list";
        }

        DichVu updateDichVu = existingDichVu.get();
        updateDichVu.setMaDV(dichVu.getMaDV());
        updateDichVu.setTenDV(dichVu.getTenDV());
        updateDichVu.setDonGia(dichVu.getDonGia());
        updateDichVu.setDonViTinh(dichVu.getDonViTinh());
        dichVuService.updateDichVu(updateDichVu);
        return "redirect:/service/list";
    }

    @GetMapping("/delete")
    public String deleteDichVuForm(@RequestParam int maDV){
        dichVuService.deleteDichVu(maDV);
        return "redirect:/service/list";
    }
}

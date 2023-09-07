package edu.fa.controller;

import edu.fa.model.May;
import edu.fa.service.MayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/computer")
public class MayController {
    @Autowired
    private MayService mayService;

    @GetMapping("/list")
    public String listMays(ModelMap modelMap){
        Iterable<May> mays =  mayService.getAllMays();
        modelMap.addAttribute("mays", mays);
        return "list-computer";
    }

//    @GetMapping("/list")
//    public String listMays(@RequestParam(defaultValue = "0") int page, ModelMap modelMap){
//        int pageSize = 10;
//
//        Pageable pageable = PageRequest.of(page,pageSize);
//        Page<May> maysPage = mayRepository.findAll(pageable);
//
//        modelMap.addAttribute("mays", maysPage.getContent());
//        modelMap.addAttribute("currentPage", page);
//        modelMap.addAttribute("totalPages", maysPage.getTotalPages());
//        return "list-computer";
//    }

    @GetMapping("/add")
    public String addMayForm(ModelMap modelMap){
        modelMap.addAttribute("may", new May());
        return "add-computer";
    }

    @PostMapping("/add")
    public String addMay(@ModelAttribute May may){
        mayService.addMay(may);
        return "redirect:/computer/list";
    }

    @GetMapping("/update")
    public String updateMayForm(@RequestParam int maMay, ModelMap modelMap){
        Optional<May> may = mayService.getMayById(maMay);

        if(!may.isPresent()){
            return "redirect:/computer/list";
        }

        modelMap.addAttribute("may", may.get());
        return "update-computer";
    }

    @PostMapping("/update")
    public String updateMay(@ModelAttribute("may") May may){
        Optional<May> existingMay = mayService.getMayById(may.getMaMay());

        if(!existingMay.isPresent()){
            return "redirect:/computer/list";
        }

        May updateMay = existingMay.get();

        updateMay.setMaMay(may.getMaMay());
        updateMay.setTrangThai(may.getTrangThai());
        updateMay.setViTri(may.getViTri());
        mayService.updateMay(updateMay);
        return "redirect:/computer/list";
    }

    @GetMapping("/delete")
    public String deleteMayForm(@RequestParam int maMay){
        mayService.deleteMay(maMay);
        return "redirect:/computer/list";
    }
}

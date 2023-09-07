package edu.fa.controller;

import edu.fa.model.DichVu;
import edu.fa.model.KhachHang;
import edu.fa.service.DichVuService;
import edu.fa.service.KhachHangService;
import edu.fa.service.SuDungDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/useService")
public class SuDungDichVuController {
    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private DichVuService dichVuService;

    @Autowired
    private SuDungDichVuService suDungDichVuService;

    @GetMapping("/list")
    private String listSuDungDichVuForm(ModelMap modelMap) {
        Iterable<KhachHang> khachHangs = khachHangService.getAllKhachHangs();
        modelMap.addAttribute("khachHangs", khachHangs);

        return "use-service";
    }

    @GetMapping("/add")
    private String addSuDungDichVuForm(ModelMap modelMap) {
        return "add-useService";
    }
}

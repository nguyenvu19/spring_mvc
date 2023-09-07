package edu.fa.service.impl;

import edu.fa.model.KhachHang;
import edu.fa.repository.KhachHangRepository;
import edu.fa.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public Iterable<KhachHang> getAllKhachHangs() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang addKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang updateKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void deleteKhachHang(int maKH) {
        khachHangRepository.deleteById(maKH);
    }

    @Override
    public Optional<KhachHang> getKhachHangById(int maKH) {
        return khachHangRepository.findById(maKH);
    }
}

package edu.fa.service;

import edu.fa.model.KhachHang;

import java.util.Optional;

public interface KhachHangService {
    Iterable<KhachHang> getAllKhachHangs();
    KhachHang addKhachHang(KhachHang khachHang);
    KhachHang updateKhachHang(KhachHang khachHang);
    void deleteKhachHang(int maKH);
    Optional<KhachHang> getKhachHangById(int maKH);
}

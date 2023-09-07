package edu.fa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private int maKH;

    @Column(name="TenKH")
    private String tenKH;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="SoDienThoai")
    private String soDienThoai;

    @Column(name="DiaChiEmail")
    private String diaChiEmail;

    @OneToMany(mappedBy = "khachHang",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SuDungMay> suDungMays;

    @OneToMany(mappedBy = "khachHang",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SuDungDichVu> suDungDichVus;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail, List<SuDungMay> suDungMays, List<SuDungDichVu> suDungDichVus) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.diaChiEmail = diaChiEmail;
        this.suDungMays = suDungMays;
        this.suDungDichVus = suDungDichVus;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChiEmail() {
        return diaChiEmail;
    }

    public void setDiaChiEmail(String diaChiEmail) {
        this.diaChiEmail = diaChiEmail;
    }

    public List<SuDungMay> getSuDungMays() {
        return suDungMays;
    }

    public void setSuDungMays(List<SuDungMay> suDungMays) {
        this.suDungMays = suDungMays;
    }

    public List<SuDungDichVu> getSuDungDichVus() {
        return suDungDichVus;
    }

    public void setSuDungDichVus(List<SuDungDichVu> suDungDichVus) {
        this.suDungDichVus = suDungDichVus;
    }
}

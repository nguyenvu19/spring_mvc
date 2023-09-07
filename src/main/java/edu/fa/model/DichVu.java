package edu.fa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DichVu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDV")
    private int maDV;

    @Column(name = "TenDV")
    private String tenDV;

    @Column(name = "DonViTinh")
    private String donViTinh;

    @Column(name = "DonGia")
    private String donGia;

    @OneToMany(mappedBy = "dichVu", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SuDungDichVu> suDungDichVus;

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public Set<SuDungDichVu> getSuDungDichVus() {
        return suDungDichVus;
    }

    public void setSuDungDichVus(Set<SuDungDichVu> suDungDichVus) {
        this.suDungDichVus = suDungDichVus;
    }
}

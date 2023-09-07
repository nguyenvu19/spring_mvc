package edu.fa.model;

import javax.persistence.*;

@Entity
@Table(name = "SuDungDichVu")
public class SuDungDichVu {
    @EmbeddedId
    private SuDungDichVuId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("maKH")
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("maDV")
    @JoinColumn(name = "MaDV", referencedColumnName = "MaDV")
    private DichVu dichVu;

    @Column(name = "SoLuong")
    private int soLuong;

    public SuDungDichVu() {
    }

    public SuDungDichVu(SuDungDichVuId id, KhachHang khachHang, DichVu dichVu, int soLuong) {
        this.id = id;
        this.khachHang = khachHang;
        this.dichVu = dichVu;
        this.soLuong = soLuong;
    }

    public SuDungDichVuId getId() {
        return id;
    }

    public void setId(SuDungDichVuId id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

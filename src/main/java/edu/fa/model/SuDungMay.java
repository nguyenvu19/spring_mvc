package edu.fa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SuDungMay")
public class SuDungMay {
    @EmbeddedId
    private SuDungMayId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("maKH")
    @JoinColumn(name = "MaKH",referencedColumnName = "MaKH")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("maMay")
    @JoinColumn(name = "MaMay",referencedColumnName = "MaMay")
    private May may;

    @Column(name = "ThoiGianSuDung")
    private int thoiGianSuDung;

    public SuDungMay() {
    }

    public SuDungMay(SuDungMayId id, KhachHang khachHang, May may, int thoiGianSuDung) {
        this.id = id;
        this.khachHang = khachHang;
        this.may = may;
        this.thoiGianSuDung = thoiGianSuDung;
    }

    public SuDungMayId getId() {
        return id;
    }

    public void setId(SuDungMayId id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public May getMay() {
        return may;
    }

    public void setMay(May may) {
        this.may = may;
    }

    public int getThoiGianSuDung() {
        return thoiGianSuDung;
    }

    public void setThoiGianSuDung(int thoiGianSuDung) {
        this.thoiGianSuDung = thoiGianSuDung;
    }
}

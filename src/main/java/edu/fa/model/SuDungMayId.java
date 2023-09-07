package edu.fa.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
public class SuDungMayId implements Serializable {
    @Column(name = "MaKH")
    private int maKH;

    @Column(name = "MaMay")
    private int maMay;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "NgayBatDauSuDung")
    private LocalDate ngayBatDauSuDung;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "GioBatDauSuDung")
    private LocalTime gioBatDauSuDung;

    public SuDungMayId() {
    }

    public SuDungMayId(int maKH, int maMay, LocalDate ngayBatDauSuDung, LocalTime gioBatDauSuDung) {
        this.maKH = maKH;
        this.maMay = maMay;
        this.ngayBatDauSuDung = ngayBatDauSuDung;
        this.gioBatDauSuDung = gioBatDauSuDung;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public LocalDate getNgayBatDauSuDung() {
        return ngayBatDauSuDung;
    }

    public void setNgayBatDauSuDung(LocalDate ngayBatDauSuDung) {
        this.ngayBatDauSuDung = ngayBatDauSuDung;
    }

    public LocalTime getGioBatDauSuDung() {
        return gioBatDauSuDung;
    }

    public void setGioBatDauSuDung(LocalTime gioBatDauSuDung) {
        this.gioBatDauSuDung = gioBatDauSuDung;
    }
}

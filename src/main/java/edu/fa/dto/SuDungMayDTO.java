package edu.fa.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class SuDungMayDTO {
	private int maKH;
	private int maMay;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayBatDauSuDung;
    @DateTimeFormat(pattern = "HH:mm")
	private LocalTime gioBatDauSuDung;
	private int thoiGianSuDung;
	
	public SuDungMayDTO() {
		super();
	}
	

	public int getMaKH() {
		return maKH;
	}
	public SuDungMayDTO(int maKH, int maMay, LocalDate ngayBatDauSuDung, LocalTime gioBatDauSuDung,
			int thoiGianSuDung) {
		super();
		this.maKH = maKH;
		this.maMay = maMay;
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.gioBatDauSuDung = gioBatDauSuDung;
		this.thoiGianSuDung = thoiGianSuDung;
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
	public int getThoiGianSuDung() {
		return thoiGianSuDung;
	}
	public void setThoiGianSuDung(int thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}
}

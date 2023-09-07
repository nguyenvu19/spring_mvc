package edu.fa.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class SuDungDichVuDTO {
	private int maKH;
	private int maDV;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySuDung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime gioSuDung;
	private int soLuong;
	public SuDungDichVuDTO() {
		super();
	}
	public SuDungDichVuDTO(int maKH, int maDV, LocalDate ngaySuDung, LocalTime gioSuDung, int soLuong) {
		super();
		this.maKH = maKH;
		this.maDV = maDV;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
		this.soLuong = soLuong;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public int getMaDV() {
		return maDV;
	}
	public void setMaDV(int maDV) {
		this.maDV = maDV;
	}
	public LocalDate getNgaySuDung() {
		return ngaySuDung;
	}
	public void setNgaySuDung(LocalDate ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	public LocalTime getGioSuDung() {
		return gioSuDung;
	}
	public void setGioSuDung(LocalTime gioSuDung) {
		this.gioSuDung = gioSuDung;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}

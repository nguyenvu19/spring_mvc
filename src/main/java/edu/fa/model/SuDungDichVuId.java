package edu.fa.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;

@Embeddable
public class SuDungDichVuId implements Serializable {
	@Column(name = "MaKH")
	private int maKH;

	@Column(name = "MaDV")
	private int maDV;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "NgaySuDung")
	private LocalDate ngaySuDung;

	@DateTimeFormat(pattern = "HH:mm")
	@Column(name = "GioSuDung")
	private LocalTime gioSuDung;

	public SuDungDichVuId() {
	}

	public SuDungDichVuId(int maKH, int maDV, LocalDate ngaySuDung, LocalTime gioSuDung) {
		this.maKH = maKH;
		this.maDV = maDV;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gioSuDung == null) ? 0 : gioSuDung.hashCode());
		result = prime * result + maDV;
		result = prime * result + maKH;
		result = prime * result + ((ngaySuDung == null) ? 0 : ngaySuDung.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuDungDichVuId other = (SuDungDichVuId) obj;
		if (gioSuDung == null) {
			if (other.gioSuDung != null)
				return false;
		} else if (!gioSuDung.equals(other.gioSuDung))
			return false;
		if (maDV != other.maDV)
			return false;
		if (maKH != other.maKH)
			return false;
		if (ngaySuDung == null) {
			if (other.ngaySuDung != null)
				return false;
		} else if (!ngaySuDung.equals(other.ngaySuDung))
			return false;
		return true;
	}
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((gioBatDauSD == null) ? 0 : gioBatDauSD.hashCode());
//        result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
//        result = prime * result + ((maMay == null) ? 0 : maMay.hashCode());
//        result = prime * result + ((ngayBatDauSD == null) ? 0 : ngayBatDauSD.hashCode());
//        return result;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        SuDungMayID other = (SuDungMayID) obj;
//        if (gioBatDauSD == null) {
//            if (other.gioBatDauSD != null)
//                return false;
//        } else if (!gioBatDauSD.equals(other.gioBatDauSD))
//            return false;
//        if (maKH == null) {
//            if (other.maKH != null)
//                return false;
//        } else if (!maKH.equals(other.maKH))
//            return false;
//        if (maMay == null) {
//            if (other.maMay != null)
//                return false;
//        } else if (!maMay.equals(other.maMay))
//            return false;
//        if (ngayBatDauSD == null) {
//            if (other.ngayBatDauSD != null)
//                return false;
//        } else if (!ngayBatDauSD.equals(other.ngayBatDauSD))
//            return false;
//        return true;
//    }
}

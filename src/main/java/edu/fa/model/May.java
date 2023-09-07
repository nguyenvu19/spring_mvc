package edu.fa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "May")
public class May {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaMay")
    private int maMay;

    @Column(name = "ViTri")
    private String viTri;

    @Column(name = "TrangThai")
    private String trangThai;

    @OneToMany(mappedBy = "may", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SuDungMay> suDungMays;

    public May() {
    }

    public May(int maMay, String viTri, String trangThai, Set<SuDungMay> suDungMays) {
        this.maMay = maMay;
        this.viTri = viTri;
        this.trangThai = trangThai;
        this.suDungMays = suDungMays;
    }

    public Set<SuDungMay> getSuDungMays() {
        return suDungMays;
    }

    public void setSuDungMays(Set<SuDungMay> suDungMays) {
        this.suDungMays = suDungMays;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}

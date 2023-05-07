/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class PhieuMuon {
    private String maPhieu, maDocGia, maSach, maNhanVien;
    private int soLuong;
    private LocalDate ngayMuon, ngayTra;
    private int tonTai;

    //Constructor
    public PhieuMuon(String maPhieu, String maDocGia, String maSach, String maNhanVien, int soLuong, LocalDate ngayMuon,
            LocalDate ngayTra, int tonTai) {
        this.maPhieu = maPhieu;
        this.maDocGia = maDocGia;
        this.maSach = maSach;
        this.maNhanVien = maNhanVien;
        this.soLuong = soLuong;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.tonTai = tonTai;
    }

    public PhieuMuon() {
    }

    //Setter & getter
    public String getMaPhieu() {
        return maPhieu;
    }
    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    public String getMaDocGia() {
        return maDocGia;
    }
    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public LocalDate getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }
    public LocalDate getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }
    public int isTonTai() {
        return tonTai;
    }
    public void setTonTai(int tonTai) {
        this.tonTai = tonTai;
    }
     public String toString() {
        return "{" +
            " maPhieu='" + getMaPhieu() + "'" +
            ", maDocGia='" + getMaDocGia() + "'" +
            ", maSach='" + getMaSach() + "'" +
            ", maNhanVien='" + getMaNhanVien() + "'" +
            ", soLuong='" + getSoLuong() + "'" +
            ", ngayMuon='" + getNgayMuon() + "'" +
            ", ngayTra='" + getNgayTra() + "'" +
            ", tonTai='" + isTonTai() + "'" +
            "}";
    }
}


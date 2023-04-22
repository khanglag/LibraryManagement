/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class PhieuTra {
    private String maPhieu, maSach, maDocGia, maNhanVien, tinhTrang;
    private LocalDate ngayTra;
    private int soNgayQuaHan;
    private boolean tonTai;

    //Constructor
    public PhieuTra() {
    }
    public PhieuTra(String maPhieu, String maSach, String maDocGia, String maNhanVien, String tinhTrang,
            LocalDate ngayTra, int soNgayQuaHan, boolean tonTai) {
        this.maPhieu = maPhieu;
        this.maSach = maSach;
        this.maDocGia = maDocGia;
        this.maNhanVien = maNhanVien;
        this.tinhTrang = tinhTrang;
        this.ngayTra = ngayTra;
        this.soNgayQuaHan = soNgayQuaHan;
        this.tonTai = tonTai;
    }

    //Setter & getter
    public String getMaPhieu() {
        return maPhieu;
    }
    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getMaDocGia() {
        return maDocGia;
    }
    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public LocalDate getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }
    public int getSoNgayQuaHan() {
        return soNgayQuaHan;
    }
    public void setSoNgayQuaHan(int soNgayQuaHan) {
        this.soNgayQuaHan = soNgayQuaHan;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}

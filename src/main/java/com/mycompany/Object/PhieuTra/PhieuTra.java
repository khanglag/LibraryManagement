/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.PhieuTra;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class PhieuTra {
    private String maPhieu, maPhieuMuon, maDocGia, maSach, maNhanVien, tinhTrang;
    private LocalDate ngayTra, hanTra;
    private int soNgayQuaHan, soLuong;

    private int tonTai;

    // Constructor
    public PhieuTra() {
    }

    public PhieuTra(String maPhieu, String maPhieuMuon,
            String maDocGia, String maSach, String maNhanVien,
            LocalDate hanTra, LocalDate ngayTra, int soLuong, String tinhTrang,
            int soNgayQuaHan, int tonTai) {
        this.maPhieu = maPhieu;
        this.maPhieuMuon = maPhieuMuon;
        this.maDocGia = maDocGia;
        this.maSach = maSach;
        this.maNhanVien = maNhanVien;
        this.hanTra = hanTra;
        this.ngayTra = ngayTra;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.soNgayQuaHan = soNgayQuaHan;
        this.tonTai = tonTai;
    }

    public PhieuTra(String maPhieu, String maPhieuMuon,
            String maDocGia, String maSach, String maNhanVien,
            LocalDate hanTra, LocalDate ngayTra, int soLuong, String tinhTrang,
            int soNgayQuaHan) {
        this.maPhieu = maPhieu;
        this.maPhieuMuon = maPhieuMuon;
        this.maDocGia = maDocGia;
        this.maSach = maSach;
        this.maNhanVien = maNhanVien;
        this.hanTra = hanTra;
        this.ngayTra = ngayTra;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.soNgayQuaHan = soNgayQuaHan;

    }

    public LocalDate getHanTra() {
        return hanTra;
    }

    public void setHanTra(LocalDate hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
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

    public int getTonTai() {
        return tonTai;
    }

    public void setTonTai(int tonTai) {
        this.tonTai = tonTai;
    }

}

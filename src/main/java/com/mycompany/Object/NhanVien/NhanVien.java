/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.NhanVien;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class NhanVien {
    private String maNhanVien, tenNhanVien, gioiTinh, chungMinhThu, diaChi, soDienThoai, maPQ,tenpq,tendn,matkhau;
    private LocalDate ngaySinh;
    private boolean tonTai;

    //Constructor
    public NhanVien(String maNhanVien, String tenNhanVien, String gioiTinh, String chungMinhThu, String diaChi,
            String soDienThoai, String maPQ, LocalDate ngaySinh, boolean tonTai) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = chungMinhThu;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maPQ = maPQ;
        this.ngaySinh = ngaySinh;
        this.tonTai = tonTai;
    }

    public NhanVien() {
    }

    public NhanVien(String maNhanVien,String maPQ, String tenqp, String tendn, String matkhau) {
        this.maNhanVien = maNhanVien;
        this.maPQ = maPQ;
        this.tenpq = tenqp;
        this.tendn = tendn;
        this.matkhau = matkhau;
    }

    
    public String getTenpq() {
        return tenpq;
    }

    public void setTenpq(String tenqp) {
        this.tenpq = tenpq;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    
    

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    
    //Setter & getter
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getChungMinhThu() {
        return chungMinhThu;
    }
    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getMaPQ() {
        return maPQ;
    }
    public void setMaPQ(String maPQ) {
        this.maPQ = maPQ;
    }
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}


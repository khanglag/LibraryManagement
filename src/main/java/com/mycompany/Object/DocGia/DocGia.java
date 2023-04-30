/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class DocGia {
    private String maDocGia, tenDocGia, gioiTinh, soDienThoai, diaChi, maPQ;
    private LocalDate ngaySinh;
    private boolean tonTai;

    //Constructor
    public DocGia(String maDocGia, String tenDocGia, String gioiTinh, String soDienThoai, String diaChi, String maPQ,
            LocalDate ngaySinh,
            boolean tonTai) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.maPQ = maPQ;
        this.ngaySinh = ngaySinh;
        this.tonTai = tonTai;
    }

    public DocGia() {
    }

    //Setter & getter
    public String getMaDocGia() {
        return maDocGia;
    }
    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }
    public String getTenDocGia() {
        return tenDocGia;
    }
    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
    public String toString(){
        return "{" +
            " maDocGia='" + getMaDocGia() + "'" +
            ", tenDocGia='" + getTenDocGia() + "'" +
            ", gioiTinh='" + getGioiTinh() + "'" +
            ", soDienThoai='" + getSoDienThoai() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            ", ngaySinh='" + getNgaySinh() + "'" +
            ", tonTai='" + isTonTai() + "'" +
            "}";
    }
}


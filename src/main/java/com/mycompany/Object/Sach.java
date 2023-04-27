/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object;

/**
 *
 * @author pc
 */
public class Sach {
    private String maSach, tenSach, tinhTrang, maTheLoai, maTacGia, maNXB,anh;
    private int soTrang, lanXuatBan, soLuong;
    private float gia;
    private boolean tonTai;

    //Constructor
    public Sach(String maSach, String tenSach, String tinhTrang, String maTheLoai, String maTacGia, String maNXB,
            int soTrang, int lanXuatBan, int soLuong, float gia, boolean tonTai,String anh) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tinhTrang = tinhTrang;
        this.maTheLoai = maTheLoai;
        this.maTacGia = maTacGia;
        this.maNXB = maNXB;
        this.soTrang = soTrang;
        this.lanXuatBan = lanXuatBan;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tonTai = tonTai;
        this.anh=anh;
    }

    public Sach(String maSach, String tenSach, String tinhTrang, String maTheLoai, String maTacGia, String maNXB, int soTrang, int lanXuatBan, int soLuong, float gia, String anh) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tinhTrang = tinhTrang;
        this.maTheLoai = maTheLoai;
        this.maTacGia = maTacGia;
        this.maNXB = maNXB;
        this.soTrang = soTrang;
        this.lanXuatBan = lanXuatBan;
        this.soLuong = soLuong;
        this.gia = gia;
        this.anh = anh;
    }

    
    public Sach() {
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    

    //Setter & getter
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public String getMaTheLoai() {
        return maTheLoai;
    }
    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
    public String getMaTacGia() {
        return maTacGia;
    }
    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }
    public int getSoTrang() {
        return soTrang;
    }
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public int getLanXuatBan() {
        return lanXuatBan;
    }
    public void setLanXuatBan(int lanXuatBan) {
        this.lanXuatBan = lanXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public float getGia() {
        return gia;
    }
    public void setGia(float gia) {
        this.gia = gia;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheThuVien;

import java.time.LocalDate;

/**
 *
 * @author khang
 */
public class TheThuVien {
    private String maThe, maDocGia, tenDocGia;
    private LocalDate ngayCap, han;
    private int tonTai;

    public TheThuVien() {
    }

    public TheThuVien(String maThe, String maDocGia, String tenDocGia, LocalDate ngayCap, LocalDate han, int tonTai) {
        this.maThe = maThe;
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.ngayCap = ngayCap;
        this.han = han;
        this.tonTai = tonTai;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

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

    public LocalDate getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(LocalDate ngayCap) {
        this.ngayCap = ngayCap;
    }

    public LocalDate getHan() {
        return han;
    }

    public void setHan(LocalDate han) {
        this.han = han;
    }

    public int getTonTai() {
        return tonTai;
    }

    public void setTonTai(int tonTai) {
        this.tonTai = tonTai;
    }

}

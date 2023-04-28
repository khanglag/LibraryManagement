/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TacGia;

/**
 *
 * @author pc
 */
import java.time.LocalDate;

public class TacGia {
    private String maTacGia, tenTacGia, gioiTinh;
    private LocalDate ngaySinh;
    private boolean tonTai;

    //Constructor
    public TacGia(String maTacGia, String tenTacGia, String gioiTinh, LocalDate ngaySinh, boolean tonTai) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.tonTai = tonTai;
    }

    public TacGia() {
    }

    //Setter & getter
    public String getMaTacGia() {
        return maTacGia;
    }
    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }
    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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

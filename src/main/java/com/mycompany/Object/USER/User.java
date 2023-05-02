/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import java.time.LocalDate;

/*
 *
 * @author khang
 */
public class User {

    private String maUser, tenUser, gioiTinh, chungMinhThu, diaChi, soDienThoai, maPQ;
    private LocalDate ngaySinh;

    public User(String maUser, String tenUser, String gioiTinh, String chungMinhThu, String diaChi, String soDienThoai, String maPQ, LocalDate ngaySinh) {
        this.maUser = maUser;
        this.tenUser = tenUser;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = chungMinhThu;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maPQ = maPQ;
        this.ngaySinh = ngaySinh;
    }

    public String getMaUser() {
        return maUser;
    }

    public void setMaUser(String maUser) {
        this.maUser = maUser;
    }

    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
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
    

}

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

    private String maUser, tenUser, gioiTinh, chungMinhThu, diaChi, soDienThoai;
    private LocalDate ngaySinh;

    public User(String maUser, String tenUser, String gioiTinh, LocalDate ngaySinh, String chungMinhThu, String diaChi, String soDienThoai) {
        this.maUser = maUser;
        this.tenUser = tenUser;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.chungMinhThu = chungMinhThu;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        
        
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



    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    

}

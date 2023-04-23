/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object;

/**
 *
 * @author pc
 */
public class TaiKhoan {
    private String tenDangNhap, matKhau,quyen;
    
    private boolean tonTai;

    //Constructor
    public TaiKhoan(String tenDangNhap, String matKhau,String quyen, boolean tonTai) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyen=quyen;
        this.tonTai = tonTai;
    }
    public TaiKhoan() {
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    //Setter & getter
    public String getTenDangNhap() {
        return tenDangNhap;
    }
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }
    public String getMatKhau() {
        return matKhau;
    }
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}

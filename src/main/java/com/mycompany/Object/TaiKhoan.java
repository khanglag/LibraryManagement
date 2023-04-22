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
    private String tenDangNhap, matKhau;
    private boolean tonTai;

    //Constructor
    public TaiKhoan(String tenDangNhap, String matKhau, boolean tonTai) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.tonTai = tonTai;
    }
    public TaiKhoan() {
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

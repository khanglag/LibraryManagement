/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.NhaXuatBan;

/**
 *
 * @author pc
 */
public class NhaXuatBan {
    private String maNXB, tenNXB;
    private boolean tonTai;

    //Constructor
    public NhaXuatBan(String maNXB, String tenNXB, boolean tonTai) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.tonTai = tonTai;
    }

    public NhaXuatBan() {
    }

    //Setter & getter
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }
    public String getTenNXB() {
        return tenNXB;
    }
    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}

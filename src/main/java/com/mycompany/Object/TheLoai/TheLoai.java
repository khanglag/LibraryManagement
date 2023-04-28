/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheLoai;

/**
 *
 * @author pc
 */
public class TheLoai {
    private String maTheLoai, tenTheLoai;
    private boolean tonTai;

    //Constructor
    public TheLoai(String maTheLoai, String tenTheLoai, boolean tonTai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
        this.tonTai = tonTai;
    }

    public TheLoai() {
    }

    //Setter & getter
    public String getMaTheLoai() {
        return maTheLoai;
    }
    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
    public String getTenTheLoai() {
        return tenTheLoai;
    }
    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
    public boolean isTonTai() {
        return tonTai;
    }
    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }
}

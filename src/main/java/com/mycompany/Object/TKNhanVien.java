/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object;

/**
 *
 * @author pc
 */
public class TKNhanVien extends TaiKhoan {
    private String maNhanVien,quyen;

    //Constructor
    public TKNhanVien(String tenDangNhap, String matKhau, boolean tonTai, String maNhanVien,String quyen) {
        super(tenDangNhap, matKhau, tonTai);
        this.maNhanVien = maNhanVien;
        this.quyen=quyen;
    }

    public TKNhanVien(String tenDangNhap, String matKhau, boolean tonTai) {
        super(tenDangNhap, matKhau, tonTai);
    }
    

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
    
    
    public TKNhanVien() {
        
    }

    //Setter & getter
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}

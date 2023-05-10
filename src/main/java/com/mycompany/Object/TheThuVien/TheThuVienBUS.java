/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheThuVien;

import java.util.ArrayList;

import com.mycompany.Object.NhanVien.NhanVienBUS;

/**
 *
 * @author khang
 */
public class TheThuVienBUS {

    ArrayList<TheThuVien> dsTheThuVien = new ArrayList<TheThuVien>();
    TheThuVienDAO theThuVienDAO = new TheThuVienDAO();
    int maphieu = theThuVienDAO.getMaThe();

    public TheThuVienBUS() {
        dsTheThuVien = theThuVienDAO.readDB();
    }

    public ArrayList<TheThuVien> getDSTheThuVien() {
        return dsTheThuVien;
    }

    public String getMaThe() {
        return maphieu + "";
    }

    public String addTheThuVien(TheThuVien nv) {
        if (theThuVienDAO.hasTheThuVien(nv.getMaDocGia()))
            return "Đọc giả đã có thẻ";
        else if (theThuVienDAO.add(nv))
            return "Thêm thành công";
        return "Thêm thất bại";
    }

    public static void main(String[] args) {
        System.out.println(new TheThuVienBUS());
    }
}

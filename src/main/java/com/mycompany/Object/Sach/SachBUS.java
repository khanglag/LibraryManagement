/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.Sach;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class SachBUS {
    ArrayList<Sach> dsSach = new ArrayList<Sach>();
    SachDAO sachDAO = new SachDAO();

    public SachBUS() {
        dsSach = sachDAO.readDB();
    }

    public ArrayList<Sach> loadData() {
        return dsSach;
    }

    public String delete(Sach sach) {
        if (sachDAO.delete(sach))
            return "Đã xoá";
        return "Không thể xoá";
    }

    public String add(Sach sach) {
        if (sachDAO.hasID(sach.getMaSach()))
            return "Mã sách đã tồn tại";
        if (sachDAO.add(sach))
            return "Thêm thành công";
        return "Thêm thất bại";
    }

    public String update(Sach sach) {
        if (sachDAO.update(sach))
            return "Sửa thành công";
        return "Thất bại";
    }

    public String TraSach(Sach sach) {
        if (sachDAO.TraSach(sach))
            return "Sửa thành công";
        return "Thất bại";
    }

    public ArrayList<Sach> search(String maSach, String tenSach, String tinhTrang, String theLoai, String maTacGia,
            String maNXB, String soTrang, String lanXuatBan, String soLuong, String gia) {
        dsSach = sachDAO.search(maSach, tenSach, tinhTrang, theLoai, maTacGia, maNXB, soTrang, lanXuatBan, soLuong,
                gia);
        return dsSach;
    }

    public boolean Muon(String maSachString, int soluong) {
        return sachDAO.Muon(maSachString, soluong);
    }
}
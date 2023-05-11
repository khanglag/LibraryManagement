/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.NhanVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class NhanVienBUS {
    ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    NhanVienDAO nhanVienDAO = new NhanVienDAO();

    public NhanVienBUS() {
        dsNhanVien = nhanVienDAO.readDB();
    }

    public ArrayList<NhanVien> getDSNhanVien() {
        return dsNhanVien;
    }

    public String addNhanVien(NhanVien nv) {
        if (nhanVienDAO.hasEmployeeID(nv.getMaNhanVien()))
            return "Mã NV đã tồn tại";
        if (nhanVienDAO.add(nv))
            return "Thêm thành công";
        return "Thêm thất bại";
    }
    public String deletedNhanVien(NhanVien nv){
        if(nhanVienDAO.delete(nv))
            return "Đã xoá";
        return "Không thể xoá";
    }
    public String updateNhanVien(NhanVien nv){
        if(nhanVienDAO.update(nv)){
            return "Sửa thành công";  
        }
        return "Thất bại";
    }
    public String addTaiKhoan(NhanVien nhanVien){
        if(nhanVienDAO.addPhanQuyen(nhanVien)& nhanVienDAO.addTaiKhoan(nhanVien) & nhanVienDAO.editMaPQ(nhanVien)){
            return "Thêm thành công";  
        }
        return "Thất bại";
    }
}
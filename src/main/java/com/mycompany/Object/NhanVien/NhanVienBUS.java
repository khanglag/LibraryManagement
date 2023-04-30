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
    ArrayList<NhanVien> dsNhanVien =new ArrayList<NhanVien>();
    NhanVienDAO nhanVienDAO=new NhanVienDAO();
    public NhanVienBUS(){
        dsNhanVien=nhanVienDAO.readDB();
    }
    public ArrayList<NhanVien> getDSNhanVien(){
        return dsNhanVien;
    }
}
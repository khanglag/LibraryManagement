/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import java.util.ArrayList;

/**
 *
 * @author khang
 */
public class UserBUS {
    ArrayList<User> ds =new ArrayList<User>();
    NhanVienDAO nhanVienDAO=new NhanVienDAO();
    public NhanVienBUS(){
        dsNhanVien=nhanVienDAO.readDB();
    }
    public ArrayList<User> getDSNhanVien(){
        return dsNhanVien;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheLoai; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class TheLoaiBUS {
    ArrayList<TheLoai> dsTheLoai =new ArrayList<TheLoai>();
    TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
    public TheLoaiBUS(){
        dsTheLoai = theLoaiDAO.readDB();
    }
    public ArrayList<TheLoai> getDSTheLoai(){
        return dsTheLoai;
    }
}
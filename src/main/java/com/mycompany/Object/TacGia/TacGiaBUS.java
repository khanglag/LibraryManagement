/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TacGia; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class TacGiaBUS {
    ArrayList<TacGia> dsTacGia =new ArrayList<>();
    TacGiaDAO tacGiaDAO=new TacGiaDAO();
    public TacGiaBUS(){
        dsTacGia=tacGiaDAO.readDB();
    }
    public ArrayList<TacGia> getDSTacGia(){
        return dsTacGia;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class DocGiaBUS {
    ArrayList<DocGia> dsDocGia =new ArrayList<>();
    DocGiaDAO docGiaDAO = new DocGiaDAO();
    public DocGiaBUS(){
        dsDocGia = docGiaDAO.readDB();
    }
    //Lay danh sach doc gia con ton tai
    public ArrayList<DocGia> loadData(){
        ArrayList<DocGia> arr = new ArrayList<DocGia>();
        for(DocGia docGia : dsDocGia)
        {
            arr.add(docGia);
        }
        return arr;
    }

    
}
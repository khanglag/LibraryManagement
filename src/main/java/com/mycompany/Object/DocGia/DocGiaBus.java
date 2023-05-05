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
public class DocGiaBus {
    ArrayList<DocGia> dsdg =new ArrayList<>();
    DocGiaDAO dgaoAO=new DocGiaDAO();
    public DocGiaBus(){
        dsdg=dgaoAO.readDB();
    }
    //Lay danh sach doc gia con ton tai
    public ArrayList<DocGia> getDocGiads(){
        ArrayList<DocGia> dgtempArrayList=new ArrayList<DocGia>();
        for(DocGia itemDocGia:dsdg)
        {
            if(itemDocGia.isTonTai()) dgtempArrayList.add(itemDocGia);
        }
        return dgtempArrayList;
    }
    public void add(DocGia dg)
    {
        dgaoAO.add(dg);
    }
    public void delete(DocGia dg)
    {
        dgaoAO.delete(dg);
    }
    public ArrayList<DocGia> tiArrayList(String maDocGia, String tenDocGia, String gioiTinh, String soDienThoai, String diaChi, String maPQ,
            LocalDate ngaySinh,
            boolean tonTai)
    {
        return dgaoAO.timDocGias(maDocGia, tenDocGia, gioiTinh, soDienThoai, diaChi, maPQ, ngaySinh, tonTai);
    }
}
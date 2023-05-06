
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia; 
import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class DocGiaBUS {
    ArrayList<DocGia> dsDocGia = new ArrayList<DocGia>();
    DocGiaDAO docGiaDAO = new DocGiaDAO();
    public DocGiaBUS(){
        dsDocGia=docGiaDAO.readDB();
    }
    public ArrayList<DocGia> loadData(){
        return dsDocGia;
    }

    public String delete(DocGia docGia){
        if(docGiaDAO.delete(docGia))
            return "Đã xoá";
        return "Không thể xoá";
    }

    public String add(DocGia docGia) {
        if (docGiaDAO.hasID(docGia.getMaDocGia()))
            return "Mã đọc giả đã tồn tại";
        if (docGiaDAO.add(docGia))
            return "Thêm thành công";
        return "Thêm thất bại";
    }

    public String update(DocGia docGia){
        if(docGiaDAO.update(docGia)){
            return "Sửa thành công";
        }
        return "Thất bại";
    }

    public ArrayList<DocGia> search(String maDocGia, String tenDocGia, String CCCD, String gioiTinh, String ngaySinh, String SDT, String diaChi){
        dsDocGia = docGiaDAO.search(maDocGia, tenDocGia, CCCD, gioiTinh, ngaySinh, SDT, diaChi);
        return dsDocGia;
    }
}
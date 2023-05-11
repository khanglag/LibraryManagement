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
    public ArrayList<TacGia> loadData(){
        return dsTacGia;
    }
    
    public String add(TacGia tacGia) {
        if (tacGiaDAO.hasID(tacGia.getMaTacGia()))
            return "Mã tác giả đã tồn tại";
        if (tacGiaDAO.add(tacGia))
            return "Thêm thành công";
        return "Thêm thất bại";
    }
    
    public String delete(TacGia tacGia){
        if(tacGiaDAO.delete(tacGia))
            return "Đã xoá";
        return "Không thể xoá";
    }
    
    public String update(TacGia tacGia){
        if(tacGiaDAO.update(tacGia)){
            return "Sửa thành công";
        }
        return "Thất bại";
    }
    
    public ArrayList<TacGia> search(String maTacGia, String tenTacGia, String gioiTinh,String ngaySinh){
        dsTacGia = tacGiaDAO.search(maTacGia, tenTacGia,gioiTinh, ngaySinh);
        return dsTacGia;
    }
}
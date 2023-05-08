/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.PhieuTra;

import java.util.ArrayList;

/**
 *
 * @author khang
 */
public class PhieuTraBUS {
    ArrayList<PhieuTra> dsPhieuTra = new ArrayList<PhieuTra>();
    PhieuTraDAO phieuTraDAO = new PhieuTraDAO();
    int sophieutra=phieuTraDAO.getsophieutra();
    
    public PhieuTraBUS() {
        dsPhieuTra = phieuTraDAO.readDB();
    }

    public ArrayList<PhieuTra> getDSPhieuTra() {
        return dsPhieuTra;
    }

    public String addPhieuTra(PhieuTra nv) {

        if (phieuTraDAO.add(nv))
            return "Thêm thành công";
        return "Thêm thất bại";
    }

    public String deleted(PhieuTra nv) {
        if (phieuTraDAO.delete(nv))
            return "Đã xoá";
        return "Không thể xoá";
    }

    public String getMaphieutra(){
       return sophieutra+"";
   }
}

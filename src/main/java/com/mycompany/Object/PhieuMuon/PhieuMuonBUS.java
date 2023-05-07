/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

import com.mycompany.Object.DocGia.DocGiaBUS;
import com.mycompany.Object.Sach.SachBUS;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class PhieuMuonBUS {
    ArrayList<PhieuMuon> dsPhieuMuon = new ArrayList<PhieuMuon>();
    PhieuMuonDAO phieuMuonDAO = new PhieuMuonDAO();

    public PhieuMuonBUS() {
        dsPhieuMuon = phieuMuonDAO.readDB();
    }
   
    public void add(PhieuMuon phieuMuon){
        SachBUS sachBUS= new SachBUS();
        if (sachBUS.Muon(phieuMuon.getMaSach(),phieuMuon.getSoLuong())) {
            phieuMuonDAO.add(phieuMuon);
            System.out.println("Mượn được");
        }
        else System.out.println("Không mượn được");
    }

    public String update(PhieuMuon phieuMuon) {
        if(phieuMuonDAO.update(phieuMuon)) {
            return "Đã sửa!";
        } else return "Không sửa được!";
    }
}
 
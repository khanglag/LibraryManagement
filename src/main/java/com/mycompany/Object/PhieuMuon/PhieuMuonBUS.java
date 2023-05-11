/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

import com.mycompany.Object.DocGia.DocGiaBUS;
import com.mycompany.Object.Sach.SachBUS;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class PhieuMuonBUS {
   public PhieuMuonBUS(){ 
   }
   PhieuMuonDAO pmdao= new PhieuMuonDAO();
   int sophieumuon=pmdao.getsophieumuon();
   public ArrayList<PhieuMuon> loadData(){
       return pmdao.dsDG;
   }
   public String getMaphieumuon(){
       return sophieumuon+"";
   }
   public ArrayList<PhieuMuon> timMuons(String maPhieu, String maDocGia, String maSach, String maNhanVien, LocalDate ngayMuon,
            LocalDate ngayTra, int tonTai){
       return pmdao.timPhieuMuons(maPhieu, maDocGia, maSach, maNhanVien, ngayMuon, ngayTra, tonTai);
   }
   public void them(PhieuMuon pm){
       SachBUS sbus= new SachBUS();
       if (sbus.Muon(pm.getMaSach(),pm.getSoLuong())) {
           pmdao.add(pm);
           JOptionPane.showMessageDialog(null,"Mượn thành công");
       }
       else JOptionPane.showMessageDialog(null,"Không mượn được");
   }
   public void update(PhieuMuon pm){
       if (pmdao.update(pm)) {
          JOptionPane.showMessageDialog(null,"Sửa thành công");
       }
       else JOptionPane.showMessageDialog(null,"Sửa thất bại");
       
   }
   public void xoa(PhieuMuon pm){
       if(pmdao.delete(pm))
           JOptionPane.showMessageDialog(null,"Xoá thành công");
       else JOptionPane.showMessageDialog(null,"Xoá thất bại");
   }
}

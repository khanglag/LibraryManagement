/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

import com.mycompany.Object.DocGia.DocGiaBUS;
import com.mycompany.Object.Sach.SachBUS;
import java.time.LocalDate;

/**
 *
 * @author pc
 */
public class PhieuMuonBUS {
   public PhieuMuonBUS(){ 
   }
   PhieuMuonDAO pmdao= new PhieuMuonDAO();
   public String getMaphieumuon(){
       return pmdao.getsophieumuon()+"";
   }
   public String MUONSACH(String maDocGia,String maSach){
       if(pmdao.timPhieuMuons(getMaphieumuon(), null, null, null, null, null, 1).isEmpty()){       
           PhieuMuon pm= new PhieuMuon();
           pm.setMaPhieu(getMaphieumuon());
           DocGiaBUS gdbs= new DocGiaBUS();
           if(gdbs.search(maDocGia, null, null, null, null, null,null).isEmpty())
                return "Chua ton tai doc gia";
           else pm.setMaDocGia(maDocGia);
           SachBUS sa =new SachBUS();
           if(sa.search(maSach, null, null, null, null, null,null,null,null,null,null).isEmpty())
               return "Khong ton tai sach ";
           else pm.setMaSach(maSach);
           System.out.println("MPM"+pm.getMaPhieu()+" MDG"+pm.getMaDocGia()+" MS"+ pm.getMaSach());
       }
       else return "Ma phieu muon trung";
       return "ThemDuoc ";
   }
   public void them(PhieuMuon pm){
       pmdao.add(pm);
   }
}

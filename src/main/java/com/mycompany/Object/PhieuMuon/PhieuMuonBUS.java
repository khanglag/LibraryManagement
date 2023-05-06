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
   public PhieuMuonBUS(){ 
   }
   PhieuMuonDAO pmdao= new PhieuMuonDAO();
   int sophieumuon=pmdao.getsophieumuon();
   public ArrayList<PhieuMuon> loadData(){
       return pmdao.readDB();
   }
   public String getMaphieumuon(){
       return sophieumuon+"";
   }
   
   public void them(PhieuMuon pm){
       pmdao.add(pm);
       sophieumuon+=1;
   }
}

package com.mycompany.Object.Sach;

import java.util.ArrayList;

public class SachBUS {
   private SachDAO sdao= new SachDAO();
   private ArrayList<Sach> sa=new ArrayList<>();
   public SachBUS(){
       sa=sdao.readDB();
   }
   public ArrayList<Sach> getSachs(){
       ArrayList<Sach> stemp =new ArrayList<>();
       for(Sach sach:sa)
       {
           if(sach.isTonTai()==1)
               stemp.add(sach);
       }
       return stemp;
   }
   public void add(Sach sa)
   {
       sdao.add(sa);
   }
   public void delete(Sach sa)
   {
       sdao.delete(sa);
   }
   public ArrayList<Sach> timSachs(String maSach, String tenSach, String tinhTrang, String maTheLoai, String maTacGia, String maNXB)
   {
       return sdao.timSachs(maSach, tenSach, tinhTrang, maTheLoai, maTacGia, maNXB);
   }
    
}

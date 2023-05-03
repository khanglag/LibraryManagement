package com.mycompany.Object.Sach;

import com.mycompany.Object.DocGia.DocGiaDAO;

public class test {
    public static void main(String[] args) {
        SachDAO sdao=new SachDAO();
        Sach sa=new Sach("2004", "Khang", "Cu em", "SA0001", "TGSA01", "NXB007", 0, 0, 0, 0, "Ke");
        for(Sach temp:sdao.readDB())
        {
            System.out.println(temp.toString());
        }
        sdao.add(sa);
        for(Sach temp:sdao.readDB())
        {
            System.out.println(temp.toString());
        }
    }
}

package com.mycompany.Object.Sach;

import com.mycompany.Object.DocGia.DocGiaDAO;

public class test {
    public static void main(String[] args) {
        SachDAO sdao=new SachDAO();
        for(Sach temp:sdao.readDB())
        {
            System.out.println(temp.toString());
        }
    }
}

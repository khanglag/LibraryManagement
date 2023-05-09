/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

import java.time.LocalDate;

/**
 *
 * @author pc
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       PhieuMuonDAO pmd= new PhieuMuonDAO();
       PhieuMuonBUS pmbus=new PhieuMuonBUS();
       LocalDate localDate = LocalDate.of(2003, 04, 10);
       LocalDate localDate1 = LocalDate.of(2003, 05, 10);
       PhieuMuon pm=new PhieuMuon("1", "000001", "DNT001", "NV0001", 3,localDate, localDate1 ,0);
       pmbus.update(pm);
       for(PhieuMuon iMuon:pmbus.loadData()){
           System.out.println(iMuon.toString());
       }
        
    }
}

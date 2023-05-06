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
       PhieuMuon nMuon=new PhieuMuon("3", "000001", "DNT001", "NV0001", 1, LocalDate.parse("2020-04-10"),LocalDate.parse("2020-04-15"), 1);
//        System.out.println(pmbus.getMaphieumuon());
       pmbus.them(nMuon);
        System.out.println(pmbus.getMaphieumuon());
        
    }
}

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
       for(PhieuMuon iMuon:pmbus.loadData()){
           System.out.println(iMuon.toString());
       }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;

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
       System.out.println(pmbus.MUONSACH("000001","DNT001"));
//        System.out.println(pmbus.getMaphieumuon());
       
    }
}

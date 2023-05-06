package com.mycompany.Object.NhaXuatBan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
/**
 *
 * @author pc
 */
public class NhaXuatBanDAO {
    
    public NhaXuatBanDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<NhaXuatBan> dsNXB= new ArrayList<>();
    public ArrayList<NhaXuatBan> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM NHAXUATBAN WHERE TONTAI = 1";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   NhaXuatBan NXB = new NhaXuatBan(rset.getNString("MANXB"),
                           rset.getNString("TENNXB"), rset.getBoolean("TONTAI"));
                   dsNXB.add(NXB);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsNXB;
    }
    public Boolean add(NhaXuatBan NXB){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into NHAXUATBAN(MANXB,TENNXB,TONTAI) values('"
                +NXB.getMaNXB()+"','"
                +NXB.getTenNXB()+"','"
                + 1 + "')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(NhaXuatBan NXB){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE NHAXUATBAN SET TONTAI = 0 WHERE MANXB ='"+NXB.getMaNXB()+"'");
                System.out.println("UPDATE NHAXUATBAN SET TONTAI = 0 WHERE MANXB ='"+NXB.getMaNXB()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(NhaXuatBan NXB){
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE NHAXUATBAN SET TENNXB='"+NXB.getTenNXB()
                +"' WHERE MANXB ='"+NXB.getMaNXB()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean hasNXBID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();
        try {
            String qry = "Select * from nhaxuatban where manxb='" + id + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;

    }

    public ArrayList<NhaXuatBan> search(String maNXB, String tenNXB){
        connectDB = new ConnectDB();
        ArrayList<NhaXuatBan> result = new ArrayList<NhaXuatBan>();
        String qry="SELECT * FROM NHAXUATBAN WHERE ";
        if(maNXB.equals("") == false && tenNXB.equals("") == false) {
            qry += "MANXB = '" + maNXB + "', TENNXB = '" + tenNXB + "'";
        }
        else {
            if (maNXB.equals("") == false) {
                qry += "MANXB = '" + maNXB + "'";
            }
            if (tenNXB.equals("") == false) {
                qry += "TENNXB = '" + tenNXB + "'";
            }
        }
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if(rset!=null){
               while(rset.next()){
                   NhaXuatBan nxb= new NhaXuatBan(rset.getNString("MANXB"),rset.getNString("TENNXB"), rset.getBoolean("TONTAI"));
                   result.add(nxb);
               }
           }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Không có đối tượng cần tìm");
        }
        connectDB.closeConnect();
        return result;
}

}
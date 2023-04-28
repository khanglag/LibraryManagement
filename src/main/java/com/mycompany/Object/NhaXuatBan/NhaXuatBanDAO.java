package com.mycompany.Object.NhaXuatBan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            String qry="SELECT *FROM NHAXUATBAN";
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
                +NXB.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(NhaXuatBan NXB){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE NHAXUATBAN SET TONTAI = 'FALSE' WHERE MANXB ='"+NXB.getMaNXB()+"'");
                System.out.println("UPDATE NHAXUATBAN SET TONTAI = 'FALSE' WHERE MANXB ='"+NXB.getMaNXB()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(NhaXuatBan NXB){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE NHAXUATBAN SET TENNXB='"+NXB.getTenNXB()
                +"', TONTAI='"+NXB.isTonTai()
                +"' WHERE MANXB ='"+NXB.getMaNXB()+"'");
        connectDB.closeConnect();
        return success;
    }
}
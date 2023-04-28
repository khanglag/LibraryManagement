/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TacGia;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class TacGiaDAO {
    
    public TacGiaDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<TacGia> dsTacGia= new ArrayList<TacGia>();
    public ArrayList<TacGia> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM TACGIA";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   TacGia tacGia= new TacGia(rset.getNString("MATG"),
                           rset.getNString("TENTG"),rset.getNString("PHAI"),
                           rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   dsTacGia.add(tacGia);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsTacGia;
    }
    public Boolean add(TacGia tacGia){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into TACGIA(MATG,TENTG,PHAI,NGAYSINH,TONTAI) values('"
                +tacGia.getMaTacGia()+"','"
                +tacGia.getTenTacGia()+"','"
                +tacGia.getGioiTinh()+"','"
                +java.sql.Date.valueOf(tacGia.getNgaySinh())+"','"
                +tacGia.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(TacGia tacGia){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE TACGIA SET TONTAI = 'FALSE' WHERE MATG ='"+tacGia.getMaTacGia()+"'");
                System.out.println("UPDATE TACGIA SET TONTAI = 'FALSE' WHERE MADOCGIA ='"+tacGia.getMaTacGia()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(TacGia tacGia){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE TACGIA SET TENTG='"+tacGia.getTenTacGia()
                +"', PHAI='"+tacGia.getGioiTinh()
                +"', NGAYSINH='"+java.sql.Date.valueOf(tacGia.getNgaySinh())
                +"', TONTAI='"+tacGia.isTonTai()
                +"' WHERE MATG ='"+tacGia.getMaTacGia()+"'");
        connectDB.closeConnect();
        return success;
    }
}
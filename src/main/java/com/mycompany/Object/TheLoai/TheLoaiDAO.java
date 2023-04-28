/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheLoai;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class TheLoaiDAO {
    
    public TheLoaiDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<TheLoai> dsTheLoai= new ArrayList<>();
    public ArrayList<TheLoai> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM LOAISACH";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   TheLoai theLoai= new TheLoai(rset.getNString("MALOAI"),
                           rset.getNString("TENLOAI"), rset.getBoolean("TONTAI"));
                   dsTheLoai.add(theLoai);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsTheLoai;
    }
    public Boolean add(TheLoai theLoai){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into LOAISACH(MALOAI,TENLOAI,TONTAI) values('"
                +theLoai.getMaTheLoai()+"','"
                +theLoai.getTenTheLoai()+"','"
                +theLoai.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(TheLoai theLoai){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE LOAISACH SET TONTAI = 'FALSE' WHERE MALOAI ='"+theLoai.getMaTheLoai()+"'");
                System.out.println("UPDATE LOAISACH SET TONTAI = 'FALSE' WHERE MALOAI ='"+theLoai.getMaTheLoai()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(TheLoai theLoai){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE LOAISACH SET TENLOAI='"+theLoai.getTenTheLoai()
                +"', TONTAI='"+theLoai.isTonTai()
                +"' WHERE MALOAI ='"+theLoai.getMaTheLoai()+"'");
        connectDB.closeConnect();
        return success;
    }
}
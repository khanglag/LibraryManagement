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
            String qry="SELECT *FROM TACGIA WHERE TONTAI = 1";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   TacGia tacGia= new TacGia(rset.getNString("MATG"),
                           rset.getNString("TENTG"),rset.getNString("PHAI"),
                           Menu.MenuHand.convert(rset.getDate("NGAYSINH")),rset.getBoolean("TONTAI"));
                   dsTacGia.add(tacGia);
               }
           }
        } catch (SQLException e) {
            System.out.println(e);
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
                +1+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(TacGia tacGia){
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE TACGIA SET TONTAI = 0 WHERE MATG ='" + tacGia.getMaTacGia() + "'");
        
        connectDB.closeConnect();
        return success;
    }
    public boolean update(TacGia tacGia){
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE TACGIA SET TENTG='" + tacGia.getTenTacGia()
                + "', PHAI='" + tacGia.getGioiTinh()
                + "', NGAYSINH='" + java.sql.Date.valueOf(tacGia.getNgaySinh())
                + "' WHERE MATG ='" + tacGia.getMaTacGia() + "'");
        connectDB.closeConnect();
        return success;
    }
    public boolean hasID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from tacgia where matg='" + id + "' and tontai = 1";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;
    }
    public ArrayList<TacGia> search(String maTacGia, String tenTacGia, String gioiTinh, String ngaySinh){
        connectDB = new ConnectDB();
        ArrayList<TacGia> ketqua =new ArrayList<TacGia>();
        String qry="SELECT * FROM TACGIA WHERE TONTAI = 1";
        if(maTacGia.equals("") == false) 
            qry+=(" AND MATG= '"+maTacGia+ "'");
        if(tenTacGia.equals("") == false) 
            qry+=(" AND TENTG= '"+tenTacGia+ "'");
        if(gioiTinh.equals("") == false) 
            qry+=(" AND PHAI= '"+gioiTinh+ "'");
        if(ngaySinh.equals("") == false) 
            qry+=(" AND NGAYSINH= '"+ngaySinh+ "'");
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if (rset!=null) {
                  while(rset.next()){
                   TacGia tacGia= new TacGia(rset.getNString("MATG"),
                           rset.getNString("TENTG"),rset.getNString("PHAI"),
                           rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   ketqua.add(tacGia);
               }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        connectDB.closeConnect();
        return ketqua;
}
}
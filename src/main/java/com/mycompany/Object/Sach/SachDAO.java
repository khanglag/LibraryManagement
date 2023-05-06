/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.Sach;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class SachDAO {
    
    public SachDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<Sach> dsSach= new ArrayList<Sach>();
    public ArrayList<Sach> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT * FROM SACH WHERE TONTAI = 1";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   Sach sach= new Sach(rset.getNString("MASA"),
                           rset.getNString("TENSA"), rset.getNString("TT"),rset.getNString("SA_MALOAI"),
                           rset.getNString("MATG"),rset.getNString("MANXB"),rset.getInt("SOTRANG"),
                           rset.getInt("LXB"), rset.getInt("SOLUONG"), rset.getFloat("gia"), 
                           rset.getBoolean("TONTAI"), rset.getNString("MA_ANH"));
                           
                   dsSach.add(sach);
               }
           }
        } catch (SQLException e) {
            System.out.println(e);
        }
        connectDB.closeConnect();
        return dsSach;
    }
    public Boolean add(Sach sach){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into SACH(MASA,TENSA,TT,MATG,SA_MALOAI,MANXB,MA_ANH,LXB,SOTRANG,SOLUONG,gia,TONTAI) values('"
                +sach.getMaSach()+"','"
                +sach.getTenSach()+"','"
                +sach.getTinhTrang()+"','"
                +sach.getMaTacGia()+"','"
                +sach.getMaTheLoai()+"','"
                +sach.getMaNXB()+"','"
                +sach.getAnh()+"','"
                +sach.getLanXuatBan()+"','"
                +sach.getSoTrang()+"','"
                +sach.getSoLuong()+"','"
                +sach.getGia()+"','"
                +",'"+1+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(Sach sach) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE SACH SET TONTAI = 0 WHERE MASA ='" + sach.getMaSach() + "'");
        
        connectDB.closeConnect();
        return success;
    }
    public boolean update(Sach sach) {
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE SACH SET TENSA='" + sach.getTenSach()
                + "', TT='" + sach.getTinhTrang()
                + "', SOLUONG='" + sach.getSoLuong()
                + "', gia='" + sach.getGia()
                + "', MA_ANH='" + sach.getAnh()
                + "' WHERE MASA ='" + sach.getMaSach() + "'");
        connectDB.closeConnect();
        return success;
    }
    public boolean hasID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from sach where masa='" + id + "' and tontai = 1";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;

    }
    public ArrayList<Sach> search(String maSach, String tenSach, String tinhTrang, String theLoai, String maTacGia, String maNXB, String anh, String soTrang, String lanXuatBan, String soLuong, String gia){
        connectDB = new ConnectDB();
        ArrayList<Sach> ketqua =new ArrayList<Sach>();
        String qry="SELECT * FROM SACH WHERE TONTAI = 1";
        if(maSach.equals("") == false) 
            qry+=(" AND MASA= '"+maSach+ "'");
        if(tenSach.equals("") == false) 
            qry+=(" AND TENSA= '"+tenSach+ "'");
        if(tinhTrang.equals("") == false) 
            qry+=(" AND TT= '"+tinhTrang+ "'");
        if(theLoai.equals("") == false) 
            qry+=(" AND SA_MALOAI= '"+theLoai+ "'");
        if(maTacGia.equals("") == false) 
            qry+=(" AND MATG= '"+maTacGia+ "'");
        if(maNXB.equals("") == false) 
            qry+=(" AND MANXB= '"+maNXB+ "'");
        if(anh.equals("") == false) 
            qry+=(" AND MA_ANH= '"+anh+ "'");
        if(soTrang.equals("") == false) 
            qry+=(" AND SOTRANG= "+Integer.parseInt(soTrang));
        if(lanXuatBan.equals("") == false) 
            qry+=(" AND LXB= "+Integer.parseInt(lanXuatBan));
        if(soLuong.equals("") == false) 
            qry+=(" AND SOLUONG= "+Integer.parseInt(soLuong));
        if(gia.equals("") == false) 
            qry+=(" AND gia= "+Float.parseFloat(gia));
       
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if (rset!=null) {
                  while(rset.next()){
                   Sach sach= new Sach(rset.getNString("MASA"),
                           rset.getNString("TENSA"),rset.getNString("TT"),rset.getNString("SA_MALOAI"),
                           rset.getNString("MATG"),rset.getNString("MANXB"),rset.getInt("SOTRANG"),
                           rset.getInt("LXB"),rset.getInt("SOLUONG"),rset.getFloat("gia"),rset.getBoolean("TONTAI"),
                           rset.getNString("MA_ANH"));
                   ketqua.add(sach);
               }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        connectDB.closeConnect();
        return ketqua;
}
     
}
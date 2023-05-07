/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;
import ConnectDB.ConnectDB;
import com.mycompany.Object.Sach.SachBUS;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class PhieuMuonDAO {
    
    public PhieuMuonDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<PhieuMuon> dsPhieuMuon= new ArrayList<>();
    public ArrayList<PhieuMuon> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM PHIEUMUON";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   PhieuMuon phieuMuon= new PhieuMuon(rset.getNString("MAPHIEUMUON"), rset.getNString("MADG"), rset.getNString("MASA"),rset.getNString("MANV"), rset.getInt("SOLUONG"), rset.getDate("NGAYMUON").toLocalDate(), rset.getDate("HANTRA").toLocalDate(), rset.getBoolean("TONTAI"));
                   dsPhieuMuon.add(phieuMuon);
                   System.out.println(phieuMuon.toString());
               }
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return dsPhieuMuon;
    }
    public int getSoPhieu(){
        return readDB().size();
    }
    public Boolean add(PhieuMuon phieuMuon){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into PHIEUMUON(MAPHIEUMUON,MADG,MASA,MANV,NGAYMUON,HANTRA,SOLUONG,TONTAI) values('"
                +phieuMuon.getMaPhieu()+"','"
                +phieuMuon.getMaDocGia()+"','"
                +phieuMuon.getMaSach()+"','"
                +phieuMuon.getMaNhanVien()+"','"
                +java.sql.Date.valueOf(phieuMuon.getNgayMuon())+"','"
                +java.sql.Date.valueOf(phieuMuon.getNgayTra())+"',"
                +phieuMuon.getSoLuong()+","
                +1+")");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(PhieuMuon phieuMuon){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE PHIEUMUON SET TONTAI = 'FALSE' WHERE MAPHIEUMUON ='"+phieuMuon.getMaPhieu()+"'");
                System.out.println("UPDATE PHIEUMUON SET TONTAI = 'FALSE' WHERE MAPHIEUMUON ='"+phieuMuon.getMaPhieu()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(PhieuMuon phieuMuon) {
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE PHIEUMUON SET SOLUONG=" + phieuMuon.getSoLuong()               
                + ", NGAYMUON='" + java.sql.Date.valueOf(phieuMuon.getNgayMuon())
                + ", HANTRA='" + java.sql.Date.valueOf(phieuMuon.getNgayTra())               
                + "' WHERE MAPHIEUMUON ='" + phieuMuon.getMaPhieu() + "'");
        connectDB.closeConnect();
        return success;
    }
    public ArrayList<PhieuMuon> search(String maPhieu, String maDocGia, String maSach, String maNhanVien, String ngayMuon,
            String ngayTra){
        connectDB = new ConnectDB();
        ArrayList<PhieuMuon> ketqua =new ArrayList<PhieuMuon>();
        String qry="SELECT *FROM PHIEUMUON WHERE TONTAI= 1";
        if(maPhieu.equals("") == false) 
            qry+=(" AND MAPHIEUMUON= '"+maPhieu+ "'");
        if(maDocGia.equals("") == false) 
            qry+=(" AND MADG= '"+maDocGia+ "'");
        if(maSach.equals("") == false) 
            qry+=(" AND MASA= '"+maSach+ "'");
        if(maNhanVien.equals("") == false) 
            qry+=(" AND MANV= '"+maNhanVien+ "'");
        if(ngayMuon.equals("") == false) 
            qry+=(" AND NGAYMUON= '"+java.sql.Date.valueOf(ngayMuon)+"'");
        if(ngayTra.equals("") == false) 
            qry+=(" AND NGAYMUON= '"+java.sql.Date.valueOf(ngayTra)+"'");
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if (rset!=null) {
                while(rset.next()){
                    PhieuMuon phieuMuon= new PhieuMuon(rset.getNString("MAPHIEUMUON"), rset.getNString("MADG"), rset.getNString("MASA"),rset.getNString("MANV"), rset.getInt("SOLUONG"), rset.getDate("NGAYMUON").toLocalDate(), rset.getDate("HANTRA").toLocalDate(), rset.getBoolean("TONTAI"));
                    ketqua.add(phieuMuon);
                }
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        connectDB.closeConnect();
        return ketqua;
}
     
}

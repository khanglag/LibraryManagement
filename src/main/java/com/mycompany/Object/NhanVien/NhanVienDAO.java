/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.NhanVien;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class NhanVienDAO {
    
    public NhanVienDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<NhanVien> dsNhanVien= new ArrayList<>();
    public ArrayList<NhanVien> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM NHANVIEN";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   NhanVien nhanVien= new NhanVien(rset.getNString("MANV"),
                           rset.getNString("TENNV"),rset.getNString("PHAI"),rset.getNString("CCCD"),
                           rset.getNString("DIACHI"),rset.getNString("SDT"),rset.getNString("MAPQ"),
                           rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   dsNhanVien.add(nhanVien);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsNhanVien;
    }
    public Boolean add(NhanVien nhanVien){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into NHANVIEN(MANV,TENNV,PHAI,CCCD,DIACHI,SDT,MAPQ,NGAYSINH,TONTAI) values('"
                +nhanVien.getMaNhanVien()+"','"
                +nhanVien.getTenNhanVien()+"','"
                +nhanVien.getGioiTinh()+"','"
                +nhanVien.getChungMinhThu()+"','"
                +nhanVien.getDiaChi()+"','"
                +nhanVien.getSoDienThoai()+"','"
                +nhanVien.getMaPQ()+"','"
                +java.sql.Date.valueOf(nhanVien.getNgaySinh())+"','"
                +nhanVien.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(NhanVien nhanVien){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE NHANVIEN SET TONTAI = 'FALSE' WHERE MANHANVIEN ='"+nhanVien.getMaNhanVien()+"'");
        System.out.println("UPDATE NHANVIEN SET TONTAI = 'FALSE' WHERE MANHANVIEN ='"+nhanVien.getMaNhanVien()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(NhanVien nhanVien){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE NHANVIEN SET TENNV='"+nhanVien.getTenNhanVien()
                +"', PHAI='"+nhanVien.getGioiTinh()
                +"', NGAYSINH='"+java.sql.Date.valueOf(nhanVien.getNgaySinh())
                +"', SDT='"+nhanVien.getSoDienThoai()
                +"', TONTAI='"+nhanVien.isTonTai()
                +"' WHERE MANV ='"+nhanVien.getMaNhanVien()+"'");
        connectDB.closeConnect();
        return success;
    }
}
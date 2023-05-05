/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Object.PhieuMuon;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class PhieuMuonDao {
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
    ArrayList<PhieuMuon> dsDG= new ArrayList<>();
    public ArrayList readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM PHIEUMUON";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   PhieuMuon pm= new PhieuMuon(rset.getNString("MAPHIEU"), rset.getNString("MADG"), rset.getNString("MASA"),rset.getNString("MANV"), rset.getInt("SOLUONG"), LocalDate.MIN, LocalDate.MAX, true);
                   dsDG.add(pm);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsDG;
    }
    public Boolean add(PhieuMuon dg){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into PHIEUMUON(MADG,TENDG,PHAI,NGAYSINH,SDT,DIACHI,MAPQ,TONTAI) values('"
                +dg.getMaPhieuMuon()+"','"
                +dg.getTenPhieuMuon()+"','"
                +dg.getGioiTinh()+"','"
                +java.sql.Date.valueOf(dg.getNgaySinh())+"','"
                +dg.getSoDienThoai()
                +"','"+dg.getDiaChi()
                +"','"+dg.getMaPQ()
                +"','"+dg.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(PhieuMuon dg){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE PHIEUMUON SET TONTAI = 'FALSE' WHERE MADG ='"+dg.getMaPhieuMuon()+"'");
                System.out.println("UPDATE PHIEUMUON SET TONTAI = 'FALSE' WHERE MADG ='"+dg.getMaPhieuMuon()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(PhieuMuon dg){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE PHIEUMUON SET TENDG='"+dg.getTenPhieuMuon()
                +"', PHAI='"+dg.getGioiTinh()
                +"', NGAYSINH='"+java.sql.Date.valueOf(dg.getNgaySinh())
                +"', SDT='"+dg.getSoDienThoai()
                +"', TONTAI='"+dg.isTonTai()
                +"' WHERE MADG ='"+dg.getMaPhieuMuon()+"'");
        connectDB.closeConnect();
        return success;
    }
    public ArrayList<PhieuMuon> timPhieuMuons(String maPhieuMuon, String tenPhieuMuon, String gioiTinh, String soDienThoai, String diaChi, String maPQ,
            LocalDate ngaySinh,
            boolean tonTai){
        connectDB = new ConnectDB();
        ArrayList<PhieuMuon> ketqua =new ArrayList<PhieuMuon>();
        String qry="SELECT *FROM PHIEUMUON WHERE ";
        if(maPhieuMuon!=null) 
            qry+=("MADG= '"+maPhieuMuon+ "'");
        if(tenPhieuMuon!=null) 
            qry+=("TENDG= '"+tenPhieuMuon+ "'");
        if(gioiTinh!=null) 
            qry+=("PHAI= '"+gioiTinh+ "'");
        if(soDienThoai!=null) 
            qry+=("SDT= '"+soDienThoai+ "'");
        if(diaChi!=null) 
            qry+=("DIACHI= '"+diaChi+ "'");
        if(ngaySinh!=null) 
            qry+=("NGAYSINH= '"+ngaySinh+ "'");
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if (rset!=null) {
                  while(rset.next()){
                   PhieuMuon dg= new PhieuMuon(rset.getNString("MADG"),
                           rset.getNString("TENDG"),rset.getNString("PHAI"),
                           rset.getNString("SDT"),rset.getNString("DIACHI"),rset.getNString("MAPQ")
                           ,rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   ketqua.add(dg);
               }
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Không có đối tượng cần tìm");
        }
        connectDB.closeConnect();
        return ketqua;
}
     
}

}

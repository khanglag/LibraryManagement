/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class DocGiaDAO {
    
    public DocGiaDAO(){
    }
    
    ConnectDB connectDB;
    ArrayList<DocGia> dsDG= new ArrayList<>();
    public ArrayList readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM DOCGIA";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   DocGia dg= new DocGia(rset.getNString("MADG"),
                           rset.getNString("TENDG"),rset.getNString("PHAI"),
                           rset.getNString("SDT"),rset.getNString("DIACHI"),rset.getNString("MAPQ")
                           ,rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   dsDG.add(dg);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsDG;
    }
    public Boolean add(DocGia dg){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into DOCGIA(MADG,TENDG,PHAI,NGAYSINH,SDT,DIACHI,MAPQ,TONTAI) values('"
                +dg.getMaDocGia()+"','"
                +dg.getTenDocGia()+"','"
                +dg.getGioiTinh()+"','"
                +java.sql.Date.valueOf(dg.getNgaySinh())+"','"
                +dg.getSoDienThoai()
                +"','"+dg.getDiaChi()
                +"','"+dg.getDiaChi()
                +"','"+dg.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(DocGia dg){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE DOCGIA SET TONTAI = 'FALSE' WHERE MADG ='"+dg.getMaDocGia()+"'");
                System.out.println("UPDATE DOCGIA SET TONTAI = 'FALSE' WHERE MADOCGIA ='"+dg.getMaDocGia()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(DocGia dg){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE DOCGIA SET TENDG='"+dg.getTenDocGia()
                +"', PHAI='"+dg.getGioiTinh()
                +"', NGAYSINH='"+java.sql.Date.valueOf(dg.getNgaySinh())
                +"', SDT='"+dg.getSoDienThoai()
                +"', TONTAI='"+dg.isTonTai()
                +"' WHERE MADG ='"+dg.getMaDocGia()+"'");
        connectDB.closeConnect();
        return success;
    }
}
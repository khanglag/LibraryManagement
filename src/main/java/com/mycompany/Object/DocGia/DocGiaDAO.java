/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia;
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
                           rset.getNString("SDT"),rset.getNString("DIACHI")
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
        boolean success= connectDB.sqlUpdate("insert into DOCGIA(MADG,TENDG,PHAI,NGAYSINH,SDT,DIACHI,TONTAI) values('"
                +dg.getMaDocGia()+"','"
                +dg.getTenDocGia()+"','"
                +dg.getGioiTinh()+"','"
                +java.sql.Date.valueOf(dg.getNgaySinh())+"','"
                +dg.getSoDienThoai()
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
    public ArrayList<DocGia> timDocGias(String maDocGia, String tenDocGia, String gioiTinh, String soDienThoai, String diaChi,
            LocalDate ngaySinh,
            boolean tonTai){
        connectDB = new ConnectDB();
        ArrayList<DocGia> ketqua =new ArrayList<DocGia>();
        String qry="SELECT *FROM DOCGIA WHERE ";
        if(maDocGia!=null) 
            qry+=("MADG= '"+maDocGia+ "'");
        if(tenDocGia!=null) 
            qry+=("TENDG= '"+tenDocGia+ "'");
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
                   DocGia dg= new DocGia(rset.getNString("MADG"),
                           rset.getNString("TENDG"),rset.getNString("PHAI"),
                           rset.getNString("SDT"),rset.getNString("DIACHI")
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
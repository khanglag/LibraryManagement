/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.Sach;
import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class SachDAO {
    
    public SachDAO(){
    }
    ConnectDB connectDB;
    ArrayList<Sach> dss= new ArrayList<>();
    public ArrayList<Sach> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM SACH";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   Sach sa= new Sach(rset.getNString("MASA"),rset.getNString("TENSA"),rset.getNString("TT"),rset.getNString("SA_MALOAI"), rset.getNString("MATG"), rset.getNString("MANXB"),
            rset.getInt("SOTRANG") , 0, rset.getInt("SOTRANG"), rset.getFloat("gia"), rset.getInt("TONTAI"),rset.getNString("MA_ANH"));
                   dss.add(sa);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dss;
    }
    public Boolean add(Sach sa){
        connectDB= new ConnectDB();
        boolean success= connectDB.sqlUpdate("insert into SACH(MASA,TENSA,TT,SOTRANG,SOLUONG,gia,SA_MALOAI,MATG,MANXB,MA_ANH,TONTAI) values('"
                +sa.getMaSach()+"','"
                +sa.getTenSach()+"','"
                +sa.getTinhTrang()+"','"
                +sa.getSoTrang()+"','"
                +sa.getSoLuong()+"','"
                +sa.getGia()+"','"
                +sa.getMaTheLoai()+"','" 
                +sa.getMaTacGia()+"','"
                +sa.getMaNXB()+"','"
                +sa.getAnh()+"','"
                +sa.isTonTai()+"')");
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(Sach sa){
        connectDB = new ConnectDB();
        boolean success= connectDB.sqlUpdate("UPDATE SACH SET TONTAI = '1' WHERE MASA ='"+sa.getMaSach()+"'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(Sach sa){
        connectDB = new ConnectDB();
        boolean success= true;
        connectDB.sqlUpdate("UPDATE DOCGIA SET TENSA+'"+sa.getTenSach()
                +"', TT='"+sa.getTinhTrang()
                +"', SOTRANG='"+sa.getSoTrang()
                +"', SOLUONG='"+sa.getSoLuong()
                +"', gia='"+sa.getGia()
                +"', SA_MALOAI='"+sa.getMaTheLoai()
                 +"', MATG='"+sa.getMaTacGia()
                 +"', MANXB='"+sa.getMaTheLoai()
                 +"', MA_ANH='"+sa.getAnh()
                +"', TONTAI='"+sa.isTonTai()
                +"' WHERE MADG ='"+sa.getMaSach()+"'");
        connectDB.closeConnect();
        return success;
    }
    public ArrayList<Sach> timSachs(String maSach, String tenSach, String tinhTrang, String maTheLoai, String maTacGia, String maNXB,
            int soTrang, int lanXuatBan, int soLuong, float gia, int tonTai,String anh){
        connectDB = new ConnectDB();
        ArrayList<Sach> ketqua =new ArrayList<Sach>();
        String qry="SELECT *FROM SACH WHERE ";
        if(maSach!=null) 
            qry+=("MASA= '"+maSach+ "'");
        if(tenSach!=null) 
            qry+=("TENSA= '"+tenSach+ "'");
        if(tinhTrang!=null) 
            qry+=("TT= '"+tinhTrang+ "'");
        if(maTheLoai!=null) 
            qry+=("SA_MALOAI= '"+maTheLoai+ "'");
        if(maNXB!=null) 
            qry+=("MANXB= '"+maNXB+ "'");
        if(maTacGia!=null) 
            qry+=("MATG= '"+maTacGia+ "'");
        System.out.println(qry);
        ResultSet rset= connectDB.sqlQuery(qry);
        try {
            if(rset!=null){
               while(rset.next()){
                   Sach sa= new Sach(rset.getNString("MASA"),rset.getNString("TENSA"),rset.getNString("TT"),rset.getNString("SA_MALOAI"), rset.getNString("MATG"), rset.getNString("MANXB"),
            rset.getInt("SOTRANG") , 0, rset.getInt("SOTRANG"), rset.getFloat("gia"), rset.getInt("TONTAI"),rset.getNString("MA_ANH"));
                   ketqua.add(sa);
               }
           }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Không có đối tượng cần tìm");
        }
        connectDB.closeConnect();
        return ketqua;
}
    
}
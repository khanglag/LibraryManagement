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

    public SachDAO() {
    }

    ConnectDB connectDB;
    ArrayList<Sach> dss = new ArrayList<>();

    public ArrayList<Sach> readDB() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM SACH WHERE TONTAI = 1 ";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    Sach sa = new Sach(rset.getNString("MASA"), rset.getNString("TENSA"),
                            rset.getNString("TT"), rset.getInt("SOTRANG"),
                            rset.getInt("SOLUONG"), rset.getFloat("gia"),
                            rset.getNString("SA_MALOAI"), rset.getNString("MATG"),
                            rset.getNString("MANXB"), rset.getInt("LXB"),
                            rset.getInt("TONTAI"), rset.getNString("MA_ANH"));
                    dss.add(sa);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dss;
    }

    public Boolean add(Sach sa) {
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate(
                "insert into SACH(MASA,TENSA,TT,SOTRANG,SOLUONG,gia,SA_MALOAI,MATG,MANXB,MA_ANH,TONTAI) values('"
                        + sa.getMaSach() + "','"
                        + sa.getTenSach() + "','"
                        + sa.getTinhTrang() + "','"
                        + sa.getSoTrang() + "','"
                        + sa.getSoLuong() + "','"
                        + sa.getGia() + "','"
                        + sa.getMaTheLoai() + "','"
                        + sa.getMaTacGia() + "','"
                        + sa.getMaNXB() + "','"
                        + sa.getAnh() + "','"
                        + sa.isTonTai() + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(Sach sach) {
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE SACH SET TONTAI = 0 WHERE MASA ='" + sach.getMaSach() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean hasID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();
        try {
            String qry = "Select * from sach where masa='" + id + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    public boolean update(Sach sa) {
        connectDB = new ConnectDB();
        boolean success = true;
        String qry = ("UPDATE SACH SET TENSA='" + sa.getTenSach()
                + "' AND TT='" + sa.getTinhTrang()
                + "' AND SOTRANG='" + sa.getSoTrang()
                + "' AND SOLUONG='" + sa.getSoLuong()
                + "' AND gia='" + sa.getGia()
                + "'AND MA_ANH='" + sa.getAnh()
                + "' WHERE MASA ='" + sa.getMaSach() + "'");
        System.out.println(qry);
        connectDB.sqlUpdate(qry);
        connectDB.closeConnect();
        return success;
    }

    public boolean update(String maSachString, int soluong) {
        connectDB = new ConnectDB();
        boolean success = true;
        String qry = ("UPDATE SACH SET SOLUONG='" + soluong
                + "' WHERE MASA ='" + maSachString + "'");
        System.out.println(qry);
        connectDB.sqlUpdate(qry);
        connectDB.closeConnect();
        return success;
    }

    public ArrayList<Sach> search(String maSach, String tenSach, String tinhTrang, String maTheLoai, String maTacGia,
            String maNXB, String soTrang, String lanXuatBan, String soLuong, String gia) {
        connectDB = new ConnectDB();
        ArrayList<Sach> ketqua = new ArrayList<Sach>();
        String qry = "SELECT *FROM SACH WHERE TONTAI=1 ";
        if (maSach.equals("") == false)
            qry += (" AND MASA= '" + maSach + "'");
        if (tenSach.equals("") == false)
            qry += (" AND TENSA= '" + tenSach + "'");
        if (tinhTrang.equals("") == false)
            qry += (" AND TT= '" + tinhTrang + "'");
        if (maTheLoai.equals("") == false)
            qry += (" AND SA_MALOAI= '" + maTheLoai + "'");
        if (maNXB.equals("") == false)
            qry += (" AND MANXB= '" + maNXB + "'");
        if (maTacGia.equals("") == false)
            qry += (" AND MATG= '" + maTacGia + "'");
        if (soTrang.equals("") == false)
            qry += (" AND SOTRANG= " + Integer.parseInt(soTrang) );
        if (soLuong.equals("") == false)
            qry += (" AND SOLUONG= " + Integer.parseInt(soLuong) );
        if (lanXuatBan.equals("") == false)
            qry += (" AND LXB= " + Integer.parseInt(lanXuatBan) );
        if (gia.equals("") == false)
            qry += (" AND gia= " + Float.parseFloat(gia) );
        System.out.println(qry);
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    Sach sa = new Sach(rset.getNString("MASA"), rset.getNString("TENSA"),
                            rset.getNString("TT"), rset.getInt("SOTRANG"),
                            rset.getInt("SOLUONG"), rset.getFloat("gia"),
                            rset.getNString("SA_MALOAI"), rset.getNString("MATG"),
                            rset.getNString("MANXB"), rset.getInt("LXB"),
                            rset.getInt("TONTAI"), rset.getNString("MA_ANH"));
                    ketqua.add(sa);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không có đối tượng cần tìm");
        }
        connectDB.closeConnect();
        return ketqua;
    }

    public boolean Muon(String msach, int soluong) {
        connectDB=new  ConnectDB();
        try {
             String qry = "SELECT *FROM SACH WHERE TONTAI=1  AND MASA= '" + msach + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    int soluongcon= rset.getInt("SOLUONG");
                    if(soluongcon<soluong){
                        JOptionPane.showMessageDialog(null,"Hết sách");
                        return false;
                    }
                    else{
                        update(msach,soluongcon- soluong);
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return false;
    }

    public boolean TraSach(Sach sa) {
        connectDB = new ConnectDB();
        int n = sa.getSoLuong() + sa.getSoLuongSau();
        boolean success = true;
        connectDB.sqlUpdate("UPDATE SACH SET SOLUONG=" + n
                + " WHERE MASA ='" + sa.getMaSach() + "'");
        connectDB.closeConnect();

        return success;
    }

    
}
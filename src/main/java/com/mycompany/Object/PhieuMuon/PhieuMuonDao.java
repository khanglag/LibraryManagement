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
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */

public class PhieuMuonDAO {

    public PhieuMuonDAO() {
    }

    ConnectDB connectDB;
    ArrayList<PhieuMuon> dsDG = new ArrayList<>();

    public ArrayList<PhieuMuon> readDB() {
        connectDB = new ConnectDB();
        try {

            String qry = "SELECT *FROM PHIEUMUON ";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    PhieuMuon pm = new PhieuMuon(rset.getNString("MAPHIEUMUON"), rset.getNString("MADG"),
                            rset.getNString("MASA"), rset.getNString("MANV"), rset.getInt("SOLUONG"),
                            rset.getDate("NGAYMUON").toLocalDate(), rset.getDate("HANTRA").toLocalDate(),
                            rset.getInt("TONTAI"));
                    dsDG.add(pm);
                    System.out.println(pm.toString());
                }
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        connectDB.closeConnect();
        return dsDG;
    }

    public Boolean add(PhieuMuon sa) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into PHIEUMUON(MAPHIEUMUON,MADG,MASA,MANV,NGAYMUON,HANTRA,SOLUONG,TONTAI) values('"
                        + sa.getMaPhieu() + "','"
                        + sa.getMaDocGia() + "','"
                        + sa.getMaSach() + "','"
                        + sa.getMaNhanVien() + "','"
                        + java.sql.Date.valueOf(sa.getNgayMuon()) + "','"
                        + java.sql.Date.valueOf(sa.getNgayTra()) + "','"
                        + sa.getSoLuong() + "','"
                        + sa.isTonTai() + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(PhieuMuon sa) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE PHIEUMUON SET TONTAI = 0 WHERE MAPHIEUMUON ='" + sa.getMaPhieu() + "'");
        System.out.println("UPDATE PHIEUMUON SET TONTAI = 0 WHERE MAPHIEUMUON ='" + sa.getMaPhieu() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean update(PhieuMuon pm) {
        connectDB = new ConnectDB();

        boolean success = connectDB.sqlUpdate("UPDATE PHIEUMUON SET "
                + "MADG= '" + pm.getMaDocGia() + "'"
                + ", MASA= '" + pm.getMaSach() + "'"
                + ", MANV= '" + pm.getMaNhanVien() + "'"
                + ", SOLUONG= '" + pm.getSoLuong() + "'"
                + ", NGAYMUON= '" + java.sql.Date.valueOf(pm.getNgayMuon()) + "'"
                + ", HANTRA= '" + java.sql.Date.valueOf(pm.getNgayTra()) + "'"
                + " WHERE MAPHIEUMUON ='" + pm.getMaPhieu() + "'");
        connectDB.closeConnect();
        return success;
    }

    public ArrayList<PhieuMuon> timPhieuMuons(String maPhieu, String maDocGia, String maSach, String maNhanVien,
            LocalDate ngayMuon,
            LocalDate ngayTra, int tonTai) {
        connectDB = new ConnectDB();
        ArrayList<PhieuMuon> ketqua = new ArrayList<PhieuMuon>();
        String qry = "SELECT *FROM PHIEUMUON WHERE TONTAI= 1";
        if (maPhieu.equals("") != true)
            qry += (" AND MAPHIEUMUON= '" + maPhieu + "'");
        if (maDocGia.equals("") != true)
            qry += (" AND MADG= '" + maDocGia + "'");
        if (maSach.equals("") != true)
            qry += (" AND MASA= '" + maSach + "'");
        if (maNhanVien.equals("") != true)
            qry += (" AND MANV= '" + maNhanVien + "'");
        if (ngayMuon.equals("") != true)
            qry += (" AND NGAYMUON= '" + java.sql.Date.valueOf(ngayMuon) + "'");
        if (ngayTra.equals("") != true)
            qry += (" AND HANTRA= '" + java.sql.Date.valueOf(ngayTra) + "'");
        System.out.println(qry);
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    PhieuMuon pm = new PhieuMuon(rset.getNString("MAPHIEUMUON"), rset.getNString("MADG"),
                            rset.getNString("MASA"), rset.getNString("MANV"), rset.getInt("SOLUONG"),
                            rset.getDate("NGAYMUON").toLocalDate(), rset.getDate("HANTRA").toLocalDate(), 1);
                    ketqua.add(pm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không có đối tượng cần tìm");
        }
        connectDB.closeConnect();
        return ketqua;
    }

    public int getsophieumuon() {
        return readDB().size();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.PhieuTra;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ConnectDB.ConnectDB;

/**
 *
 * @author khang
 */
public class PhieuTraDAO {

    public PhieuTraDAO() {

    }

    ConnectDB connectDB;
    ArrayList<PhieuTra> dsPhieuTra = new ArrayList<>();
    ArrayList<PhieuTra> ds = new ArrayList<>();

    public ArrayList<PhieuTra> readDB() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM PHIEUTRA WHERE TONTAI=1";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {

                    PhieuTra phieuTra = new PhieuTra(
                            rset.getNString("MAPHIEUTRA"),
                            rset.getNString("MAPHIEUMUON"),
                            rset.getNString("MADG"),
                            rset.getNString("MASA"),
                            rset.getNString("MANV"),
                            rset.getDate("HANTRA").toLocalDate(),
                            rset.getDate("NGAYTRA").toLocalDate(),
                            rset.getInt("SOLUONG"),
                            rset.getNString("TINHTRANG"),
                            rset.getInt("SONGAYQUAHAN"),
                            rset.getInt("TONTAI")

                    );

                    dsPhieuTra.add(phieuTra);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsPhieuTra;
    }

    public ArrayList<PhieuTra> gets() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM PHIEUTRA";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {

                    PhieuTra phieuTra = new PhieuTra(
                            rset.getNString("MAPHIEUTRA"),
                            rset.getNString("MAPHIEUMUON"),
                            rset.getNString("MADG"),
                            rset.getNString("MASA"),
                            rset.getNString("MANV"),
                            rset.getDate("HANTRA").toLocalDate(),
                            rset.getDate("NGAYTRA").toLocalDate(),
                            rset.getInt("SOLUONG"),
                            rset.getNString("TINHTRANG"),
                            rset.getInt("SONGAYQUAHAN"),
                            rset.getInt("TONTAI")

                    );

                    ds.add(phieuTra);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return ds;
    }
    public int getsophieutra() {
        return gets().size();
    }

    public Boolean add(PhieuTra phieuTra) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate(
                        "insert into PHIEUTRA(MAPHIEUTRA,MAPHIEUMUON,MADG,MASA,MANV,HANTRA,NGAYTRA,SOLUONG,TINHTRANG,SONGAYQUAHAN,TONTAI	) values('"
                                + phieuTra.getMaPhieu() + "','"
                                + phieuTra.getMaPhieuMuon() + "','"
                                + phieuTra.getMaDocGia() + "','"
                                + phieuTra.getMaSach() + "','"
                                + phieuTra.getMaNhanVien() + "','"
                                + java.sql.Date.valueOf(phieuTra.getHanTra()) + "','"
                                + java.sql.Date.valueOf(phieuTra.getNgayTra()) + "',"
                                + phieuTra.getSoLuong() + ",'"
                                + phieuTra.getTinhTrang() + "',"
                                + phieuTra.getSoNgayQuaHan() + ","
                                + 1 + ")");
        String s = "INSERT into phieutra (MAPHIEUTRA,MAPHIEUMUON,MADG,MASA,MANV,HANTRA,NGAYTRA,SOLUONG,TINHTRANG,SONGAYQUAHAN,TONTAI) VALUES ( '000001','2','000001','DNT001',null,null,null,2,null,null,1 );";
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(PhieuTra phieuTra) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE PHIEUTRA SET TONTAI = 0 WHERE MAPHIEUTRA ='" + phieuTra.getMaPhieu() + "'");
        System.out.println("UPDATE PHIEUTRA SET TONTAI = 0 WHERE MAPHIEUTRA ='" + phieuTra.getMaPhieu() + "'");
        connectDB.closeConnect();
        return success;
    }

    // public boolean update(PhieuTra phieuTra) {
    // connectDB = new ConnectDB();
    // boolean success = true;
    // connectDB.sqlUpdate("UPDATE PHIEUTRA SET MANV='" + phieuTra.getMaNhanVien()
    // + "', MADG='" + phieuTra.getMaDocGia()
    // + "', MASA='" + phieuTra.getMaSach()
    // +
    // java.sql.Date.valueOf(nhanVien.getNgaySinh())
    // + "', SDT='" + nhanVien.getSoDienThoai()
    // //+ "', TONTAI='" + nhanVien.isTonTai()
    // + "' WHERE MANV ='" + phieuTra.getMaPhieu() + "'");
    // connectDB.closeConnect();
    // return success;
    // }
    public boolean loadDatafromPhieuMuon(String maphieumuon) {
        connectDB = new ConnectDB();
        boolean success = false;
        return success;
    }

}

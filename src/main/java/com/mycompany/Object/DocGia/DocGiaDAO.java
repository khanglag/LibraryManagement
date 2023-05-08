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

    public DocGiaDAO() {
    }

    ConnectDB connectDB;
    ArrayList<DocGia> dsDG = new ArrayList<DocGia>();

    public ArrayList<DocGia> readDB() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT * FROM DOCGIA WHERE TONTAI = 1";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    DocGia dg = new DocGia(rset.getNString("MADG"),
                            rset.getNString("TENDG"), rset.getNString("CCCD"), rset.getNString("PHAI"),
                            rset.getNString("SDT"), rset.getNString("DIACHI"), rset.getNString("MAPQ"),
                            rset.getDate("NGAYSINH").toLocalDate(), rset.getBoolean("TONTAI"));
                    dsDG.add(dg);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsDG;
    }

    public Boolean add(DocGia dg) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into DOCGIA(MADG,TENDG,CCCD,PHAI,NGAYSINH,SDT,DIACHI,MAPQ,TONTAI) values('"
                        + dg.getMaDocGia() + "','"
                        + dg.getTenDocGia() + "','"
                        + dg.getCCCD() + "','"
                        + dg.getGioiTinh() + "','"
                        + java.sql.Date.valueOf(dg.getNgaySinh()) + "','"
                        + dg.getSoDienThoai()
                        + "','" + dg.getDiaChi()
                        + "'," + dg.getMaPQ()
                        + ",'" + 1 + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(DocGia docGia) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE DOCGIA SET TONTAI = 0 WHERE MADG ='" + docGia.getMaDocGia() + "'");
        System.out.println("UPDATE DOCGIA SET TONTAI = 0 WHERE MADOCGIA ='" + docGia.getMaDocGia() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean update(DocGia docGia) {
        connectDB = new ConnectDB();
        boolean success = connectDB.sqlUpdate("UPDATE DOCGIA SET TENDG='" + docGia.getTenDocGia()
                + "', PHAI='" + docGia.getGioiTinh()
                + "', NGAYSINH='" + java.sql.Date.valueOf(docGia.getNgaySinh())
                + "', SDT='" + docGia.getSoDienThoai()
                + "', DIACHI='" + docGia.getDiaChi()
                + "' WHERE MADG ='" + docGia.getMaDocGia() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean hasID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from docgia where madg='" + id + "' and tontai = 1";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;

    }

    public ArrayList<DocGia> search(String maDocGia, String tenDocGia, String CCCD, String gioiTinh, String ngaySinh,
            String soDienThoai, String diaChi) {
        connectDB = new ConnectDB();
        ArrayList<DocGia> ketqua = new ArrayList<DocGia>();
        String qry = "SELECT * FROM DOCGIA WHERE TONTAI = 1";
        if (maDocGia.equals("") == false)
            qry += (" AND  MADG= '" + maDocGia + "'");
        if (tenDocGia.equals("") == false)
            qry += (" AND  TENDG= '" + tenDocGia + "'");
        if (CCCD.equals("") == false)
            qry += (" AND  CCCD= '" + CCCD + "'");
        if (gioiTinh.equals("") == false)
            qry += (" AND PHAI= '" + gioiTinh + "'");
        if (soDienThoai.equals("") == false)
            qry += (" AND SDT= '" + soDienThoai + "'");
        if (diaChi.equals("") == false)
            qry += (" AND DIACHI= '" + diaChi + "'");
        if (ngaySinh.equals("") == false)
            qry += (" AND NGAYSINH= '" + ngaySinh + "'");
        System.out.println(qry);
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    DocGia docGia = new DocGia(rset.getNString("MADG"),
                            rset.getNString("TENDG"), rset.getNString("CCCD"), rset.getNString("PHAI"),
                            rset.getNString("SDT"), rset.getNString("DIACHI"), rset.getNString("MAPQ"),
                            rset.getDate("NGAYSINH").toLocalDate(), rset.getBoolean("TONTAI"));
                    ketqua.add(docGia);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return ketqua;
    }

    public boolean addPhanQuyen(DocGia nhanVien) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into PHANQUYEN(MAPQ,TENQUYEN,TONTAI) values('"
                        + nhanVien.getMaPQ() + "','"
                        + "DOC GIA" + "','"
                        + 1 + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean editMaPQ(DocGia nhanVien) {
        connectDB = new ConnectDB();
        boolean success = true;
        connectDB.sqlUpdate("UPDATE DOCGIA SET MAPQ='" + nhanVien.getMaPQ()
                + "' WHERE MADG ='" + nhanVien.getMaDocGia() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean addTaiKhoan(DocGia nhanVien) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into taikhoan(tendn,matkhau,mapq,TONTAI) values('"
                        + nhanVien.getTendn() + "','"
                        + nhanVien.getMatkhau() + "','"
                        + nhanVien.getMaPQ() + "','"
                        + 1 + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean hasTenDN(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from taikhoan where tendn='" + id + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;

    }

}
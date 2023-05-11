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

    public NhanVienDAO() {
    }

    ConnectDB connectDB;
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public ArrayList<NhanVien> readDB() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM NHANVIEN WHERE TONTAI=1";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    NhanVien nhanVien = new NhanVien(rset.getNString("MANV"),
                            rset.getNString("TENNV"), rset.getNString("PHAI"), rset.getNString("CCCD"),
                            rset.getNString("DIACHI"), rset.getNString("SDT"), rset.getNString("MAPQ"),
                            rset.getDate("NGAYSINH").toLocalDate(), rset.getBoolean("TONTAI"));
                    dsNhanVien.add(nhanVien);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsNhanVien;
    }

    public Boolean add(NhanVien nhanVien) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into NHANVIEN(MANV,TENNV,PHAI,NGAYSINH,CCCD,SDT,DIACHI,MAPQ,TONTAI) values('"
                        + nhanVien.getMaNhanVien() + "','"
                        + nhanVien.getTenNhanVien() + "','"
                        + nhanVien.getGioiTinh() + "','"
                        + java.sql.Date.valueOf(nhanVien.getNgaySinh()) + "','"
                        + nhanVien.getChungMinhThu() + "','"
                        + nhanVien.getSoDienThoai() + "','"
                        + nhanVien.getDiaChi() + "',"
                        + nhanVien.getMaPQ() + ",'"

                        + 1 + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(NhanVien nhanVien) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANV ='" + nhanVien.getMaNhanVien() + "'");
        System.out.println("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANHANVIEN ='" + nhanVien.getMaNhanVien() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean update(NhanVien nhanVien) {
        connectDB = new ConnectDB();
        boolean success = true;
        connectDB.sqlUpdate("UPDATE NHANVIEN SET TENNV='" + nhanVien.getTenNhanVien()
                + "', PHAI='" + nhanVien.getGioiTinh()
                + "', NGAYSINH='" + java.sql.Date.valueOf(nhanVien.getNgaySinh())
                + "', SDT='" + nhanVien.getSoDienThoai()
                // + "', TONTAI='" + nhanVien.isTonTai()
                + "' WHERE MANV ='" + nhanVien.getMaNhanVien() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean hasEmployeeID(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from nhanvien where manv='" + id + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;

    }

    public boolean addPhanQuyen(NhanVien nhanVien) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into PHANQUYEN(MAPQ,TENQUYEN,TONTAI) values('"
                        + nhanVien.getMaPQ() + "','"
                        + nhanVien.getTenpq() + "','"
                        + 1 + "')");
        connectDB.closeConnect();
        return success;
    }

    public boolean editMaPQ(NhanVien nhanVien) {
        connectDB = new ConnectDB();
        boolean success = true;
        connectDB.sqlUpdate("UPDATE NHANVIEN SET MAPQ='" + nhanVien.getMaPQ()
                + "' WHERE MANV ='" + nhanVien.getMaNhanVien() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean addTaiKhoan(NhanVien nhanVien) {
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
}
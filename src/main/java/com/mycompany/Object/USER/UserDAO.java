/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import ConnectDB.ConnectDB;
import com.mycompany.controller.TaiKhoanController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 *
 * @author khang
 */
public class UserDAO {

    public UserDAO() {
    }

    ConnectDB connectDB;
    User user;

    ArrayList<User> listUser = new ArrayList<>();

    public ArrayList<User> readDB() {
        connectDB = new ConnectDB();

        try {
            if (TaiKhoanController.getNgdn() == 0) {
                String qry = "SELECT tendn,matkhau,manv,tennv,phai,NGAYSINH,CCCD,sdt,DIACHI,matkhau from nhanvien,phanquyen,taikhoan WHERE nhanvien.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ=taikhoan.MAPQ and taikhoan.TENDN="
                        + "'" + TaiKhoanController.getTendnString() + "'";
                ResultSet rset = connectDB.sqlQuery(qry);
                if (rset != null) {
                    while (rset.next()) {
                        user = new User(
                                rset.getNString("tendn"),
                                rset.getNString("MATKAHU"),
                                rset.getNString("MANV"),
                                rset.getNString("TENNV"), rset.getNString("PHAI"),
                                rset.getDate("NGAYSINH").toLocalDate(), rset.getString("CCCD"),
                                rset.getString("DIACHI"), rset.getString("SDT"));
                        listUser.add(user);
                    }
                }
            } else {
                String qry = "SELECT tendn,matkhau,madg,tendg,phai,NGAYSINH,CCCD,sdt,DIACHI from docgia,phanquyen,taikhoan WHERE docgia.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ=taikhoan.MAPQ and taikhoan.TENDN="
                        + "'" + TaiKhoanController.getTendnString() + "'";
                ResultSet rset = connectDB.sqlQuery(qry);
                if (rset != null) {
                    while (rset.next()) {
                        user = new User(
                                rset.getNString("tendn"),
                                rset.getNString("MATKHAU"),
                                rset.getNString("MADG"),
                                rset.getNString("TENDG"), rset.getNString("PHAI"),
                                rset.getDate("NGAYSINH").toLocalDate(), rset.getString("CCCD"),
                                rset.getString("SDT"), rset.getString("DIACHI"));
                        listUser.add(user);
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return listUser;
    }

    public boolean updateUser(User user) {
        connectDB = new ConnectDB();
        boolean success = false;
        if (TaiKhoanController.getNgdn() == 0) {
            connectDB.sqlUpdate("UPDATE NHANVIEN SET TENNV='" + user.getTenUser()
                    + "',PHAI='" + user.getGioiTinh()
                    + "',SDT='" + user.getSoDienThoai()
                    + "',NGAYSINH='" + java.sql.Date.valueOf(user.getNgaySinh())
                    + "',DIACHI='" + user.getDiaChi()
                    + "',WHERE MANV='" + user.getMaUser() + "'");
            success = true;
        } else {
            connectDB.sqlUpdate("UPDATE DOCGIA SET TENDG='" + user.getTenUser()
                    + "',PHAI='" + user.getGioiTinh()
                    + "',SDT='" + user.getSoDienThoai()
                    + "',NGAYSINH='" + java.sql.Date.valueOf(user.getNgaySinh())
                    + "',DIACHI='" + user.getDiaChi()
                    + "',WHERE MADG='" + user.getMaUser() + "'");
            success = true;
        }

        connectDB.closeConnect();
        return success;
    }

    public boolean changePassword(User user){
        connectDB = new ConnectDB();
        boolean success = true;
        connectDB.sqlUpdate("UPDATE TAIKHOAN SET MATKHAU='"+ user.getMatkhau() + "'");
        return success;
    }
}

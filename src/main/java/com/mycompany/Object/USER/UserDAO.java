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
                String qry = "SELECT tendn,manv,tennv,phai,NGAYSINH,CCCD,sdt,DIACHI from nhanvien,phanquyen,taikhoan WHERE nhanvien.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ=taikhoan.MAPQ and taikhoan.TENDN=" + "'" + TaiKhoanController.getTendnString() + "'";
                ResultSet rset = connectDB.sqlQuery(qry);
                if (rset != null) {
                    while (rset.next()) {
                        user = new User(rset.getNString("MANV"),
                                rset.getNString("TENNV"), rset.getNString("PHAI"),
                                rset.getDate("NGAYSINH").toLocalDate(), rset.getString("CCCD"),
                                rset.getString("DIACHI"), rset.getString("SDT"));
                        listUser.add(user);
                    }
                }
            }else{
                String qry = "SELECT madg,tendg,phai,NGAYSINH,CCCD,sdt,DIACHI from docgia,phanquyen,taikhoan WHERE docgia.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ=taikhoan.MAPQ and taikhoan.TENDN=" + "'" + TaiKhoanController.getTendnString() + "'";
                ResultSet rset = connectDB.sqlQuery(qry);
                if (rset != null) {
                    while (rset.next()) {
                        user = new User(rset.getNString("MADG"),
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
}

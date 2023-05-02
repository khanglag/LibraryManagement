/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import ConnectDB.ConnectDB;
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
            final String qry = "SELECT manv,tennv,phai,NGAYSINH,CCCD,sdt,DIACHI from nhanvien,phanquyen,taikhoan WHERE nhanvien.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ=taikhoan.MAPQ and taikhoan.TENDN=";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    user = new User(rset.getNString("MANV"),
                            rset.getNString("TENNV"), rset.getNString("PHAI"),
                            rset.getDate("NGAYSINH").toLocalDate(), rset.getString("CCCD"),
                            rset.getString("SDT"), rset.getString("DIACHI"));
                    listUser.add(user);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return listUser;
    }
}

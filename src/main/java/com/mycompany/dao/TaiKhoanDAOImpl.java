/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import ConnectDB.ConnectDB;
import com.mycompany.Object.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khang
 */
public class TaiKhoanDAOImpl implements TaiKhoanDAO {

    @Override
    public TaiKhoan login(String tenDangNhap, String matKhau) {
        ConnectDB conn = new ConnectDB();
        Connection cons = ConnectDB.getConnection();
        String sql = "SELECT * FROM taikhoan WHERE id LIKE ? AND password LIKE ?";
        TaiKhoan taiKhoan = null;
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                
                taiKhoan.setTenDangNhap(rs.getString("id"));
                taiKhoan.setMatKhau(rs.getString("password"));
                taiKhoan.setQuyen(rs.getString("quyen"));
                taiKhoan.setTonTai(rs.getBoolean("tonTai"));
                
            }
            ps.close();
            cons.close();
            return taiKhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

   

    

}

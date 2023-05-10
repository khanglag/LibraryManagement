/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.TheThuVien;

import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author khang
 */
public class TheThuVienDAO {
    public TheThuVienDAO() {

    }

    ConnectDB connectDB;
    ArrayList<TheThuVien> dsTheThuVien = new ArrayList<>();
    ArrayList<TheThuVien> ds = new ArrayList<>();

    public ArrayList<TheThuVien> readDB() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM THETHUVIEN WHERE TONTAI=1";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    TheThuVien the = new TheThuVien(rset.getNString("MATHE"),
                            rset.getNString("MADG"), rset.getNString("TENDG"),
                            rset.getDate("NGAYCAP").toLocalDate(), rset.getDate("HSD").toLocalDate(),
                            rset.getInt("TONTAI"));
                    dsTheThuVien.add(the);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsTheThuVien;

    }

    public ArrayList<TheThuVien> getNum() {
        connectDB = new ConnectDB();
        try {
            String qry = "SELECT *FROM THETHUVIEN";
            ResultSet rset = connectDB.sqlQuery(qry);
            if (rset != null) {
                while (rset.next()) {
                    TheThuVien the = new TheThuVien(
                            rset.getNString("MATHE"),
                            rset.getNString("MADG"),
                            rset.getNString("TENDG"),
                            rset.getDate("NGAYCAP").toLocalDate(),
                            rset.getDate("HSD").toLocalDate(),
                            rset.getInt("TONTAI"));
                    ds.add(the);
                }
            }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return ds;

    }

    public boolean hasTheThuVien(String id) {
        boolean result = false;
        connectDB = new ConnectDB();

        try {
            String qry = "Select * from thethuvien where madg='" + id + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            result = rset.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;

    }

    public Boolean add(TheThuVien the) {
        connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("insert into THETHUVIEN(MATHE,MADG,TENDG,NGAYCAP,HSD,TONTAI) values('"

                        + the.getMaThe() + "','"
                        + the.getMaDocGia() + "','"
                        + the.getTenDocGia() + "','"
                        + java.sql.Date.valueOf(the.getNgayCap()) + "','"
                        + java.sql.Date.valueOf(the.getHan()) + "',"
                        + 1 + ")");
        connectDB.closeConnect();
        return success;
    }

    public int getMaThe() {
        return getNum().size();
    }

}

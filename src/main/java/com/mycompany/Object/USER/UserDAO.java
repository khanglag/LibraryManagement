/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import ConnectDB.ConnectDB;
import java.util.ArrayList;

/**
 *
 * @author khang
 */
public class UserDAO {

    public UserDAO() {
    }
    
    ConnectDB connectDB;
    ArrayList<user> dsTacGia= new ArrayList<user>();
    public ArrayList<user> readDB(){
        connectDB= new ConnectDB();
        try {
            String qry="SELECT *FROM TACGIA";
            ResultSet rset= connectDB.sqlQuery(qry);
           if(rset!=null){
               while(rset.next()){
                   TacGia tacGia= new TacGia(rset.getNString("MATG"),
                           rset.getNString("TENTG"),rset.getNString("PHAI"),
                           rset.getDate("NGAYSINH").toLocalDate(),rset.getBoolean("TONTAI"));
                   dsTacGia.add(tacGia);
               }
           }
        } catch (SQLException e) {
            System.out.println("Loi");
        }
        connectDB.closeConnect();
        return dsTacGia;
    }
}

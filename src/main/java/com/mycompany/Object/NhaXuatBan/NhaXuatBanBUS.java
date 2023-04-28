/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.NhaXuatBan; 
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class NhaXuatBanBUS {
    ArrayList<NhaXuatBan> dsNXB = new ArrayList<NhaXuatBan>();
    NhaXuatBanDAO NXBDAO = new NhaXuatBanDAO();
    public NhaXuatBanBUS(){
        dsNXB=NXBDAO.readDB();
    }
    public ArrayList<NhaXuatBan> getDSNXB(){
        return dsNXB;
    }
}
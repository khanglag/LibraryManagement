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
    public ArrayList<NhaXuatBan> LoadData(){
        return dsNXB;
    }

    public String deleteNXB(NhaXuatBan nxb){
        if(NXBDAO.delete(nxb))
            return "Đã xoá";
        return "Không thể xoá";
    }

    public String addNXB(NhaXuatBan nxb) {
        if (NXBDAO.hasNXBID(nxb.getMaNXB()))
            return "Mã NXB đã tồn tại";
        if (NXBDAO.add(nxb))
            return "Thêm thành công";
        return "Thêm thất bại";
    }
}